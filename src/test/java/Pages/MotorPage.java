package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MotorPage {
    private WebDriver navegador;


    public MotorPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public MotorPage Origem(String origem) {
        navegador.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")).click();
        navegador.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")).sendKeys("GRU", Keys.ENTER);
        return this;
    }
    public MotorPage Destino(String destino) {
        navegador.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDestination1")).click();
        navegador.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDestination1")).sendKeys("SDU", Keys.ENTER);
        return this;
    }

    public MotorPage DataIda() {
        navegador.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a")).click();
        return this;
    }

    public MotorPage DataVolta() {
        navegador.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]/a")).click();

        try {
            Thread.sleep(1000);
        } catch (Exception Ex){
        }

        return this;
    }


    public TarifaPage CompreAqui () {
        navegador.findElement(By.id("ControlGroupSearchView_ButtonSubmit")).click();

        return new TarifaPage(navegador);
    }




}