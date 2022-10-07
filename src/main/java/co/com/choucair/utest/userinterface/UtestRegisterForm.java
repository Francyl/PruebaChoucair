package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.*;
import net.serenitybdd.core.pages.*;
import net.serenitybdd.screenplay.targets.*;

public class UtestRegisterForm extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("boton de registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("ingresar nombre").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("ingresar nombre").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("ingresar nombre").located(By.id("email"));
    public static final Target MONTH_OF_BIRTH = Target.the("ingresar nombre").located(By.id("birthMonth"));
    public static final Target DAY_BIRTH = Target.the("ingresar nombre").located(By.id("birthDay"));
    public static final Target YEAR_BIRTH = Target.the("ingresar nombre").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("boton siguiente paso").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY =Target.the("localizacion del usuario").located(org.openqa.selenium.By.xpath("//*[@id=\"city\"]"));
    public static final Target ZIP_OR_POSTAL_CODE =Target.the("localizacion de codigo postal").located(org.openqa.selenium.By.xpath("//*[@id=\"zip\"]"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("boton paso dos").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target YOUR_MOBIL_DEVICE_CLICK =Target.the("dispositivo del usuario").located(org.openqa.selenium.By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target YOUR_MOBIL_DEVICE_APPLE =Target.the("dispositivo del usuario apple").located(org.openqa.selenium.By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL = Target.the("ingresar el modelo del celular").located(By.id("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target OPERATING_SYSTEM= Target.the("ingresar nombre de la operacion de tu movil").located(By.id("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target YOUR_COMPUTER= Target.the("ingresar nombre de tu computador").located(By.id("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION = Target.the("ingresar nombre version ").located(By.id("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target LANGUAGE= Target.the("ingresar idioma").located(By.id("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));

    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("boton ultimo paso").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target CREATE_YOUR_UTEST_PASSWORD = Target.the("ingresar una contraseña").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirmar la contraseña").located(By.id("confirmPassword"));
    public static final Target CHECK_ACEPTAR_UNO = Target.the("check aceptar").located(By.id("termOfUse"));
    public static final Target CHECK_ACEPTAR_DOS= Target.the("check aceptar dos").located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("boton finalizar").located(By.xpath("//*[@id=\"laddaBtn\"]"));


}
