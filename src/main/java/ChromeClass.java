package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ChromeClass {
    @Test
    void openBrowserWithDefaultMode(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Assert.assertEquals(driver.getTitle(),"Selenium");
        // driver.quit();
    }

}
