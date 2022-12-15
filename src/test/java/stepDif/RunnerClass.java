package stepDif;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/myFirstFile.feature",
glue = {"stepDif"})
public class RunnerClass {

}
