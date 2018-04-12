package Suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome () {

        System.setProperty("webdriver.chrome.driver", "D:\\Users\\hfernandes\\Documents\\Chrome Driver 2.35\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get("http://skysales.devedp.com.br/pacote1802/Search.aspx");

        return navegador;
    }
}
