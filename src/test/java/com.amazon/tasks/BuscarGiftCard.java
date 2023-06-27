package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BUT_GIFT_CARDS;
import static com.amazon.page.GiftCardPage.AMAZON_GIFT_CARD;
import static com.amazon.page.GiftCardPage.BUT_AMAZON;

public class BuscarGiftCard {
    public static Performable buscarBotonGiftCard() {
        return Task.where("Buscar boton 'Gift Cards' en la pagina de inicio",
                Click.on(BUT_GIFT_CARDS)
        );
    }
    public static Performable buscarBotonAmazonGF() {
        return Task.where("Busca boton 'Amazon' en 'Featured Brands'",
                Click.on(BUT_AMAZON)
        );
    }

    public static Performable buscaGiftCardAmazon() {
        return Task.where("Busca el primer gift card de Amazon",
                Click.on(AMAZON_GIFT_CARD)
        );
    }
}
