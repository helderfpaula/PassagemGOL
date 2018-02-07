package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assento {
    private WebDriver navegador;


    public Assento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Assento AssentoIda(){
        navegador.findElement(By.id("seat1_0_2B")).click();

        try {
            Thread.sleep(1000);
        }   catch(Exception ex) {
        }

        navegador.findElement(By.id("btnSeatMapClose")).click();

        try {
            Thread.sleep(1000);
        }   catch(Exception ex) {
        }

        return this;
    }

    public Assento AssentoRetorno(){
        navegador.findElement(By.id("seat2_1_2B")).click();

        try {
            Thread.sleep(1000);
        }   catch(Exception ex) {
        }

        navegador.findElement(By.id("btnSeatMapClose")).click();

        return this;
    }
    public SeguroVida ConfirmAssento(){
        navegador.findElement(By.id("UnitMapViewControl2_LinkButtonAssignUnit")).click();

        return new SeguroVida(navegador);
    }

}
