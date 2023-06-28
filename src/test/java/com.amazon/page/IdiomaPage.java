package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IdiomaPage {
    public static Target BUT_ES = Target.the("Boton para cambiar de idioma").locatedBy("//span[@class='a-label a-radio-label']//span[text()='ES']");
    public static Target BUT_GUARDAR = Target.the("Boton para guardar cambios").locatedBy("//span[@class='a-button-inner']/input[@class='a-button-input']");
}
