package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepdefination"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        //tags = "@smoke",
        monochrome = true

)

public class test {
}






