package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.tasks.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.*;

public class UtestStepDefinition {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Un usuario quiere registrarse en la pagina de Utest$")
    public void unUsuarioQuiereRegistrarseEnLaPaginaDeUtest() {
        //OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thepage(), (Login.onThePage()));
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thepage(), (Register.onThePage()));
    }
}
