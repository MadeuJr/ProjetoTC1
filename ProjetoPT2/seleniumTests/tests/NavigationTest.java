import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    
    @BeforeAll
    public static void name() {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/s10e03_DropDownListValidandoMsg.html");
    }


}
