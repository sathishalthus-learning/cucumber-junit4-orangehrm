package org.cucumber.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features="@target/failed_scenarios.txt",
					glue="org.cucumber",
					plugin = {"pretty","html:target/reports/rerunhtmlreport.html"},
					publish = false,
					dryRun = false,
					monochrome = true
				)
public class CucumberTestRerun {

}
