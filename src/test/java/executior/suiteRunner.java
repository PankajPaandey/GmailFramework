package executior;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\admin\\Automation\\gmail_framework\\src\\test\\resources\\Feature\\login.feature"
		,glue= "Keywords"
		,plugin ={"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
		monochrome=true,
		strict=true,
		dryRun=false
		)


public class suiteRunner {

}
