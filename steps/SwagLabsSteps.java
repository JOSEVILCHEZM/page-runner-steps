package com.bdd.steps;

import com.bdd.page.SwagLabsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwagLabsSteps {

    WebDriver driver;


    private SwagLabsPage LabsPage() {
        return new SwagLabsPage(driver);
    }

    public void openPage(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


    }

    public void seleccionarcasillanombre() {
        LabsPage().getIngresocasillanombre().click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        //INGREESO DE NOMBRE
        LabsPage().getInputName().sendKeys("performance_glitch_user");


    }

    public void getIngresoCasillaContrasena() {
        LabsPage().getIngresoCasillaContrasena().click();

        try {
            TimeUnit.SECONDS.sleep(2);

        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }
        //INGRESO DE CONTRASEÑA
        LabsPage().getInputContrasena().sendKeys("secret_sauce");


    }

    public void BotonLogin() {
        LabsPage().getBotonEntrar().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    public void seleccionolacasacagris() {
        LabsPage().getitemcasacagris().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void agregoalCarritolacasacagris() {
        LabsPage().getBotonparaagregarAlCarrito().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void regresoalapaginaprincipal() {
        LabsPage().getBotonRegresarPaginaPrincipal().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void seleccionolamochilanegra() {
        LabsPage().getitemmochilanegra().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void agregoalCarritolamochilanegras() {
        LabsPage().getBotonparaagregarMochilaAlCarrito().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void regresoalapaginaprincipalMochila() {
        LabsPage().getBotonRegresarPaginaPrincipalMochila().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void seleccionoaccesoriobicicleta() {
        LabsPage().getitemparabicicleta().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void agregoalCarritobicicleta() {
        LabsPage().getAgregoAccbicicleta().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


    }

    public void regresoalapaginaabicicleta() {
        LabsPage().getBotonRegresarBicicleta().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public void seleccionoIconoDelCarrito(){
        LabsPage().getIngresoAlcarrito().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public void seleccionoContinuarComprando(){
        LabsPage().getContinuarComprando().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }



    }

    public void seleccionoPoloRojo(){
        LabsPage().getPoloRojo().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public void agregoalCarritoPoloRojo(){
        LabsPage().getAgregoPoloR().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
    public void regresoDespuesPoloRojo(){
        LabsPage().getBotonRegresarPoloR().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
    public void SeleccIconoCarrito(){
        LabsPage().getIngresoIconoCar().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
    public void SeleccBotonCheckout(){
        LabsPage().getBtnCheckout().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void IngresoFirstName() {
        LabsPage().getFirstName().click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        //INGREESO DE NOMBRE
        LabsPage().getInputFirstName().sendKeys("JOSE");


    }
    public void IngresoLastName() {
        LabsPage().getLastName().click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        //INGREESO DE NOMBRE
        LabsPage().getInputLastName().sendKeys("VILCHEZ");


    }

    public void IngresoPostalCode() {
        LabsPage().getPostalCode().click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        //INGREESO DE NOMBRE
        LabsPage().getInputPostalCode().sendKeys("14000");


    }

    public void SeleccBotondecontinuar(){
        LabsPage().SeleccContinuar().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


    public void FinalizarCompra(){
        LabsPage().SeleccFinalizarCompra().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    }
















