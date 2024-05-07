package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/feature", 
		glue = {"stepdefinationfile"}, 
		tags = "@test-1, @Regression", 
		dryRun = false, monochrome = true)

public class TestRunner {
}
