package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

public class Register implements Task {

    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterForm.REGISTER_BUTTON),
                Enter.theValue("FRANCY").into(UtestRegisterForm.FIRST_NAME),
                Enter.theValue("ROJAS").into(UtestRegisterForm.LAST_NAME),
                Enter.theValue("FRANCYLROJAS@GMAIL.COM").into(UtestRegisterForm.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("December").from(UtestRegisterForm.MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText("28").from(UtestRegisterForm.DAY_BIRTH),
                SelectFromOptions.byVisibleText("1995").from(UtestRegisterForm.YEAR_BIRTH),
                Click.on(UtestRegisterForm.NEXT_LOCATION_BUTTON),
                Enter.theValue("Cartagena de Indias").into(UtestRegisterForm.CITY),
                Enter.theValue("130003").into(UtestRegisterForm.ZIP_OR_POSTAL_CODE),
                Click.on(UtestRegisterForm.NEXT_DEVICES_BUTTON),
                /*Click.on(UtestRegisterForm.YOUR_MOBIL_DEVICE_CLICK),
                Enter.theValue("Apple").into(UtestRegisterForm.YOUR_MOBIL_DEVICE_APPLE),*/
                /*SelectFromOptions.byVisibleText("Windows").from(UtestRegisterForm.YOUR_COMPUTER),
                SelectFromOptions.byVisibleText("Windows 11").from(UtestRegisterForm.VERSION),
                SelectFromOptions.byVisibleText("Spanish").from(UtestRegisterForm.LANGUAGE),*/
                Click.on(UtestRegisterForm.NEXT_LAST_STEP_BUTTON),
                Enter.theValue("Admin12345*").into(UtestRegisterForm.CREATE_YOUR_UTEST_PASSWORD),
                Enter.theValue("Admin12345*").into(UtestRegisterForm.CONFIRM_PASSWORD),
                Click.on(UtestRegisterForm.CHECK_ACEPTAR_UNO),
                Click.on(UtestRegisterForm.CHECK_ACEPTAR_DOS),
                Click.on(UtestRegisterForm.COMPLETE_SETUP_BUTTON)

                );
    }
}
