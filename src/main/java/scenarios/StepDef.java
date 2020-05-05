package scenarios;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDef {
    @Given("A precondition which takes no parameters")
    public void precondition() {
        System.out.format("Thread ID - %2d - is executing the scenario.\n",
                Thread.currentThread().getId());
    }

    @When("^An action with an inline parameters (.+) and (.+)$")
    public void user_action(String param1,  String param2) {
        System.out.format("Accepted the inline parameters %s and %s \n", param1, param2);
    }

    @When("An outcome with parameter as a table of names")
    public void user_action_table(DataTable dataTable) {
        List<Map<String, String>> table = dataTable.asMaps();
        for (Map<String, String> item : table) {
            System.out.format("First Name : %s and Last Name is : %s" +
                    "\n", item.get("First Name"), item.get("Last Name"));
        }
    }

    @Then("An outcome with parameter as a paragraph")
    public void outcome(String paragraph) {
        System.out.println(paragraph + "\n ------------------------------------------------------");
    }

}
