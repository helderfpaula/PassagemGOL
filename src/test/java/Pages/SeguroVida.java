package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeguroVida {
    private WebDriver navegador;

    public SeguroVida(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Pagamento ConfirmSeguro(){
        navegador.findElement(By.id("ControlGroupProductsView2_LinkButtonSubmit")).click();

        return new Pagamento(navegador);
    }
}
