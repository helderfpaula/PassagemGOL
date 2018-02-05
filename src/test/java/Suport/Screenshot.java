package Suport;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {

    public static void tirar(WebDriver navegador, String Arquivo) {
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(Arquivo));
        }
        catch (Exception e) {
            System.out.print("Houveram problemas ao copiar o arquivo para a pasta: " +e.getMessage());
        }
    }
}
