package com.amazon.stepdefinitions;

import com.amazon.tasks.SeleccionarBanner;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.BannerPage.VERIFY_BANNER_PAGE;

public class BuscarBannerStepDefinitions {
    @Cuando("busco una categoria de banner")
    public void elegirBanner(){
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/"),
                SeleccionarBanner.bannerDerecha(),
                //SeleccionarBanner.bannerIzquierda(),
                SeleccionarBanner.seleccionarBanner()
        );
    }

    @Entonces("debe verse los productos de esa categoria")
    public void paginaBanner(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(VERIFY_BANNER_PAGE).isEnabled()
        );
    }
}
