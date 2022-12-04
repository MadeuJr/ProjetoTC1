package scl.ifsp.tc1.Veiculos;

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

public class TestInputsFormVeiculos {
    
    private static WebDriver driver;

    @BeforeAll
    public static void initializeDriver() {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://localhost/ProjetoPT2/veiculos.html");
        driver.manage().window().maximize();
        WebElement btCadastrar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/button"));
        btCadastrar.click();
    }

    
    
    @ParameterizedTest
    @Order(1)
    @DisplayName("Teste Input Placa Letras ")
    // Teste ABC é um Valor válido
    @ValueSource(strings = {"abc", "AbC" ,"ABc", "aBC", "123", "ABC", "ABCD"})
    public void testInputLetras(String valores) throws InterruptedException {
        WebElement inputPlaca = driver.findElement(By.name("placaL"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys(valores);
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }

    @ParameterizedTest
    @Order(2)
    @DisplayName("Teste Input Placa Numeros")
    // Teste 1234 é um Valor válido
    @ValueSource(strings = {"abc", "AbC" ,"ABc", "aBC", "1234", "ABC", "12345", "1a2345"})
    public void testInputNumeros(String valores) {
        WebElement inputPlaca = driver.findElement(By.name("placaN"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys(valores);
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }

    @ParameterizedTest
    @Order(3)
    @DisplayName("Teste Input Placa Estado")
    // Teste Com duas Letras Maiusculas  no começo é um Valor válido
    @ValueSource(strings = {"abc", "AbC" ,"ABc", "aBC", "1234", "ABC", "12345", "1a2345", "SP"})
    public void testInputEstado(String valores) {
        WebElement inputPlaca = driver.findElement(By.name("placaEstado"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys(valores);
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }

    @Test
    @Order(4)
    @DisplayName("Teste Input Placa Cidade")
    public void testInputCidade() {
        WebElement inputPlaca = driver.findElement(By.name("placaCidade"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys("São Carlos");
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }

    @ParameterizedTest
    @Order(5)
    @ValueSource(strings = {"Carro", "Moto"})
    @DisplayName("Teste Input Tipo veiculo")
    public void testInputTipo(String valores) {
        WebElement tipo = driver.findElement(By.name("tipo"));
        Select tipoSelect = new Select(tipo);
        tipoSelect.selectByValue(valores);
        assertAll(
            () -> assertTrue(tipo.isEnabled())
        );
    }

    @Test
    @Order(6)
    @DisplayName("Teste Input marca veiculo")
    public void testInputMarca() {
        WebElement marca = driver.findElement(By.name("vMarca"));
        marca.clear();
        marca.sendKeys("Honda");
        assertAll(
            () -> assertTrue(marca.isEnabled()),
            () -> assertEquals("Honda", marca.getAttribute("value"))
        );
    }

    @Test
    @Order(7)
    @DisplayName("Teste Input Modelo veiculo")
    public void testInputModelo() {
        WebElement modelo = driver.findElement(By.name("vModelo"));
        modelo.clear();
        modelo.sendKeys("HB20");
        assertAll(
            () -> assertTrue(modelo.isEnabled()),
            () -> assertEquals("HB20", modelo.getAttribute("value"))
        );
    }

    @ParameterizedTest
    @Order(8)
    @ValueSource(strings = {"1234", "1980", "2023", "2000", "2024", "Abcd"})
    @DisplayName("Teste Input Ano veiculo")
    public void testInputAno(String valores) {
        WebElement inputPlaca = driver.findElement(By.name("vAno"));
        String corEsperada = "rgb(233, 50, 45)";
        inputPlaca.clear();
        inputPlaca.sendKeys(valores);
        assertAll(
            () -> assertTrue(inputPlaca.isEnabled()),
            () -> assertNotEquals(inputPlaca.getCssValue("border-color"), corEsperada)
        );
    }


    @ParameterizedTest
    @Order(9)
    @ValueSource(strings = {"Gasolina", "Alcool", "Flex", "Diesel"})
    @DisplayName("Teste Input Tipo veiculo")
    public void testInputCombustivel(String valores) {
        WebElement tipo = driver.findElement(By.name("combustivel"));
        Select tipoSelect = new Select(tipo);
        tipoSelect.selectByValue(valores);
        assertAll(
            () -> assertTrue(tipo.isEnabled())
        );
    }

    @ParameterizedTest
    @Order(10)
    @ValueSource(strings = {"checkbox-1", "checkbox-2", "checkbox-3", "checkbox-4", "checkbox-5", "checkbox-6", "checkbox-7" , "checkbox-8"})
    @DisplayName("Teste Input checkbox veiculo")
    public void testInputRadio(String valores) {
        WebElement inputRadio = driver.findElement(By.name(valores));
        String corEsperada = "rgb(66, 91, 118)";
        inputRadio.click();
        assertAll(
            () -> assertTrue(inputRadio.isEnabled()),
            () -> assertNotEquals(inputRadio.getCssValue("background-color"), corEsperada)
        );
    }
    
    @ParameterizedTest
    @Order(11)
    @ValueSource(strings = {"1", "2", "3", "4"})
    @DisplayName("Teste Deletar Select ID veiculo")
    public void testDeleteID(String valores) {
        
        WebElement btDelete = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/button"));
        btDelete.click();
        WebElement tipo = driver.findElement(By.name("idVeículo"));
        Select tipoSelect = new Select(tipo);
        tipoSelect.selectByValue(valores);
        assertAll(
            () -> assertTrue(tipo.isEnabled())
        );
    }

}
