package TestGol;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import javax.print.attribute.standard.MediaSize;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompraPassagem {

    private WebDriver navegador;

    @Before

    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "D:\\Users\\hfernandes\\Drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get("http://skysales.devedp.com.br/pacote1802/Search.aspx");

        WebElement MotorDeCompra = navegador.findElement(By.id("Page"));

        MotorDeCompra.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")).click();
        MotorDeCompra.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")).sendKeys("GRU", Keys.ENTER);

        MotorDeCompra.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDestination1")).click();
        MotorDeCompra.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDestination1")).sendKeys("SDU", Keys.ENTER);

        navegador.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[5]")).click();

        navegador.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]")).click();

        try {
            Thread.sleep(1000);
        }   catch(Exception ex) {
        }

        navegador.findElement(By.id("ControlGroupSearchView_ButtonSubmit")).click();

    }

    @Test
    public void motorDeCompra2(){

        // Escolha das Tarifas
        navegador.findElement(By.xpath("//*[@id=\"ida\"]/div[2]/div[5]/table[1]/tbody/tr/td[2]")).click();

        navegador.findElement(By.xpath("//*[@id=\"volta\"]/div[2]/div[5]/table[1]/tbody/tr/td[2]")).click();

        navegador.findElement(By.id("agree")).click();

        navegador.findElement(By.id("ControlGroupSelect2View_AvailabilityInputSelect2View_ButtonSubmit")).click();

        // Fazer Login

        navegador.findElement(By.id("LoginMemberLogin2View_TextBoxUserID")).sendKeys("helder.corporate@outlook.com");

        navegador.findElement(By.id("LoginMemberLogin2View_PasswordFieldPassword")).sendKeys("123456");

        navegador.findElement(By.id("LoginMemberLogin2View_LinkButtonLogIn")).click();

        // Carteira de Identidade

        navegador.findElement(By.id("ControlGroupFullcontact2View_PassengerInput2View_TextBoxDocumentNumber0_0")).sendKeys("41.159.623-8");

        // noSSR1

        navegador.findElement(By.id("noSSR1")).click();

        // Remover o Plano Smiles

        navegador.findElement(By.id("ControlGroupFullcontact2View_PassengerInput2View_Smiles_1")).click();

        // Contato em Caso de Emergência.

        navegador.findElement(By.id("noEmergencyContact")).click();

        // Confirmar Passageiro.

        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[2]/div[3]/div/div[2]/div/div[4]/button")).click();

        // Avançar

        navegador.findElement(By.id("ControlGroupFullcontact2View_ButtonSubmit")).click();

        // Escolhendo as tarifas incluídas nas bagagens.

        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[2]/div[3]/div[1]/div[5]/div[2]/div[2]/div[3]")).click();

        // Aceitar Termos

        navegador.findElement(By.xpath("//*[@id=\"Content\"]/div[3]/div[5]/div/label")).click();

        // Confirmando a Passagem.

        navegador.findElement(By.id("BaggageAllowance2View_LinkButtonSubmit")).click();

        // Escolhendo Assento IDA

        navegador.findElement(By.id("seat1_0_3D")).click();

        navegador.findElement(By.id("btnSeatMapClose")).click();

        try {
            Thread.sleep(1000);
        }   catch(Exception ex) {
        }

        // Escolher Assento VOLTA

        navegador.findElement(By.id("seat1_0_3D")).click();

        navegador.findElement(By.id("btnSeatMapClose")).click();

        // Avançar

        navegador.findElement(By.id("UnitMapViewControl2_LinkButtonAssignUnit")).click();


    }

    @Ignore

    public void motorDeCompra3() {

        navegador.findElement(By.id("LoginMemberLogin2View_TextBoxUserID")).sendKeys("helder.070516@gmail.com");

        navegador.findElement(By.id("LoginMemberLogin2View_PasswordFieldPassword")).sendKeys("123456");
    }

    @Ignore
    public void tearDown() {

        navegador.quit();

        }


    }


