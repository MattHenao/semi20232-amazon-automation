package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA;

public class SeleccionarItem {
    public static Performable conEnvioColombia() {
        return Task.where("{0} buscando items con envío a Colombia",
                Click.on(ITEM_COMPRA),
                Click.on(BUT_AGREGAR_CARRITO)
        );
    }
}