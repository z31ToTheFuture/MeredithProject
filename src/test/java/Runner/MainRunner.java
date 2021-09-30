package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "Steps",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class MainRunner {
}
