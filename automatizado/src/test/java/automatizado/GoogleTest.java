package automatizado;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleTest extends BaseTest {

    @Test
    public void devePesquisarNoGoogle() {

        org.openqa.selenium.WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("aproximadamente"));

        driver.quit();

    }
}
