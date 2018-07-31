package TestGol;

import Pages.Confirmacao;
import Pages.MotorPage;
import Suport.Web;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import sun.security.krb5.internal.crypto.Des;

import java.lang.annotation.Documented;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "C:\\Esfera\\CompraPassagem.csv")
public class CompraPassagemPageObjects {

    private WebDriver navegador;

    @Before
    public void setUp(){navegador = Web.createChrome();}

    @Test
    public void motorDeCompra2(
            @Param(name="Origem")String Origem,
            @Param(name="Destino")String Destino,
            @Param(name="login")String Login,
            @Param(name="senha")String Senha,
            @Param(name="documento")String Documento,
            @Param(name="Cartao")String NumCartao,
            @Param(name="Nome")String Titular,
            @Param(name="cvv")String CVV,
            @Param(name="mensagem")String MensagemEsperada){

       String textoConfirma = new MotorPage(navegador)
                .Origem(Origem)
                .Destino(Destino)
                .DataIda()
                .DataVolta()
                .CompreAqui()
                .EscolherTarifaIda()
                .EscolherTarifaRetorno()
                .AceitarTermos()
                .Continuar()
                .Login(Login)
                .Senha(Senha)
                .DadosPessoais()
                .Documento(Documento)
                .noSSR1()
                .noSmiles()
                .Emergency()
                .ConfPassageiro()
                .Avancar()
                .AddBagage()
                .confirmBagage()
                .AssentoIda()
                .AssentoRetorno()
                .ConfirmAssento()
                .ConfirmSeguro()
                .Parcelas()
                .NumCartao(NumCartao)
                .Titular(Titular)
                .Data()
                .CVV(CVV)
                .ConfirmarPagamento()
                .ConfirmCompra()
                .ConfirmPassagem();

        assertEquals(MensagemEsperada, textoConfirma);
    }

    @Ignore

    public void tearDown(){

        navegador.quit();
    }
}
