package Utils;

import Pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/#overview");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    public AdminPanelPage admimPanelPage = PageFactory.initElements(driver, AdminPanelPage.class);

}
