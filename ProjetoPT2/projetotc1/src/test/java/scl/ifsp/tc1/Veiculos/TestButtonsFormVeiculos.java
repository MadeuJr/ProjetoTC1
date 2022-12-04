package scl.ifsp.tc1.Veiculos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestButtonsFormVeiculos {
    private static WebDriver driver;

    @BeforeAll
    public static void initializeDriver() {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://localhost/ProjetoPT2/veiculos.html");
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Teste Botão Cadastrar Veículo")
    public void testBTCadastrar() {
        WebElement btCadastrar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/button"));
        btCadastrar.click();
        try {
            WebElement formCadastro = driver.findElement(By.name("placaL"));
            assertTrue(formCadastro.isDisplayed());
        } catch (NullPointerException e) {
            System.out.println("Formulário não encontrado");
            throw e;
        }
    }
    @Test
    @Order(2)
    @DisplayName("Teste Botão Cadastrar Veículo")
    public void testBTExcluir() {
        WebElement btExcluir = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/button"));
        btExcluir.click();
        try {
            WebElement confirmExclude = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/fieldset/div/input"));
            assertTrue(confirmExclude.isDisplayed());
        } catch (NullPointerException e) {
            System.out.println("Formulário não encontrado");
            throw e;
        }
    }
    @Test
    @Order(3)
    @DisplayName("Teste Botão Cadastrar Veículo")
    public void testBTAlterar() {
        WebElement btAlterar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/button"));
        btAlterar.click();
        try {
            WebElement idSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/fieldset/div[1]/select"));
            assertTrue(idSelect.isDisplayed());
        } catch (NullPointerException e) {
            System.out.println("Formulário não encontrado");
            throw e;
        }
    }
}
