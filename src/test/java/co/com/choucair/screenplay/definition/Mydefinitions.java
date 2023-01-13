package co.com.choucair.screenplay.definition;

import co.com.choucair.screenplay.tasks.Menus;
import co.com.choucair.screenplay.tasks.OpenPage;
import co.com.choucair.screenplay.tasks.ProductsSeletion;
import co.com.choucair.screenplay.userinterfaces.PageExito;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Mydefinitions {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que jhon ingreso a la pagina web del Éxito$")
    public void que_jhon_ingreso_a_la_pagina_web_del_Éxito() {
        OnStage.theActorCalled("jhon").wasAbleTo(OpenPage.urlApp());

    }

    @Cuando("^elija una categoría y subcategoría$")
    public void elijaUnaCategoríaYSubcategoría() {
        OnStage.theActorCalled("jhon").wasAbleTo(Menus.submenus());
    }


    @Y("^Seleccione (\\d+) productos aleatoreamente$")
    public void seleccione_productos_aleatoreamente(int arg1) {
        OnStage.theActorCalled("jhon").wasAbleTo(ProductsSeletion.games());


    }

    @Y("^cada unos de los productos tenga cantidades aleatoreas entre (\\d+)-(\\d+)$")
    public void cada_unos_de_los_productos_tenga_cantidades_aleatoreas_entre(int arg1, int arg2) {

    }

    @Entonces("^Se debe validar que el nombre de los productos agregados deberá ser igual que en el carrito$")
    public void se_debe_validar_que_el_nombre_de_los_productos_agregados_deberá_ser_igual_que_en_el_carrito() {

    }

    @Y("^El total de los precios de los productos agregados deberá ser igual que en el carrito$")
    public void el_total_de_los_precios_de_los_productos_agregados_deberá_ser_igual_que_en_el_carrito() {

    }

    @Y("^Las cantidades de los productos agregados deberá ser igual que en el carrito$")
    public void las_cantidades_de_los_productos_agregados_deberá_ser_igual_que_en_el_carrito() {

    }

    @Y("^El número de productos agregados debe ser igual que en el carrito$")
    public void el_número_de_productos_agregados_debe_ser_igual_que_en_el_carrito() {

    }

}
