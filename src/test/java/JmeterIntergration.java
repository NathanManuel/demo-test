import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JmeterIntergration {

    @Test
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carme\\IdeaProjects\\PerformanceAndDbProject\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
    }
}
