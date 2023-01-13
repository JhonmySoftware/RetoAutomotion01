package co.com.choucair.screenplay.tasks;

import co.com.choucair.screenplay.userinterfaces.PageExito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Menus implements Task {
    public static Menus submenus() {
        return Tasks.instrumented(Menus.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageExito.MENU),
                Click.on(PageExito.CATEGORIA),
                Click.on(PageExito.CATEGORIA_VIDEOJUEGOS));
    }
}
