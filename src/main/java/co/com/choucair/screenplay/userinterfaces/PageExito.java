package co.com.choucair.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import javax.swing.table.TableRowSorter;

@DefaultUrl("https://www.exito.com/")
public class PageExito extends PageObject {
    public static final Target MENU = Target.the("Menu principal").located(By.id("Trazado_7822"));
    public static final Target CATEGORIA = Target.the("CATEGORIA").located(By.id("undefined-nivel2-Tecnología"));
    public static final Target CATEGORIA_VIDEOJUEGOS = Target.the("CATEGORIA_VIDEOJUEGOS").located(By.id("Categorías-nivel3-Videojuegos"));
//    public static final Target CERRAR_MENU = Target.the("Cerrar el menu").located(By.id("Trazado_1073"));

}
