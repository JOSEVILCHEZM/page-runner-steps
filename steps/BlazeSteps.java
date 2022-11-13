package com.bdd.steps;

import com.bdd.page.BlazePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BlazeSteps {

    WebDriver driver;
    private BlazePage BlazePage() { return new BlazePage(driver);
    }

    public void openPage(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    public void seleccionaCelularIphone632gb() {
        BlazePage().getItemIphone632gb().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
    }
    }
    public void agregoalCarrito() {
        // Da click al boton Agregar al Carrito
        BlazePage().getBotonAgregarAlCarrito().click();
//Esperar a que salga el alert
        try {
            TimeUnit.SECONDS.sleep(2);
        }

        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        // Da click en el alert de Producto anadido
        driver.switchTo().alert().accept();
    }
    public void ingresoACart() {
        BlazePage().getTabCarrito().click();
//Esperar a que redireccione la pagina
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public void clickRealizarCompra() {
        BlazePage().getBotonRealizarCompra().click();
//Esperar a que salga el alert
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        //Llenado del formulario
        BlazePage().getInputName().sendKeys("Vilchez");
        BlazePage().getInputCity().sendKeys("Chiclayo");
        BlazePage().getInputCountry().sendKeys("Peru");
        BlazePage().getInputCard().sendKeys("1024 728 526 124");
        BlazePage().getInputMonth().sendKeys("03");
        BlazePage().getInputYear().sendKeys("24");
//Click en el boton Purchase
        BlazePage().getBotonPurchase().click();

//Esperar a que salga el mensaje
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public boolean verificacionDelMensaje() {
        return BlazePage().getValidarMensajeCompraExitosa();
    }
}