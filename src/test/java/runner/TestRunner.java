package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/faeture",glue="stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{
// testing
	
}

