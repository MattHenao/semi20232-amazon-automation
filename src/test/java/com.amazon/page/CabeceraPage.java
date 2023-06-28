package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BUT_GIFT_CARDS = Target.the("Boton 'Gift Cards'").locatedBy("//a[text()='Gift Cards']");
    public static Target BUT_NO_CHANGE = Target.the("Boton 'Don't Change'").locatedBy("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']");
    public static Target BUT_IDIOMA = Target.the("Boton 'idioma'").locatedBy("//span[@class='icp-nav-link-inner']");
    public static Target VERIFICAR_IDIOMA = Target.the("Verifica si la pagina cambio de idioma").locatedBy("//div[text()='ES']");
    public static Target BUT_ALL = Target.the("Boton 'All'").locatedBy("//span[@class='hm-icon-label']");
}