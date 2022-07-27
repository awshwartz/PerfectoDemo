package DHS;


import com.perfecto.reportium.test.result.TestResult;
import com.perfecto.reportium.test.result.TestResultFactory;
import com.perfecto.sampleproject.PerfectoLabUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.PerfectoElements;

import java.util.concurrent.TimeUnit;


import static org.testng.Assert.assertTrue;

public class dhsHomeTest extends CommonMethods {
    @Test
    public void DHSHomeTest() throws Exception {
        //Open browser and navigate to DHS Home Page
        openBrowserAndLaunchApplication();
        //Verify the title is correct to make sure we are on the right page
        getTitle();
        //close the browser after test is complete
        closeBrowser();
        //Run the same test using the remote Perfecto Connection
        GetTitleRemoteWindows();
        //navigate to DHS using the Remote connection with Perfecto
        //Establish remote Mobile Connection
        establishRemoteConnectionAndroid();
        checkAccess();
        //close browser
        //closeBrowser();
    }
    /*
    @AfterMethod
    public void afterMethod(ITestResult result) throws Exception {
        PerfectoElements perfectoElements = new PerfectoElements();
        //STOP TEST
        TestResult testResult = null;

        if(result.getStatus() == result.SUCCESS) {
            testResult = TestResultFactory.createSuccess();
        }
        else if (result.getStatus() == result.FAILURE) {
            testResult = TestResultFactory.createFailure(result.getThrowable());
        }
        perfectoElements.reportiumClient = PerfectoLabUtils.setReportiumClient(perfectoElements.remoteWebDriver, perfectoElements.reportiumClient);
        perfectoElements.reportiumClient.testStop(testResult);
        // Retrieve the URL to the DigitalZoom Report
        String reportURL = perfectoElements.reportiumClient.getReportUrl();
        System.out.println(reportURL);
    }
     */
}
