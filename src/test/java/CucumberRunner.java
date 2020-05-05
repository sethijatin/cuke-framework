import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        plugin = {"json:./reports.json"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void beforeSetup() {
        System.out.println("I did run!");
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterTest
    public void afterSetup() {
        System.out.println("I did run after!");
    }
}