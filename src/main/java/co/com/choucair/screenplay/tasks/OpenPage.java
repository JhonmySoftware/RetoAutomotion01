package co.com.choucair.screenplay.tasks;

import co.com.choucair.screenplay.userinterfaces.PageExito;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnexpectedAlertBehaviour;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;

public class OpenPage implements Task {

    private PageExito pageExito;

    public static OpenPage urlApp() {
        return (OpenPage) Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageExito));
    }
}
