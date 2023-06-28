package com.amazon.stepdefinitions;

import com.amazon.tasks.CambiarIdioma;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.VERIFICAR_IDIOMA;

public class CambiarIdiomaStepDefinitions {
    @Cuando("cambio idioma de amazon")
    public void cambiarIdioma() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/"),
                CambiarIdioma.buscarBotonCambiarIdioma(),
                CambiarIdioma.buscarBotonES(),
                CambiarIdioma.buscarBotonGuardar()
        );
    }

    @Entonces("la pagina se ve en otro idioma")
    public void paginaES() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(VERIFICAR_IDIOMA).isEnabled()
        );
    }
}
