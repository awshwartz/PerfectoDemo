package DHS;

import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class dhsTestUsingTemplate {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("Run started");

        String browserName = "mobileOS";
        DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
        // TODO: change your cloud url
        String host = "trial.perfectomobile.com";
        // TODO: change your security Token
        capabilities.setCapability("securityToken", "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NTgxMDE2NDUsImp0aSI6IjNhODliN2M1LTg5YjAtNDI1YS04YjFjLTZjNWQyYmFhMDhmMCIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6ImY3Yjg0ZTc5LTYxOGMtNDcxYi04MDAzLTlmNjRlZmVkMDYzMSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiM2IzNmRlODctZjBkOS00ZGRlLThlNmQtZWFiNzU0NjBhMDA5Iiwic2Vzc2lvbl9zdGF0ZSI6IjNkYTJkMWJkLTkyMzUtNDE3NC05ZjVlLTA3YzdkNTNkMDRmNCIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.sxnQtFj95N1p3_YrJ4D5fd5k2gc8vbG8gKA1VEAM1bM");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");

        // Application settings examples.
        // capabilities.setCapability("app", "PRIVATE:applications/Errands.ipa");
        // For Android:
        // capabilities.setCapability("appPackage", "com.google.android.keep");
        // capabilities.setCapability("appActivity", ".activities.BrowseActivity");
        // For iOS:
        // capabilities.setCapability("bundleId", "com.yoctoville.errands");

        // Add a persona to your script (see https://community.perfectomobile.com/posts/1048047-available-personas)
        //capabilities.setCapability(WindTunnelUtils.WIND_TUNNEL_PERSONA_CAPABILITY, WindTunnelUtils.GEORGIA);

        // Name your script
        // capabilities.setCapability("scriptName", "AppiumTest");

        AndroidDriver driver = new AndroidDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"),
                capabilities);
// IOSDriver driver = new IOSDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

// Reporting client. For more details, see http://developers.perfectomobile.com/display/PD/Reporting
        PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
                .withProject(new Project("My Project", "1.0")).withJob(new Job("My Job", 45)).withContextTags("tag1")
                .withWebDriver(driver).build();
        ReportiumClient reportiumClient = new ReportiumClientFactory()
                .createPerfectoReportiumClient(perfectoExecutionContext);

        try {
            reportiumClient.testStart("My test name", new TestContext("tag2", "tag3"));

// write your code here

// reportiumClient.testStep("step1"); // this is a logical step for reporting
// add commands...
// reportiumClient.testStep("step2");
// more commands...

            reportiumClient.testStop(TestResultFactory.createSuccess());
        } catch (Exception e) {
            reportiumClient.testStop(TestResultFactory.createFailure(e.getMessage(), e));
            e.printStackTrace();
        } finally {
            try {
                driver.quit();
                System.out.println(reportiumClient.getReportUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Run ended");
    }
}

