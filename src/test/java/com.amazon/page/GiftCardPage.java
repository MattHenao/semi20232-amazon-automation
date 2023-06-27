package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GiftCardPage {
    public static Target BUT_AMAZON = Target.the("Busca boton Amazon en 'Feature Brand'").locatedBy("//span[text()='Amazon']");
    public static Target AMAZON_GIFT_CARD = Target.the("Busca el primer gift card de amazon").locatedByFirstMatching("//span[text()='Amazon.com eGift Card']");
    public static Target AMAZON_E_CARD = Target.the("Verifica que exista 'Amazon.com eGift Card'").located(By.id("gc-asin-title"));
}
