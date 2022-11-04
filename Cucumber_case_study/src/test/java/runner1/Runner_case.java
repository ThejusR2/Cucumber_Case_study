package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login_case/case.feature"},glue = {"definition1"},tags = "@Negativetesting")
public class Runner_case{

}
