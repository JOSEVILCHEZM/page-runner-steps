package com.bdd.page;

import com.bdd.stepdefinitionss.BlazeStepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazePage {

    WebDriver driver;
    By itemIphone632gb = By.xpath("//a[text()='Iphone 6 32gb']");
    By botonAgregarAlCarrito = By.xpath("//a[text()='Add to cart']");
    By tabCarrito = By.xpath("//a[text()='Cart']");
    By botonRealizarCompra = By.xpath("//button[text()='Place Order']");
    By inputName = By.xpath("//input[@id='name']");
    By inputCountry = By.xpath("//input[@id='country']");
    By inputCity = By.xpath("//input[@id='city']");
    By inputCard = By.xpath("//input[@id='card']");
    By inputMonth = By.xpath("//input[@id='month']");
    By inputYear = By.xpath("//input[@id='year']");
    By botonPurchase = By.xpath("//button[text()='Purchase']");
    By mensajeCompraExitosa = By.xpath("//h2[text()='Thank you for your purchase!']");

    public BlazePage(WebDriver driver){this.driver = driver;}


    public WebElement getItemIphone632gb(){
        return driver.findElement(itemIphone632gb);
    }
    public WebElement getBotonAgregarAlCarrito(){
        return driver.findElement(botonAgregarAlCarrito);
    }
    public WebElement getTabCarrito(){
        return driver.findElement(tabCarrito);
    }
    public WebElement getBotonRealizarCompra(){
        return driver.findElement(botonRealizarCompra);
    }
    public WebElement getInputName(){ return driver.findElement(inputName);}
    public WebElement getInputCountry(){ return driver.findElement(inputCountry);}
    public WebElement getInputCity(){ return driver.findElement(inputCity);}
    public WebElement getInputCard(){ return driver.findElement(inputCard);}
    public WebElement getInputMonth(){ return driver.findElement(inputMonth);}
    public WebElement getInputYear(){ return driver.findElement(inputYear);}
    public WebElement getBotonPurchase(){ return driver.findElement(botonPurchase);}
    public WebElement getMensajeCompraExitosa(){ return driver.findElement(mensajeCompraExitosa);}
    public boolean getValidarMensajeCompraExitosa(){ return(!driver.findElements(mensajeCompraExitosa).isEmpty());}
}
