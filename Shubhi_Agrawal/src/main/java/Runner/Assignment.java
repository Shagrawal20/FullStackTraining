package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/resources/Cucumber", glue = { "stepdefinition" }, tags="@UserAPI")

public class Assignment {

}
