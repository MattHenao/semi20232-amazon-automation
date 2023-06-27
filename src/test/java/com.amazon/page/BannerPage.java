package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
public class BannerPage {
     public static Target VERIFY_BANNER_PAGE = Target.the("Verifica si esta adentro de la pagina banner").locatedBy("//span[text()='Nintendo']");
}
