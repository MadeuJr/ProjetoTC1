package scl.ifsp.tc1.Seguradoras;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestInputsFormSeguradoras {
    private static WebDriver driver;

    @BeforeAll
    public static void initializeDriver() {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://localhost/ProjetoPT2/seguradoras.html");
        driver.manage().window().maximize();
        WebElement btCadastrar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/button"));
        btCadastrar.click();
    }

    @ParameterizedTest
    @Order(1)
    @ValueSource(strings = {"52710973000118", "92149675000115", "44510011000197", "abcdefghijklmnop", "ABCDEFGHIJKLMNOP", "445100110001a7"})
    @DisplayName("Teste CNPJ seguradora")
    public void testinputCNPJ(String valores) {
        
        WebElement inputPlaca = driver.findElement(By.name("segCNPJ"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys(valores);
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }

    @Test
    @Order(2)
    @DisplayName("Teste Input Razão Social")
    public void testInputRazao() {
        WebElement razaoSocial = driver.findElement(By.name("segRazaoSoc"));
        razaoSocial.clear();
        razaoSocial.sendKeys("Seguradora do seu Juao");
        assertAll(
            () -> assertTrue(razaoSocial.isEnabled()),
            () -> assertEquals("Seguradora do seu Juao", razaoSocial.getAttribute("value"))
        );
    }

    @Test
    @Order(3)
    @DisplayName("Teste Input Data de inicio")
    public void testInputDataInicio() {
        WebElement segInitDate = driver.findElement(By.name("segInitDate"));
        segInitDate.clear();
        segInitDate.sendKeys("05092000");
        assertAll(
            () -> assertTrue(segInitDate.isEnabled()),
            () -> assertEquals("2000-09-05", segInitDate.getAttribute("value"))
        );
    }

    @ParameterizedTest
    @Order(4)
    @ValueSource(strings = {"gael_dasilva@agreonoma.br", "claricegalvao78@pharmaterra.com", "abc#def@mail.com", "abc..def@mail.com", "ABCDEFGHIJKLMNOP", "445100110001a7"})
    @DisplayName("Teste Email seguradora")
    public void testinputEmail(String valores) throws InterruptedException {
        
        WebElement inputEmail = driver.findElement(By.name("segEmail"));
        WebElement result = driver.findElement(By.id("result"));
        WebElement segInitDate = driver.findElement(By.name("segInitDate"));
        inputEmail.clear();
        inputEmail.sendKeys(valores);
        segInitDate.click();
        
        assertAll(
            () -> assertTrue(inputEmail.isEnabled()),
            () -> assertNotEquals(result.getText(), "E-mail inválido, insira um e-mail válido")
        );
    }

    @ParameterizedTest
    @Order(4)
    @ValueSource(strings = {"12313213123", "41098454191", "123asdasfsa", "12354ASD12351"})
    @DisplayName("Teste Email seguradora")
    public void testinputTelefone(String valores) {
        
        WebElement telefone = driver.findElement(By.name("segTel"));
        String corEsperada = "rgb(233, 50, 45)";
        telefone.clear();
        telefone.sendKeys(valores);
        
        assertAll(
            () -> assertTrue(telefone.isEnabled()),
            () -> assertNotEquals(telefone.getCssValue("border-color"), corEsperada)
        );
    }

    @ParameterizedTest
    @Order(5)
    @ValueSource(strings = {"1", "2", "3", "4"})
    @DisplayName("Teste Deletar Select ID Seguradora")
    public void testDeleteID(String valores) {
        
        WebElement btDelete = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/button"));
        btDelete.click();
        WebElement tipo = driver.findElement(By.name("idSeg"));
        Select tipoSelect = new Select(tipo);
        tipoSelect.selectByValue(valores);
        assertAll(
            () -> assertTrue(tipo.isEnabled())
        );
    }

}
