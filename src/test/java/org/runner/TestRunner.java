package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:C:\\Users\\admin\\eclipse-workspace\\CucumberDay1\\AllReports\\htmlReports",
		"json:C:\\Users\\admin\\eclipse-workspace\\CucumberDay1\\AllReports\\jsonReports\\fb.json",
		"junit:C:\\Users\\admin\\eclipse-workspace\\CucumberDay1\\AllReports\\junitReports\\facebook.xml",
		"rerun:C:\\Users\\admin\\eclipse-workspace\\CucumberDay1\\Rerun\\failed.txt"})
public class TestRunner {

	@AfterClass

	public static void Report() {

		JVMReport.generateReports(System.getProperty("user.dir") + "\\AllReports\\jsonReports\\fb.json");

	}

}
