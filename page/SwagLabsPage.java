package com.bdd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SwagLabsPage {

    WebDriver driver;

    By botoncasillanombre = By.xpath("//input[@id='user-name']");
    By botonIngresoContrasena = By.xpath("//input[@id='password']");
    By botonentrar = By.xpath("//input[@id='login-button']");



    By inputName = By.xpath("//input[@id='user-name']");
    By inputcontrasena = By.xpath("//input[@id='password']");




    By itemcasacagris = By.xpath("//a[contains(.,'Sauce Labs Fleece Jacket')]");
    By botonAgregarAlCarrito = By.xpath("//button[text()='Add to cart']");

    By botonRegresarPagina = By.xpath("//button[text()='Back to products']");




    By itemmichilanegra = By.xpath("//a[contains(.,'Sauce Labs Backpack')]");
    By botonAgregarAlCarritoMochilaNegra = By.xpath("//button[text()='Add to cart']");
    By botonRegresarPaginaDespuesMochila = By.xpath("//button[text()='Back to products']");



    By ItemmParaBicicleta = By.xpath("//a[contains(.,'Sauce Labs Bike Light')]");
    By botonAgregarAccBicicleta = By.xpath("//button[text()='Add to cart']");
    By BotonRegresarPaginaBicicleta = By.xpath("//button[text()='Back to products']");


    By BotonIngresoCarrito = By.xpath("//a[contains(.,'3')]");


    By BotonContinuarComprando = By.xpath("//button[text()='Continue Shopping']");



    By ItemPoloRojo = By.xpath("//a[contains(.,'Test.allTheThings() T-Shirt (Red)')]");
    By BotonAgregarPoloRojo = By.xpath("//button[text()='Add to cart']");
    By BotonRegresarPoloRojo = By.xpath("//button[text()='Back to products']");



    By BotonReIngreso = By.xpath("//a[contains(.,'4')]");

    By BotonCheckout = By.xpath("//button[text()='Checkout']");

    By BotonSeleccContinuar = By.xpath("//input[@id='continue']");


    By BotonFinalizarCompra = By.xpath("//button[text()='Finish']");








    By inputFirstName = By.xpath("//input[@id='first-name']");
    By ginputFirstName = By.xpath("//input[@id='first-name']");


    By inputLastName = By.xpath("//input[@id='last-name']");
    By ginputLastName = By.xpath("//input[@id='last-name']");


    By inputPostalCode = By.xpath("//input[@id='postal-code']");
    By ginputPostalCode = By.xpath("//input[@id='postal-code']");









    public SwagLabsPage(WebDriver driver) {this.driver = driver;}


    public WebElement getBotonEntrar() {
        return driver.findElement(botonentrar);

    }



    public WebElement getitemcasacagris(){
        return driver.findElement(itemcasacagris);
    }

    public WebElement getBotonparaagregarAlCarrito(){
        return driver.findElement(botonAgregarAlCarrito);
    }

    public WebElement getBotonRegresarPaginaPrincipal(){
        return driver.findElement(botonRegresarPagina);
    }





    public WebElement getitemmochilanegra(){
        return driver.findElement(itemmichilanegra);
    }

    public WebElement getBotonparaagregarMochilaAlCarrito(){
        return driver.findElement(botonAgregarAlCarritoMochilaNegra);
    }

    public WebElement getBotonRegresarPaginaPrincipalMochila(){
        return driver.findElement(botonRegresarPaginaDespuesMochila);
    }



    public WebElement getitemparabicicleta(){
        return driver.findElement(ItemmParaBicicleta);
    }

    public WebElement getAgregoAccbicicleta(){
        return driver.findElement(botonAgregarAccBicicleta);
    }

    public WebElement getBotonRegresarBicicleta(){
        return driver.findElement(BotonRegresarPaginaBicicleta);
    }



    public WebElement getIngresoAlcarrito(){
        return driver.findElement(BotonIngresoCarrito);
    }


    public WebElement getContinuarComprando(){
        return driver.findElement(BotonContinuarComprando);
    }


    public WebElement getPoloRojo(){
        return driver.findElement(ItemPoloRojo);
    }

    public WebElement getAgregoPoloR(){
        return driver.findElement(BotonAgregarPoloRojo);
    }

    public WebElement getBotonRegresarPoloR(){
        return driver.findElement(BotonRegresarPoloRojo);
    }

    public WebElement getIngresoIconoCar(){
        return driver.findElement(BotonReIngreso);
    }

    public WebElement getBtnCheckout(){
        return driver.findElement(BotonCheckout);
    }

    public WebElement SeleccContinuar(){
        return driver.findElement(BotonSeleccContinuar);
    }

    public WebElement SeleccFinalizarCompra(){
        return driver.findElement(BotonFinalizarCompra);
    }







    public WebElement getFirstName() {
        return driver.findElement(inputFirstName);
    }

    public WebElement getInputFirstName() {
        return driver.findElement(ginputFirstName);
    }


    public WebElement getLastName() {
        return driver.findElement(inputLastName);
    }

    public WebElement getInputLastName() {
        return driver.findElement(ginputLastName);
    }


    public WebElement getPostalCode() {
        return driver.findElement(inputPostalCode);
    }

    public WebElement getInputPostalCode() {
        return driver.findElement(ginputPostalCode);
    }








    public WebElement getIngresocasillanombre() {
        return driver.findElement(botoncasillanombre);
    }

    public WebElement getIngresoCasillaContrasena() {
        return driver.findElement(botonIngresoContrasena);

    }

    public WebElement getInputName() {
        return driver.findElement(inputName);
    }

    public WebElement getInputContrasena() {
        return driver.findElement(inputcontrasena);
    }




}