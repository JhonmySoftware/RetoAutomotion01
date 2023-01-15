package co.com.choucair.screenplay.tasks;


import co.com.choucair.screenplay.interactions.ListarProductosCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class SelecionProductos implements Task {

    public static SelecionProductos games() {
        return Tasks.instrumented(SelecionProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(ListarProductosCart.carrito());


    }
}
