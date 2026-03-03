package Utils;

import Pageobjects.HomePage;
import Pageobjects.LoginPage;
import Pageobjects.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);

}
