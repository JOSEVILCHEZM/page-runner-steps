package com.bdd.stepdefinitionss;

import com.bdd.steps.BlazeSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class BlazeStepdefs {

    BlazeSteps blazeSteps = new BlazeSteps();
    @Dado("que ingreso a Blaze")
    public void queingresoablaze() throws InterruptedException {
        blazeSteps.openPage("https://www.demoblaze.com/");
        TimeUnit.SECONDS.sleep(3);

    }

    @Cuando("agrego un celular al carrito")
    public void agregouncelularalcarrito() {
        blazeSteps.seleccionaCelularIphone632gb();
        blazeSteps.agregoalCarrito();
    }


    @Y("realizo una compra")
    public void realizounacompra() {
        blazeSteps.ingresoACart();
        blazeSteps.clickRealizarCompra();
    }

    @Entonces("verifico compra exitosa")
    public void verificocompraexitosa() {
        Assert.assertTrue("No aparece el mensaje",blazeSteps.verificacionDelMensaje());
    }
}