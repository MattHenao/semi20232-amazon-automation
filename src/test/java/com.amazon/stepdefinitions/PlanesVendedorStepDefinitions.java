package com.amazon.stepdefinitions;

import com.amazon.tasks.PlanesVendedor;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.SellPage.VERIFY_PLAN_PAGE;

public class PlanesVendedorStepDefinitions {
    @Cuando("busco plan de vendedor")
    public void buscarPlanesVendedor() {
        OnStage.theActorCalled("vendedor").attemptsTo(
                Open.url("https://www.amazon.com/"),
                PlanesVendedor.botonSellProduct(),
                PlanesVendedor.botonCost(),
                PlanesVendedor.botonComparision()
        );
    }

    @Entonces("miro los planes que ofrecen")
    public void paginaPlanesVendedor() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(VERIFY_PLAN_PAGE).isEnabled()
        );
    }
}
