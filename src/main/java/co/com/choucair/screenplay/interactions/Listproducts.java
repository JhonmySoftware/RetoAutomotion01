package co.com.choucair.screenplay.interactions;

import co.com.choucair.screenplay.userinterfaces.SubcGames;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class Listproducts implements Interaction {
    Random rand = new Random();

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement elemento = SubcGames.ContainerProductos.resolveFor(actor);
        List<WebElement> productos = elemento.findElements(By.xpath("//*[@id='gallery-layout-container']/div//*[@class='exito-vtex-components-4-x-buttonText']"));
        System.out.println("Listado: " + productos.size());
        for (int i = 0; i < 5; i++) {
            int ListProducts = rand.nextInt((productos.size()));
            WebElement elements = productos.get(ListProducts);
            if (elements.isDisplayed()) {
                elements.click();
            } else {
                scrollToWebElement(elements.toString());
                elements.click();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void scrollToWebElement(String strXpathObjeto) {
        WebElement element = getDriver().findElement(By.xpath(strXpathObjeto));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        //Si el elemento se encuentra por debajo de la posicion actual se le pasa como argumento true al scrollIntoView(),
        //si el elemento esta por ensima de la posicion se le pasa false como argumento
    }

    //    public void Agregarproductosalcarrito(WebElement elements) {
//        int intentos = 1;
//        int cantidad = rand.nextInt(10);
//        cantidad += 1;
//        while (intentos <= cantidad) {
//            elements.click();
//            intentos++;
//        }
//    }
    public static Listproducts carrito() {
        return Instrumented.instanceOf(Listproducts.class).withProperties();
    }
}