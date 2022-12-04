import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost");
    }
}
