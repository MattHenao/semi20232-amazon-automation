package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.BodyPage.*;

public class SeleccionarBanner {
    public static Performable bannerDerecha() {
        return Task.where("Darle click al boton derecho de el banner",
                Click.on(NEXT_BANNER),
                Click.on(NEXT_BANNER),
                Click.on(NEXT_BANNER)
        );
    }

    public static Performable bannerIzquierda() {
        return Task.where("Darle click al boton izquierdo de el banner",
            Click.on(PREVIOUS_BANNER)
        );
    }

    public static Performable seleccionarBanner() {
        return Task.where("Seleccionar el banner indicado",
                Click.on(SELECT_BANNER)
        );
    }
}
