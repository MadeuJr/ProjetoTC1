package scl.ifsp.tc1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationTest {

    private static WebDriver driver;

    @BeforeAll
    public static void initializeDriver() {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://localhost/ProjetoPT2/index.html");
        driver.manage().window().maximize();
    }


    @Test
    @Order(1)
    @DisplayName("Teste Nav link Home")
    public void testaHiperPrincipal() {
        WebElement hiperLinkPrincipal = driver.findElement(By.partialLinkText("Home"));
        hiperLinkPrincipal.click();
        String url = "http://localhost/ProjetoPT2/index.html";
        assertEquals(url, driver.getCurrentUrl());
    }
    @Test
    @Order(2)
    @DisplayName("Teste Nav link Seguradoras")
    public void testaHiperSeguradora() {
        WebElement hiperLinkSeguradoras = driver.findElement(By.partialLinkText("Seguradoras"));
        hiperLinkSeguradoras.click();
        String url = "http://localhost/ProjetoPT2/seguradoras.html";
        assertEquals(url, driver.getCurrentUrl());
    }
    @Test
    @Order(3)
    @DisplayName("Teste Nav link Veiculos")
    public void testaHiperVeiculos() {
        WebElement hiperLinkSeguradoras = driver.findElement(By.partialLinkText("Veiculos"));
        hiperLinkSeguradoras.click();
        String url = "http://localhost/ProjetoPT2/veiculos.html";
        assertEquals(url, driver.getCurrentUrl());
    }
    @Test
    @Order(4)
    @DisplayName("Teste Nav link Logo")
    public void testaHiperLogo() {
        WebElement hiperLinkSeguradoras = driver.findElement(By.partialLinkText("SEGUROS ABSOLUTE"));
        hiperLinkSeguradoras.click();
        String url = "http://localhost/ProjetoPT2/index.html";
        assertEquals(url, driver.getCurrentUrl());
    }
}
