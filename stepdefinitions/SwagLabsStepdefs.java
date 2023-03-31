package com.bdd.stepdefinitions;

import com.bdd.steps.SwagLabsSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;

import java.util.concurrent.TimeUnit;

public class SwagLabsStepdefs {

    SwagLabsSteps swagLabsSteps = new SwagLabsSteps();

    @Dado("que ingreso a SwagLabs")
    public void queingresoaSwagLabs() throws InterruptedException {
        swagLabsSteps.openPage("https://www.saucedemo.com/");
        TimeUnit.SECONDS.sleep(3);

    }

    @Cuando("agrego mi username")
    public void agregomiusername() {
        swagLabsSteps.seleccionarcasillanombre();

    }

    @Y("ingreso mi contrasena")
    public void ingresomicontrasena() {
        swagLabsSteps.getIngresoCasillaContrasena();

    }

    @Y("verifico ingreso exitoso")
    public void verificoingresoexitoso() {
        swagLabsSteps.BotonLogin();

    }
    @Y("agrego la casaca gris")
    public void agregolacasacagrisalcarrito(){
        swagLabsSteps.seleccionolacasacagris();
        swagLabsSteps.agregoalCarritolacasacagris();
        swagLabsSteps.regresoalapaginaprincipal();

    }
    @Y("agrego la mochila negra")
    public void agregolamochilanegra (){
        swagLabsSteps.seleccionolamochilanegra();
        swagLabsSteps.agregoalCarritolamochilanegras();
        swagLabsSteps.regresoalapaginaprincipalMochila();


    }

    @Y("agrego el accesorio para bicicleta")
    public void agregoelaccesorioparabicicleta (){
        swagLabsSteps.seleccionoaccesoriobicicleta();
        swagLabsSteps.agregoalCarritobicicleta();
        swagLabsSteps.regresoalapaginaabicicleta();


    }

    @Y("selecciono en el icono del carrito")
    public void IconoDelCarrito (){
        swagLabsSteps.seleccionoIconoDelCarrito();

    }

    @Y("regreso para comprar otro producto")
    public void ComprarOtroProdcuto (){
        swagLabsSteps.seleccionoContinuarComprando();


    }

    @Y("agrego polo rojo")
    public void AgregarPoloRojo (){
        swagLabsSteps.seleccionoPoloRojo();
        swagLabsSteps.agregoalCarritoPoloRojo();
        swagLabsSteps.regresoDespuesPoloRojo();

    }

    @Y("selecciono de nuevo el icono del carrito")
    public void seleccionodenuevoeliconodelcarrito(){
        swagLabsSteps.SeleccIconoCarrito();




    }
    @Y("selecciono boton de checkout")
    public void seleccionobotondecheckout(){
        swagLabsSteps.SeleccBotonCheckout();
    }

    @Y("ingreso mi informacion")

    public void agregoarInfoCheckout() {
        swagLabsSteps.IngresoFirstName();
        swagLabsSteps.IngresoLastName();
        swagLabsSteps.IngresoPostalCode();



    }
    @Y("selecciono boton de continuar")
    public void seleccionobotondecontinuar(){
        swagLabsSteps.SeleccBotondecontinuar();


    }
    @Y("finalizo la compra exitosamente")
    public void finalizolacompraexitosamente(){
        swagLabsSteps.FinalizarCompra();


    }











}
