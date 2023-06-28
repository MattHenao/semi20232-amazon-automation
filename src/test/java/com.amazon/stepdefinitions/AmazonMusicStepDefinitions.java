package com.amazon.stepdefinitions;

import com.amazon.tasks.PaginaMusic;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.MusicPage.VERIFY_MUSIC_PAGE;

public class AmazonMusicStepDefinitions {
    @Cuando("cambio de pagina")
    public void cambiarPagina() {
        OnStage.theActorCalled("usuario").attemptsTo(
                Open.url("https://www.amazon.com/"),
                PaginaMusic.buscarBotonAll(),
                PaginaMusic.buscarBotonAmazonMusic(),
                PaginaMusic.buscarBotonStreaming()
        );
    }

    @Entonces("entro a amazon music")
    public void paginaAmazonMusic() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(VERIFY_MUSIC_PAGE).isEnabled()
        );
    }
}
