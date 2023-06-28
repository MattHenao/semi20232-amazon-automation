package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class MusicPage {
    public static Target VERIFY_MUSIC_PAGE = Target.the("Verifica que esta en la pagina amazon music").locatedBy("//div/form/input[@id='navbarSearchInput']");
}
