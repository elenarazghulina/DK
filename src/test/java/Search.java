import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search{

    public static WebDriver driver;

    @Test

    public void Login () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helena\\Downloads\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dom-kauf.com/");
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/input[2]")).sendKeys("Молоток для отбивания мяса");
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/button")).click();


    }
}
