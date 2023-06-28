package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class SellPage {
    public static Target BUT_PLAN = Target.the("Boton 'See plan comparison'").locatedBy("//a[@href='#selling-plans']");
    public static Target VERIFY_PLAN_PAGE = Target.the("Verifica que esta en la pagina de planes").locatedBy("//h3[text()='Individual']");
}
