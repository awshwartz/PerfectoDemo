package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='Topics']")
    public WebElement topicsBtn;

    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='News']")
    public WebElement newsBtn;

    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='In Focus']")
    public WebElement inFocusBtn;

    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='How Do I?']")
    public WebElement howBtn;

    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='Get Involved']")
    public WebElement getInvolvedBtn;

    @FindBy (xpath="//button[@class='usa-accordion__button usa-nav__link ']/child::span[text()='About DHS']")
    public WebElement aboutBtn;

    @FindBy (xpath="//input[@id='gsc-i-id1']")
    public WebElement searchBar;

    @FindBy (xpath="//a[@href'https://www.schoolsafety.gov']")
    public WebElement schlSafeBtn;

    @FindBy (xpath="//ul[@class='usa-nav__primary usa-accordion']")
    public List<WebElement> dashTabs;

    @FindBy (xpath="/html/body/div[1]/main/div/div[2]/div/div/div[2]/article/div/div[1]")
    public WebElement slickSlide;

    @FindBy (xpath="/html/body/div[1]/section/div/header/div/button/span")
    public WebElement bannerLink;

    @FindBy (xpath="/html/body/div[1]/header/div/div/div/div/div[1]/a/img")
    public WebElement logo;

    @FindBy (xpath="/html/body/div[1]/div[3]/footer/div[1]/a")
    public WebElement returnToTop;

    public String titleHome = "Home | Homeland Security";

}
