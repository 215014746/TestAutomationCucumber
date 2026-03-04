package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
         features = {

        "src/test/resources/features/Signup.feature",
        "src/test/resources/features/Login.feature"
        //"src/test/resources/features/AdminPanel.feature"
        },
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},

        monochrome = true,
        publish = true
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}
