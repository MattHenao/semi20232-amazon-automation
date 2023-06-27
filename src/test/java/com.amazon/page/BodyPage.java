package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class BodyPage {
    public static Target NEXT_BANNER = Target.the("Pasar a la siguiente pagina del banner").locatedBy("//i[@class='a-icon a-icon-next-rounded']");
    public static Target PREVIOUS_BANNER = Target.the("Devolverse pagina de banner").locatedBy("//i[@class='a-icon a-icon-previous-rounded']");
    public static Target SELECT_BANNER =Target.the("Seleccionar el banner").locatedBy("//img[@alt='Shop Computers and Accessories']");
}
