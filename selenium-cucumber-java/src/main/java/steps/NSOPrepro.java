package steps;

import io.cucumber.java.en.*;
import org.sikuli.script.FindFailed;
import pages.NSOPreproPage;

public class NSOPrepro {
    NSOPreproPage nsoPreproPage = new NSOPreproPage();

    @Given("^Se visualiza el ícono de acceso directo de NSO$")
    public void se_visualiza_el_ícono_de_acceso_directo_de_nso() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        nsoPreproPage.findNSOPreproDirectAccess();
    }
    @When("^Se da doble clic en el ícono de acceso directo de NSO$")
    public void se_da_doble_clic_en_el_ícono_de_acceso_directo_de_nso() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        nsoPreproPage.doubleclickInNSOPreproDirectAccess();
    }
    @And("^Se da clic en el botón Yes de la ventana user account control$")
    public void se_da_clic_en_el_botón_yes_de_la_ventana_user_account_control() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        nsoPreproPage.acceptUserAccountControl();

    }
    @And("^Se ingresan los datos de usuario (.+) y contraseña (.+)$")
    public void se_ingresan_los_datos_de_usuario_y_contraseña(String user, String password) throws FindFailed, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        nsoPreproPage.logIn(user, password);

    }
    @And("^Se da clic en el botón Aceptar en la pantalla del login de NSO$")
    public void se_da_clic_en_el_botón_aceptar_en_la_pantalla_del_login_de_nso() throws FindFailed {
        // Write code here that turns the phrase above into concrete actions
        nsoPreproPage.clickInAcceptButtonOfLoginNSOPrepro();
    }
    @And("^Se selecciona en el catálogo la cartera (.+) y se da clic en aceptar$")
    public void catalogueSelect(String cartera) throws FindFailed {
        nsoPreproPage.selectCatalogue(cartera);


    }
    @Then("^Se visualiza la terminal de NSO$")
    public void se_visualiza_la_terminal_de_nso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
