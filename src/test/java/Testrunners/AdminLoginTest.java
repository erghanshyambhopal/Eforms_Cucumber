package Testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/loginn.feature",glue="Stepdefinitions",dryRun=false)

public class AdminLoginTest {

}
