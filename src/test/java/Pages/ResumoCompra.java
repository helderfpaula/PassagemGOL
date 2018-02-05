package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResumoCompra {
    private WebDriver navegador;

    public ResumoCompra(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Confirmacao ConfirmCompra(){
        navegador.findElement(By.id("ControlGroupPayment2View_LinkButtonSubmit")).click();

        return new Confirmacao(navegador);
    }

}
