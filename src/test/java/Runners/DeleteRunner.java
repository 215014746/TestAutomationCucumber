package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/DeleteUser.feature",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports-delete.html"},
        monochrome = true,
        publish = true
)

public class DeleteRunner extends AbstractTestNGCucumberTests {
}