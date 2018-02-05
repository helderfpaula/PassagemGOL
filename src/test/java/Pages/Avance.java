package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Avance {
    private WebDriver navegador;

    public Avance(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Bagage Avancar() {
        navegador.findElement(By.id("ControlGroupFullcontact2View_ButtonSubmit")).click();



        return new Bagage(navegador);
    }
}
