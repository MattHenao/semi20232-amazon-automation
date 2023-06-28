package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarGiftCard;
import com.amazon.tasks.PaginaCoupons;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CouponsPage.VERIFY_COUPONS_PAGE;

public class CouponsStepDefinitions {
    @Cuando("cambio de pagina a coupons")
    public void cambiarPaginaCoupons() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/"),
                BuscarGiftCard.buscarBotonDontChange(),
                PaginaCoupons.buscarBotonDeals(),
                PaginaCoupons.buscarBotonCoupons()
        );
    }

    @Entonces("entro a pagina de cupones")
    public void paginaCoupons() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(VERIFY_COUPONS_PAGE).isEnabled()
        );
    }
}
