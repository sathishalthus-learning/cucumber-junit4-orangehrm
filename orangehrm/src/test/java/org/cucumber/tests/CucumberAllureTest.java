package org.cucumber.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features="src/test/resources/features/home.feature",
					glue="org.cucumber",
					plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
				)
public class CucumberAllureTest {

}

