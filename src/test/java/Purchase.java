

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purchase {

    public static WebDriver driver;

    @Test

    public void Login () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helena\\Downloads\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dom-kauf.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div[2]/a[1]/div/div/img")).click();
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/div/div[1]/article/div/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div[2]/a")).click();


    }
}











