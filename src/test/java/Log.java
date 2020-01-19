import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {

    public static WebDriver driver;

    @Test

    public void Login () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helena\\Downloads\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dom-kauf.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav/div[1]/div/div[1]/div/div/div[2]/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[3]/input")).sendKeys("razgul@ukr.net");
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[4]/input")).sendKeys("51283s");
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/input[2]s")).click();
    }
}
