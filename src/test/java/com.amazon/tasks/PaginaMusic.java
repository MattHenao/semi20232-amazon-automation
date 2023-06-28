package com.amazon.tasks;

import io.cucumber.java.an.Pero;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BUT_ALL;
import static com.amazon.page.SidePage.BUT_AMAZON_MUSIC;
import static com.amazon.page.SidePage.BUT_STREAMING_MUSIC;

public class PaginaMusic {
    public static Performable buscarBotonAll() {
        return Task.where("Busca el boton all en la cabecera",
                Click.on(BUT_ALL)
        );
    }

    public static Performable buscarBotonAmazonMusic() {
        return Task.where("Busca el boton amazon music",
                Click.on(BUT_AMAZON_MUSIC)
        );
    }

    public static Performable buscarBotonStreaming() {
        return Task.where("Busca el boton streaming music",
                Click.on(BUT_STREAMING_MUSIC)
        );
    }
}
