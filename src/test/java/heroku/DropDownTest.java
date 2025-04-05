package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
//import.org.testng.annotations.Test;

public class DropDownTest {
    void tc01() {
        // Open the browser
        // Navigate to https://the-internet.herokuapp.com/dropdown
        // Select Option 1. Verify Option 1 is selected

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));

        select.selectByVisibleText("Option 1");
        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Option 1']")).isSelected());

        select.selectByValue("1");
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='1']")).isSelected());

        select.deselectByIndex(1);
        Assert.assertTrue(driver.findElement(By.xpath("//select/option[1]")).isSelected());

        // driver.quit();
    }

    @Test
    void ableSelectMultipleOptions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));
        Assert.assertTrue(select.isMultiple());

        select.selectByVisibleText("Banana");
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Grape");

        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Banana']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Apple']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//option[.='Apple']")).isSelected());

    }
}