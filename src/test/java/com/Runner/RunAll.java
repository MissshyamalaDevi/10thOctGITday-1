package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue= "com.StepDefinition", monochrome=true, 
dryRun=false, strict=true, tags= {"@Regression and @Login"})

public class RunAll {

	
}