package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;


public class OpenUp implements Task {

    private UtestPage utestPage;
    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
