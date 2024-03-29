package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"org.example.stepdefs", "hooks"},
                 plugin = {"pretty", "html: target_reports/cucumber-reports", "json: target_reports/cucumber.json"},
                 monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}



