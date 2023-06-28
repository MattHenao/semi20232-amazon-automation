package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BUT_COUPONS;
import static com.amazon.page.CabeceraPage.BUT_DEALS;

public class PaginaCoupons {
    public static Performable buscarBotonDeals() {
        return Task.where("Busca el boton Todays deals",
                Click.on(BUT_DEALS)
        );
    }

    public static Performable buscarBotonCoupons() {
        return Task.where("Busca el boton Coupons",
                Click.on(BUT_COUPONS)
        );
    }
}
