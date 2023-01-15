package co.com.choucair.screenplay.interactions;


import co.com.choucair.screenplay.userinterfaces.SubcGames;
import cucumber.api.DataTable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;


public class ListarProductosCart implements Interaction {


    private static int min_num;
    private static int max_num;
    private static int num_rand;


    public static int getMin_num() {
        return min_num;
    }

    public static void setMin_num(int min_num) {
        ListarProductosCart.min_num = min_num;
    }

    public static int getMax_num() {
        return max_num;
    }

    public static void setMax_num(int max_num) {
        ListarProductosCart.max_num = max_num;
    }

    public static double getNum_rand() {
        return num_rand;
    }

    public static void setNum_rand(int num_rand) {
        ListarProductosCart.num_rand = num_rand;
    }

    @Override
    public <T extends Actor> void performAs(T jhon) {


        List<Target> valid = Arrays.asList(
                SubcGames.ButtonAgregar1,
                SubcGames.ButtonAgregar2,
                SubcGames.ButtonAgregar3,
                SubcGames.ButtonAgregar4,
                SubcGames.ButtonAgregar5,
                SubcGames.ButtonAgregar6,
                SubcGames.ButtonAgregar7,
                SubcGames.ButtonAgregar8,
                SubcGames.ButtonAgregar9,
                SubcGames.ButtonAgregar10,
                SubcGames.ButtonAgregar11,
                SubcGames.ButtonAgregar12,
                SubcGames.ButtonAgregar13,
                SubcGames.ButtonAgregar14,
                SubcGames.ButtonAgregar15,
                SubcGames.ButtonAgregar16,
                SubcGames.ButtonAgregar17,
                SubcGames.ButtonAgregar18,
                SubcGames.ButtonAgregar19,
                SubcGames.ButtonAgregar20
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        setMin_num(0);
        setMax_num(3);
        setNum_rand((int) (Math.random() * (getMax_num() - getMin_num())));
        System.out.println("El numero random generado es: " + getNum_rand());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        switch ((int) getNum_rand()) {
            case 0:
                jhon.attemptsTo(
                        Click.on(valid.get(0)),
                        Click.on(valid.get(1)),
                        Click.on(valid.get(2)),
                        Click.on(valid.get(3)),
                        Click.on(valid.get(4)));
                break;
            case 1:
                jhon.attemptsTo(
                        Click.on(valid.get(5)),
                        Click.on(valid.get(6)),
                        Click.on(valid.get(7)),
                        Click.on(valid.get(8)),
                        Click.on(valid.get(12)));
                break;
            case 2:
                jhon.attemptsTo(
                        Click.on(valid.get(9)),
                        Click.on(valid.get(11)),
                        Click.on(valid.get(15)),
                        Click.on(valid.get(16)),
                        Click.on(valid.get(17)));
                break;

            case 3:
                jhon.attemptsTo(
                        Click.on(valid.get(10)),
                        Click.on(valid.get(13)),
                        Click.on(valid.get(14)),
                        Click.on(valid.get(18)),
                        Click.on(valid.get(19)));
                break;

            default:
                System.out.println("La seccion selecionada no puede ser mayor a 3: ");
        }


    }

    public static ListarProductosCart carrito() {
        return Instrumented.instanceOf(ListarProductosCart.class).withProperties();
    }
}