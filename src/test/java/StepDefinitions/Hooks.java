package StepDefinitions;

    import Utils.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

    public class Hooks extends Base {

        @Before
        public void setUp() {
            initializeBrowser();
        }

        @After
        public void tearDown() {
            driver.quit();
        }
}
