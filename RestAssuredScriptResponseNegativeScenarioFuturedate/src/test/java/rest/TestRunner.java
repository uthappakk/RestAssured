package rest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Stepdef/Negfutrdt.feature",glue="setpdefinition")
public class TestRunner {

}
