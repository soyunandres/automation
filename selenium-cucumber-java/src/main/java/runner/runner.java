package runner;

import io.cucumber.junit.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "steps",
        tags = "@toolbaropenapp"

)
public class runner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeDriver();
    }
}

