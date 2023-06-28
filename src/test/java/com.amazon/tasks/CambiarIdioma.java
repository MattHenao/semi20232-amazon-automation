package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BUT_IDIOMA;
import static com.amazon.page.IdiomaPage.BUT_ES;
import static com.amazon.page.IdiomaPage.BUT_GUARDAR;

public class CambiarIdioma {
    public static Performable buscarBotonCambiarIdioma() {
        return Task.where("Busca boton para cambiar de idioma en el inicio",
                Click.on(BUT_IDIOMA)
        );
    }

    public static Performable buscarBotonES() {
        return Task.where("Busca boton ES en pagina cambiar idioma",
                Click.on(BUT_ES)
        );
    }

    public static Performable buscarBotonGuardar() {
        return Task.where("Busca boton guardar en pagina cambiar idioma",
                Click.on(BUT_GUARDAR)
        );
    }
}
