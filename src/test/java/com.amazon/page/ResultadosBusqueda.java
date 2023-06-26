package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA = Target.the("item buscado").locatedByFirstMatching("//img[@data-image-latency=\"s-product-image\"]");
}