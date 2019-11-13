package Runner;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
				monochrome = true,
				features = {"src/test/java/Features"},
				glue = {"Implementation"},
				tags = {"@Baba"},
				plugin = {
		        "pretty",
		        "usage:target/cucumber-reports/cucumber-usage.json",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/cucumber.json",
		        "pretty:target/cucumber-reports/cucumber-pretty.txt",
		        "usage:target/cucumber-reports/cucumber-usage.json"
				}
		)
public class CucumberSerenityRunnerTest //extends AbstractTestNGCucumberTests {
{
	
}
