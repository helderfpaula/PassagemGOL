package Pages;

import Suport.Generator;
import Suport.Screenshot;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmacao {
    private WebDriver navegador;


    public Confirmacao(WebDriver navegador) {
        this.navegador = navegador;}

        public String ConfirmPassagem(){

            return navegador.findElement(By.id("Page")).getText();

    }
    }

