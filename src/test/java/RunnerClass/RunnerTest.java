package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		tags="",
		features= {"src/test/resources/Features"},
		glue= {"StepDefinations"},
		plugin= {"pretty", "html:target/htmlreport.html"}
)
public class RunnerTest  extends AbstractTestNGCucumberTests{

}
