package haroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class formAuthenticationTest {
    void tc01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        //css = Tag[Attribute='value'] or css = [Attribute='value']
        //xpath = //Tag[@Attribute='value'] or xpath = //*[@Attribute='value'] with * means any tag
        //Double slash // mang ý nghĩa Tuong doi, có thể thay đổi được

        //Username: Tagname: Input. Attribute: name, id. Text: null
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
        //Locator string //input[@name='username'] can be inputted to the search box of the browser > F12 Console tab to find the element

        //Password: Tagname: Input. Attribute: type, name, id, fdprocessedid. Text: null
        //List out possible locators for password field
        [type=text]
        input[type=password]
        input#password
        *[@id='password']
        //input[@id='password']
        #password
        [name=username]
    }
}
