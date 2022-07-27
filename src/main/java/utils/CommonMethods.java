package utils;

import Pages.PageInitializer;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.sampleproject.PerfectoLabUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static utils.constants.driver;

public class CommonMethods extends PageInitializer {
    public static void openBrowserAndLaunchApplication(){
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("https://www.dhs.gov");
        initializePageObjects();
    }
    public static void getTitle(){
        String aTitle = driver.getTitle();
        System.out.println(aTitle);
        assertTrue(aTitle.equals(homePage.titleHome), "Title verified as expected");

    }
    public static void checkAccess(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //declare the Map for script parameters
        Map<String, Object> params = new HashMap<>();

        params.put("tag", "login-screen");
        js.executeScript("mobile:checkAccessibility:audit", params);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void GetTitleRemoteWindows() throws Exception {
        //establish instance of PerfectElements
        PerfectoElements perfectoElements = new PerfectoElements();
        //Web: Make sure to Auto generate capabilities for device selection: https://developers.perfectomobile.com/display/PD/Select+a+device+for+manual+testing#Selectadeviceformanualtesting-genCapGeneratecapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "103");
        capabilities.setCapability("location", "US East");
        capabilities.setCapability("resolution", "1024x768");

        // The below capability is mandatory. Please do not replace it.
        capabilities.setCapability("securityToken", PerfectoLabUtils.fetchSecurityToken(perfectoElements.securityToken));

        perfectoElements.remoteWebDriver= new RemoteWebDriver(new URL("https://" + PerfectoLabUtils.fetchCloudName(perfectoElements.cloudName) + ".perfectomobile.com/nexperience/perfectomobile/wd/hub"), capabilities);
        perfectoElements.remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        perfectoElements.remoteWebDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        perfectoElements.reportiumClient = PerfectoLabUtils.setReportiumClient(perfectoElements.remoteWebDriver, perfectoElements.reportiumClient); //Creates reportiumClient
        perfectoElements.reportiumClient.testStart("Perfecto desktop web test", new TestContext("tag2", "tag3")); //Starts the reportium test
        perfectoElements.reportiumClient.stepStart("browser navigate to perfecto"); //Starts a reportium step
        perfectoElements.remoteWebDriver.get("https://www.dhs.gov");
        perfectoElements.reportiumClient.stepEnd();
        perfectoElements.reportiumClient.stepStart("Verify title");
        String aTitle = perfectoElements.remoteWebDriver.getTitle();
        PerfectoLabUtils.assertTitle(aTitle, perfectoElements.reportiumClient); //compare the actual title with the expected title
        perfectoElements.reportiumClient.stepEnd();
        perfectoElements.remoteWebDriver.close();
        perfectoElements.remoteWebDriver.quit();
    }




    public static void establishRemoteConnectionAndroid() throws Exception{
        //establish instance of PerfectElements
        PerfectoElements perfectoElements = new PerfectoElements();
        DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("location", "NA-US-BOS");
        capabilities.setCapability("resolution", "1440x3040");
        capabilities.setCapability("manufacturer", "Samsung");
        capabilities.setCapability("model", "Galaxy S10\\+");

        // The below capability is mandatory. Please do not replace it.
        capabilities.setCapability("securityToken", PerfectoLabUtils.fetchSecurityToken(perfectoElements.securityToken));


        perfectoElements.remoteWebDriver= new RemoteWebDriver(new URL("https://" + PerfectoLabUtils.fetchCloudName(perfectoElements.cloudName) + ".perfectomobile.com/nexperience/perfectomobile/wd/hub"), capabilities);
        perfectoElements.remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        perfectoElements.remoteWebDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        perfectoElements.reportiumClient = PerfectoLabUtils.setReportiumClient(perfectoElements.remoteWebDriver, perfectoElements.reportiumClient); //Creates reportiumClient
        perfectoElements.reportiumClient.testStart("Perfecto desktop web test", new TestContext("tag2", "tag3")); //Starts the reportium test
        perfectoElements.reportiumClient.stepStart("browser navigate to perfecto"); //Starts a reportium step
        perfectoElements.remoteWebDriver.get("https://www.dhs.gov");
        perfectoElements.reportiumClient.stepEnd();
    }





}
