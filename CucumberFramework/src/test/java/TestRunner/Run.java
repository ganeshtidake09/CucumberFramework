package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/LoginFeature.feature",
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
	
		)

public class Run 
{
	/*This clss will be empty*/

}
