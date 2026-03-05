package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports-login.html"},
        monochrome = true,
        publish = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
