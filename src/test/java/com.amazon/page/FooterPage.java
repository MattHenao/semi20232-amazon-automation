package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class FooterPage {
    public static Target BUT_SELL_PRODUCTS = Target.the("Boton 'Sell products on Amazon'").locatedBy("//a[text()='Sell products on Amazon']");
    public static Target BUT_COST = Target.the("Boton 'How much does it cost?'").locatedBy("//a[text()='How much does it cost?']");
}
