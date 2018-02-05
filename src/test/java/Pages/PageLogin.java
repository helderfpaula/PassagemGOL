package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
    private WebDriver navegador;

    public PageLogin (WebDriver navegador){
        this.navegador = navegador;
    }

    public PageLogin Login(String login){
        navegador.findElement(By.id("LoginMemberLogin2View_TextBoxUserID")).sendKeys("helder.corporate@outlook.com");

        return this;
    }

    public PageLogin Senha(String senha){
        navegador.findElement(By.id("LoginMemberLogin2View_PasswordFieldPassword")).sendKeys("123456");

        return this;
    }
    public InformationPage DadosPessoais(){
        navegador.findElement(By.id("LoginMemberLogin2View_LinkButtonLogIn")).click();

        return new InformationPage(navegador);
    }
}
