package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarGiftCard;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.BUT_GIFT_CARDS;

public class AmazonGiftCardStepDefinitions {
    @Cuando("busco una amazon gift card")
    public void buscarGC() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/"),
                BuscarGiftCard.buscarBotonGiftCard(),
                BuscarGiftCard.buscarBotonAmazonGF(),
                BuscarGiftCard.buscaGiftCardAmazon()
        );
    }

    @Entonces("debe verse eGift Card")
    public void paginaGC() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BUT_GIFT_CARDS).isEnabled()
        );
    }
}
