package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\Komal\\workspace\\BDDFramework\\src\\main\\java\\Features\\tagging.feature",
			glue={"stepDefinations"},
			format={"pretty","html:test-output","json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml"},
			dryRun=false,
			monochrome=true,
			strict = true,
			tags = {"SmokeTest"}
			
			)

public class TestRunner {

}
