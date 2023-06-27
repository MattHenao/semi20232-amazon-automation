package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BUT_GIFT_CARDS = Target.the("Boton 'Gift Cards'").locatedBy("//a[text()='Gift Cards']");
    public static Target BUT_NO_CHANGE = Target.the("Boton 'Don't Change'").locatedBy("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']");
}