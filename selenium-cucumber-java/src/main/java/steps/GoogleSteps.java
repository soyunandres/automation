package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    @Given("^Ingresamos a la página de google$")
    public void navigateToGoogle (){
        google.navigateToGoogle();

    }
    @When("^Esccribimos algo en la barra de búsqueda$")
    public void enterSearchCriteria (){
        google.enterSearchCriteria("Google");
    }

    @And("^Damos enter a la barra de google$")
    public void clickSearchButton (){
        google.clickGoogleSearch();
    }
    @Then("^Nos muestra los resultados de la búsqueda$")
    public void validateResults (){
    }

}
