package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.FooterPage.BUT_COST;
import static com.amazon.page.FooterPage.BUT_SELL_PRODUCTS;
import static com.amazon.page.SellPage.BUT_PLAN;

public class PlanesVendedor {
    public static Performable botonSellProduct() {
        return Task.where("Busca boton 'Sell products on Amazon'",
                Click.on(BUT_SELL_PRODUCTS)
        );
    }

    public static Performable botonCost() {
        return Task.where("Busca boton 'How much does it cost?'",
                Click.on(BUT_COST));
    }

    public static Performable botonComparision() {
        return Task.where("Busca boton 'See plan comparision'",
                Click.on(BUT_PLAN)
        );
    }
}
