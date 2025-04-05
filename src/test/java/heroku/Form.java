package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Form {
        void tc01() throws InterruptedException {
                WebDriver driver = new ChromeDriver();
                driver.get("https://the-internet.herokuapp.com/login");
                driver.findElement(By.id("username")).sendKeys("tomsmith");
                driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
                driver.findElement(By.cssSelector("[type=submit]")).click();

                Thread.sleep(5000); //5000 millis = 5 seconds
                Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
                Assert.assertTrue(driver.findElement(By.tagName("h4")).getText().contains("Welcome to Secure Area."));
                driver.quit();
    }
}
