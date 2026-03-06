package StepDefinitions;

    import Utils.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
    import io.cucumber.java.Scenario;
    import org.openqa.selenium.OutputType;
    import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base {

        @Before
        public void setUp() {
            initializeBrowser();
        }

        @After
        public void tearDown(Scenario scenario) {

            // Take screenshot only if scenario fails
            if (scenario.isFailed()) {

                byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot, "image/png", scenario.getName());
            }

            driver.quit();
        }

}
