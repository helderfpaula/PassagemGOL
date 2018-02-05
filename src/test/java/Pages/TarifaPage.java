package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TarifaPage {
    private WebDriver navegador;

    public TarifaPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public TarifaPage EscolherTarifaIda() {
        navegador.findElement(By.xpath("//*[@id=\"ida\"]/div[2]/div[5]/table[1]/tbody/tr/td[2]")).click();

        return this;
    }
    public TarifaPage EscolherTarifaRetorno() {
        navegador.findElement(By.xpath("//*[@id=\"volta\"]/div[2]/div[5]/table[1]/tbody/tr/td[2]")).click();

        return this;
    }

    public TarifaPage AceitarTermos() {
        navegador.findElement(By.id("agree")).click();

        return this;
    }

    public PageLogin Continuar() {
        navegador.findElement(By.id("ControlGroupSelect2View_AvailabilityInputSelect2View_ButtonSubmit")).click();

        return new PageLogin(navegador);
    }
}
