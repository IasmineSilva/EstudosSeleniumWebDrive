package automatizado;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.postgresql.util.ByteConverter;

import com.testsigma.sdk.WebElement;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String CAMINHO_DRIVER = "automatizado//resources//chromedriver-v125.0.6422.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
        ;
    }

    @Test
    public void devePesquisarNoGoogle() {
        iniciar();

        org.openqa.selenium.WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("aproximadamente"));

        driver.quit();

    }
}
