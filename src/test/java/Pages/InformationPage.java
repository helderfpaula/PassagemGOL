package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {
    private WebDriver navegador;


    public InformationPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public InformationPage Documento(String Doc) {
        navegador.findElement(By.id("ControlGroupFullcontact2View_PassengerInput2View_TextBoxDocumentNumber0_0")).sendKeys("41.159.623-8");

        return this;
    }

    public InformationPage noSSR1(){
        navegador.findElement(By.id("noSSR1")).click();

        return this;
    }

    public InformationPage noSmiles() {
        navegador.findElement(By.id("ControlGroupFullcontact2View_PassengerInput2View_Smiles_1")).click();

        return this;
    }

    public InformationPage Emergency() {
        navegador.findElement(By.id("noEmergencyContact")).click();

        return this;
    }

    public Avance ConfPassageiro() {
        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[2]/div[3]/div/div[2]/div/div[4]/button")).click();

        try {
            Thread.sleep(1000);
        } catch (Exception ex){
        }

        return new Avance(navegador);
    }

}
