package co.com.choucair.screenplay.tasks;

import co.com.choucair.screenplay.interactions.Listproducts;
import co.com.choucair.screenplay.userinterfaces.PageExito;
import co.com.choucair.screenplay.userinterfaces.SubcGames;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProductsSeletion implements Task {

    public static ProductsSeletion games() {
        return Tasks.instrumented(ProductsSeletion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Listproducts.carrito());


    }


}
