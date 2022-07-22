package steps;


import io.cucumber.java.en.*;
import org.sikuli.script.FindFailed;
import pages.RemoteDesktopPage;


public class RemoteDesktopSteps {
    RemoteDesktopPage remoteDesktopPage = new RemoteDesktopPage();
    @Given("^La ventana con la conexión al escritorio remoto está abierta$")
    public void remoteDesktopIsOpen() throws FindFailed {

        // Write code here that turns the phrase above into concrete actions
        remoteDesktopPage.openRemoteDesktop();

    }
    @When("^Doy clic en el botón Conectar al escritorio remoto$")
    public void conectionToRemoteDesktop() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        remoteDesktopPage.conectionToRemoteDesktop();

    }
    @And("^Doy clic en el botón conectar en la ventana de confianza de la conexión remota$")
    public void conectionToConfidenceConection() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        remoteDesktopPage.conectionToConfidenceConection();

    }
    @And("Doy clic en el botón sí en la ventana de la confirmación del certificado de escritorio remoto")
    public void acceptCertifateOfConection() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        remoteDesktopPage.conectWithCertificate();
    }
    @Then("Se muestra el escritorio del equipo remoto")
    public void showTheRemoteDesktop() throws FindFailed, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        remoteDesktopPage.screenOfTheRemoteDesktop();
        Thread.sleep(3000);
        remoteDesktopPage.moveDownVerticalBar();
    }

}
