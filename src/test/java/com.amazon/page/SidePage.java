package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class SidePage {
    public static Target BUT_AMAZON_MUSIC = Target.the("Boton 'Amazon Music'").locatedBy("//div[text()='Amazon Music']");
    public static Target BUT_STREAMING_MUSIC = Target.the("Boton 'Free Streaming Music'").locatedByFirstMatching("//a[text()='Open Web Player']");
}
