package runner;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "steps"

)
public class runner {
}
