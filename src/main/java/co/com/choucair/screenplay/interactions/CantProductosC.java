package co.com.choucair.screenplay.interactions;

import co.com.choucair.screenplay.userinterfaces.CantProductosCart;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class CantProductosC implements Interaction {

    @Override
    public <T extends Actor> void performAs(T jhon) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jhon.attemptsTo(Click.on(CantProductosCart.iconocarrito));

    }


    public static CantProductosC cantidad() {
        return Instrumented.instanceOf(CantProductosC.class).withProperties();
    }
}
