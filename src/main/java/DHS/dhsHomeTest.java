package DHS;


import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResult;
import com.perfecto.reportium.test.result.TestResultFactory;
import com.perfecto.sampleproject.PerfectoLabUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.PerfectoElements;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import static org.testng.Assert.assertTrue;

public class dhsHomeTest extends CommonMethods {
    @Test
    public void DHSHomeTestiOS() throws Exception{
        String browserName = "safari";
        DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.3");
        capabilities.setCapability("platformBuild", "18C66");
        capabilities.setCapability("location", "NA-US-BOS");
        capabilities.setCapability("resolution", "1125x2436");
        capabilities.setCapability("accountName", "dev1");
        capabilities.setCapability("deviceStatus", "CONNECTED");
        capabilities.setCapability("manufacturer", "Apple");
        capabilities.setCapability("model", "iPhone-11 Pro");

        // The below capability is mandatory. Please do not replace it.
        capabilities.setCapability("securityToken", PerfectoLabUtils.fetchSecurityToken(securityToken));

        /*
            In order to divide up the individual steps in the report, make sure you make use of:
             reportiumClient.stepStart("Name of the step");
             and
             reportiumClient.stepEnd();
             Anything outside of these steps will still run, but will not be highlighted in the report
        */

        remoteWebDriver = new RemoteWebDriver(new URL("https://" + PerfectoLabUtils.fetchCloudName(cloudName) + ".perfectomobile.com/nexperience/perfectomobile/wd/hub"), capabilities);
        remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        remoteWebDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) remoteWebDriver;


        reportiumClient = PerfectoLabUtils.setReportiumClient(remoteWebDriver, reportiumClient); //Creates reportiumClient
        reportiumClient.testStart("Perfecto Android Accessibility Test", new TestContext("tag2", "tag3")); //Starts the reportium test
        reportiumClient.stepStart("browser navigate to dhs"); //Starts a reportium step
        remoteWebDriver.get(dhsHomePage);
        reportiumClient.stepEnd();

        //These next three lines are the code that actually activate Accessibilty Scanner, take a screenshot, and generate a JSON Report. Copy and paste this code when you need to actually run the scanner
        reportiumClient.stepStart("Check access");
        checkAccess(js, "Home part 1");
        reportiumClient.stepEnd();

        initializePageObjects(remoteWebDriver);

        reportiumClient.stepStart("Scroll to second part of Home page");
        js.executeScript("arguments[0].scrollIntoView();", homePage.schoolSafeBtn);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Home part 2");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to third part of Home page");
        js.executeScript("arguments[0].scrollIntoView();", homePage.newsUpdates);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Home part 3");
        reportiumClient.stepEnd();

        //Navigate to Border-Security portion of DHS Website
        reportiumClient.stepStart("Navigate to CS page");
        remoteWebDriver.get(dhsCyberSecurityPage);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Cyber Security part 1");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to second part of CS page");
        js.executeScript("window.scrollBy(0, 800)");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Cyber Security part 2");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to third part of BS page");
        js.executeScript("window.scrollBy(0, 800)");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check Access");
        //declare the Map for script parameters
        checkAccess(js, "Border security part 3");
        reportiumClient.stepEnd();


    }

    @Test
    public void DHSHomeTestAndroid() throws Exception {
        String browserName = "mobileOS";
        DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("platformBuild", "SQ3A.220605.009.A1");
        capabilities.setCapability("location", "NA-US-BOS");
        capabilities.setCapability("resolution", "1080x2280");
        capabilities.setCapability("deviceStatus", "CONNECTED");
        capabilities.setCapability("manufacturer", "Google");
        capabilities.setCapability("model", "Pixel 4");

        // The below capability is mandatory. Please do not replace it.
        capabilities.setCapability("securityToken", PerfectoLabUtils.fetchSecurityToken(securityToken));

        remoteWebDriver = new RemoteWebDriver(new URL("https://" + PerfectoLabUtils.fetchCloudName(cloudName) + ".perfectomobile.com/nexperience/perfectomobile/wd/hub"), capabilities);
        remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        remoteWebDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) remoteWebDriver;

        /*
            In order to divide up the individual steps in the report, make sure you make use of:
             reportiumClient.stepStart("Name of the step");
             and
             reportiumClient.stepEnd();
             Anything outside of these steps will still run, but will not be highlighted in the report
        */

        reportiumClient = PerfectoLabUtils.setReportiumClient(remoteWebDriver, reportiumClient); //Creates reportiumClient
        reportiumClient.testStart("Perfecto Android Accessibility Test", new TestContext("tag2", "tag3")); //Starts the reportium test
        reportiumClient.stepStart("browser navigate to dhs"); //Starts a reportium step
        remoteWebDriver.get(dhsHomePage);
        reportiumClient.stepEnd();

        //These next three lines are the code that actually activate Accessibilty Scanner, take a screenshot, and generate a JSON Report. Copy and paste this code when you need to actually run the scanner
        reportiumClient.stepStart("Check access");
        checkAccess(js, "Home part 1");
        reportiumClient.stepEnd();

        initializePageObjects(remoteWebDriver);

        reportiumClient.stepStart("Scroll to second part of Home page");
        js.executeScript("arguments[0].scrollIntoView();", homePage.schoolSafeBtn);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Home part 2");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to third part of Home page");
        js.executeScript("arguments[0].scrollIntoView();", homePage.newsUpdates);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Home part 3");
        reportiumClient.stepEnd();

        //Navigate to Border-Security portion of DHS Website
        reportiumClient.stepStart("Navigate to CS page");
        remoteWebDriver.get(dhsCyberSecurityPage);
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Cyber Security part 1");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to second part of CS page");
        js.executeScript("window.scrollBy(0, 800)");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check access");
        //declare the Map for script parameters
        checkAccess(js, "Cyber Security part 2");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Scroll to third part of BS page");
        js.executeScript("window.scrollBy(0, 800)");
        reportiumClient.stepEnd();

        reportiumClient.stepStart("Check Access");
        //declare the Map for script parameters
        checkAccess(js, "Border security part 3");
        reportiumClient.stepEnd();



    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws Exception {
        //STOP TEST
        TestResult testResult = null;

        if(result.getStatus() == result.SUCCESS) {
            testResult = TestResultFactory.createSuccess();
        }
        else if (result.getStatus() == result.FAILURE) {
            testResult = TestResultFactory.createFailure(result.getThrowable());
        }
        reportiumClient = PerfectoLabUtils.setReportiumClient(remoteWebDriver, reportiumClient);

        reportiumClient.testStop(testResult);
        // Retrieve the URL to the DigitalZoom Report
        remoteWebDriver.close();
        remoteWebDriver.quit();
        String reportURL = reportiumClient.getReportUrl();
        System.out.println(reportURL);
    }

}
