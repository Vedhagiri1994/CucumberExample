package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="FeaturesFiles",
		glue={"stepDefinition","hooks"},
		dryRun=false,
		strict=true,
		monochrome=true,
		plugin={"html:report/WebReport","json:report/jsonReport.json"},
		tags={"@BackgroundExample"})

public class RunnerClass { 
	
}
