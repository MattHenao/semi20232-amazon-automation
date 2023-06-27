package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarGiftCard;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.GiftCardPage.AMAZON_E_CARD;

public class AmazonGiftCardStepDefinitions {
    @Cuando("busco una amazon gift card")
    public void buscarGC() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/"),
                BuscarGiftCard.buscarBotonDontChange(),
                BuscarGiftCard.buscarBotonGiftCard(),
                BuscarGiftCard.buscarBotonAmazonGF(),
                BuscarGiftCard.buscaGiftCardAmazon()
        );
    }

    @Entonces("debe verse eGift Card")
    public void paginaGC() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(AMAZON_E_CARD).isEnabled()
        );
    }
}
