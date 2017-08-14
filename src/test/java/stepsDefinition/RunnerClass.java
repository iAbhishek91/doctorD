package stepsDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/featureFiles"},
		format = {"pretty","html:target/Reports"},
		glue = {"stepsDefinition"}
		)

public class RunnerClass {

}
