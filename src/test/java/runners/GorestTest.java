package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features ={ "classpath:features"},
            glue = {"step_defs"},
            dryRun = false,
            tags = {"@Test2"}

    )
    public class GorestTest {
    }


// features = {"classpath:features"},
//         glue = {"step_definitions"},
//         dryRun = false,
//         tags = {"@Test1"}
