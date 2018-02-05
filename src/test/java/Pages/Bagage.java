package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bagage {
    private WebDriver navegador;

    public Bagage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Bagage AddBagage() {

        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[2]/div[3]/div[1]/div[5]/div[2]/div[2]/div[3]")).click();
        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[3]/div[5]/div/label")).click();

        return this;
    }

    public Assento confirmBagage(){
        navegador.findElement(By.id("BaggageAllowance2View_LinkButtonSubmit")).click();

        return new Assento(navegador);
    }
}
