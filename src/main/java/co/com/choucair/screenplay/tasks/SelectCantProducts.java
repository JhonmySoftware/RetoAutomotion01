package co.com.choucair.screenplay.tasks;

import co.com.choucair.screenplay.interactions.CantProductosC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectCantProducts implements Task {
    public static SelectCantProducts carrito() {
        return Tasks.instrumented(SelectCantProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T jhon) {
        jhon.attemptsTo(CantProductosC.cantidad());
    }
}
