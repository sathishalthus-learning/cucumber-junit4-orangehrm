package org.cucumber.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features="src/test/resources/features",
					glue="org.cucumber",
					plugin = {"pretty","html:target/reports/htmlreport.html",
							"rerun:target/failed_scenarios.txt"}
					publish = false,
					dryRun = false,
					monochrome = true,
					tags = "@tag1"
				)
public class CucumberTest {

}
