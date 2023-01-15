package co.com.choucair.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CantProductosCart extends PageObject {

    public static final Target iconocarrito = Target.the("icono del carrito").locatedBy("//*[@class='exito-header-3-x-minicartContainer']");

}
