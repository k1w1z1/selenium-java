package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FormAuthenticationTest {
    void tc01() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

//        By usernameInput = RelativeLocator
//                .with(By.tagName("input"))
//                .below(By.xpath()

        // css = Tag[Attribute='value'] or css = [Attribute='value']
        // xpath = //Tag[@Attribute='value'] or xpath = //*[@Attribute='value'] with * means any tag
        // Double slash // mang ý nghĩa Tuong doi, có thể thay đổi được

//        Username field: <input type="text" name="username" id="username" fdprocessedid="nlb5zw">
//        - Tagname: Input
//        - Attribute: name, id
//        - Text: null
        driver.findElement(By.tagName("input")).sendKeys("tomsmith");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("username")).sendKeys("tomsmith");

        driver.findElement(By.cssSelector("[type=text]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");

        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

        driver.findElement(By.cssSelector("[name=username]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("tomsmith");
        // Locator string //input[@name='username'] can be inputted to the search box of browser > F12 Console tab to find the element
        // Locator string is Case Sensitive (e.g. username != Username)

//        Password field: <input type="password" name="password" id="password" fdprocessedid="62mvkv">
//        - Tagname: Input
//        - Attributes: name, id
//        - Text: null
//        List out possible locators for password field
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

//        Login button: <button class="radius" type="submit" fdprocessedid="vwjgfue"><i class="fa fa-2x fa-sign-in"> Login</i></button>
//        - Tagname: button
//        - Attributes: class, type
//        - Text: Login
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector(".radius")).click();
        driver.findElement(By.cssSelector("[type=submit]")).click();

        Thread.sleep(5000); //5000 millis = 5 seconds
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(driver.findElement(By.tagName("h4")).getText().contains("Welcome to Secure Area."));
    }
}