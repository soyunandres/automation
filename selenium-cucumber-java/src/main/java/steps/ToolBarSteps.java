package steps;


import io.cucumber.java.en.*;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import pages.ToolBarPage;

import java.io.IOException;


public class ToolBarSteps {
    ToolBarPage toolBarPage = new ToolBarPage();



    @Given("^Estamos en un sistema operativo Windows$")
    public void validateSOWindows() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarPage.findWindowsButton();

    }
    @When("^Presionamos la tecla windows$")
    public void sendWindowsKey() throws FindFailed, IOException {
        // Write code here that turns the phrase above intthrow new io.cucumber.java.PendingException();
        toolBarPage.windowsKey(Key.WIN);

    }
    @And("^Escribimos (.+) en el cuadro de búsqueda$")
    public void sendKeysAplicationName(String keys) throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarPage.writeKeys(keys);


    }
    @And("^Damos enter$")
    public void sendEnterKey() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarPage.enterKey(Key.ENTER);

    }
    @Then("^Se abre una ventana con la aplicación$")
    public void validateApplication() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        toolBarPage.findRemoteDesktopConection();

    }
}
