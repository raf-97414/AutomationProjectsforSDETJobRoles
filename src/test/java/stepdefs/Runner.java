package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginconnect.feature"}, glue = {"stepdefs"}, plugin = {"pretty,html:target/cucumber.html"},dryRun = false)
public class Runner extends AbstractTestNGCucumberTests {
}
