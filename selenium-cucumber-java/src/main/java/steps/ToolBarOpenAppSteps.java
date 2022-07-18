package steps;


import io.cucumber.java.en.*;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import pages.ToolBarOpenApp;

import java.io.IOException;


public class ToolBarOpenAppSteps {
    ToolBarOpenApp toolBarOpenApp = new ToolBarOpenApp();



    @Given("^Estamos en un sistema operativo Windows$")
    public void validateSOWindows() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^Presionamos la tecla windows$")
    public void sendWindowsKey() throws FindFailed, IOException {
        // Write code here that turns the phrase above intthrow new io.cucumber.java.PendingException();
        toolBarOpenApp.windowsKey(Key.WIN);

    }
    @And("^Escribimos (.+)$")
    public void sendKeysAplicationName(String keys) throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarOpenApp.writeKeys(keys);


    }
    @And("^Damos enter$")
    public void sendEnterKey() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarOpenApp.enterKey(Key.ENTER);

    }
    @Then("^Se abre una ventana con el nombre (.+)$")
    public void validateApplication() {
        // Write code here that turns the phrase above into concrete actions

    }
}
