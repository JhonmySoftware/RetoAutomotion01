package co.com.choucair.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static java.time.temporal.ChronoUnit.SECONDS;

public class SubcGames extends PageObject {


    public static final Target ContainerProductos = Target.the("container de productos").located(By.xpath("//div[@id='gallery-layout-container']"));
    public static final Target ButtonProducts = Target.the("Boton productos").located(By.xpath("//*[@id='gallery-layout-container']/div//*[@class='exito-vtex-components-4-x-buttonText']"));


}