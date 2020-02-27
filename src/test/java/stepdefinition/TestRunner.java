package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "features",
        glue = {"stepdefinition"},
        // strict = fals,
        dryRun = true,
        tags = {"@Smoke"}

)
public class TestRunner extends AbstractTestNGCucumberTests {


}
