package Pages;

import Suport.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pagamento {
    private WebDriver navegador;

    public Pagamento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Pagamento Parcelas(){
        navegador.findElement(By.id("labelForInput2")).click();

        return this;
    }

    public Pagamento NumCartao(String senha){
        navegador.findElement(By.id("ControlGroupPayment2View_PaymentDisplayViewPaymentView2_cardNumber")).sendKeys(senha, Keys.TAB);

        return this;
    }

    public Pagamento Titular(String nome){
        navegador.findElement(By.id("ControlGroupPayment2View_PaymentDisplayViewPaymentView2_cardName")).sendKeys(nome, Keys.TAB);

        return this;
    }

    public Pagamento Data(){
        navegador.findElement(By.xpath("//*[@id=\"paymentCardsFields\"]/table[2]/tbody/tr/td[1]/div/div[1]/div/div[1]/div[1]")).click();

        try {

            Thread.sleep(2000);
        }
        catch (Exception ex) {
        }

        navegador.findElement(By.xpath("//*[@id=\"paymentCardsFields\"]/table[2]/tbody/tr/td[1]/div/div[1]/div/div[2]/div[8]")).click();

        return this;
    }

    public Pagamento CVV(String cvv){
        navegador.findElement(By.id("ControlGroupPayment2View_PaymentDisplayViewPaymentView2_cardSecurityCode")).sendKeys(cvv);
        return this;

    }

    public ResumoCompra ConfirmarPagamento(){
        navegador.findElement(By.id("LinkButtonSubmitFake")).click();

        return new ResumoCompra(navegador);
    }
}
