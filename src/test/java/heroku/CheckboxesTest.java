package heroku;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckboxesTest {
    @Test
    void testcase02() {
        // Open the browser
        // Navigate to https://the-internet.herokuapp.com/checkboxes
        // Verify the first checkbox is unchecked
        // Verify the second checkbox is checked
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // <input type="checkbox" class="sweezy-custom-cursor-default-hover">
//        driver.findElement(By.tagName("input")).isSelected();
//        driver.findElement(By.className("checkbox")).isSelected();
//        driver.findElement(By.cssSelector("sweezy-custom-cursor-default-hover")).isSelected();
//        driver.findElement(By.cssSelector("[type=submit]")).isSelected();

        String check = driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)")).getDomAttribute("checked");
        if (!driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)")).isSelected()) {
            driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)")).click();
        }
        Assert.assertTrue(driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)")).isSelected());

        check = driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)")).getDomAttribute("checked");
        if (!driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)")).isSelected()) {
            driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)")).click();
        }
        Assert.assertTrue(driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)")).isSelected());
    }

    void verifyCheckAllButton() {
        // Open the browser
        // Navigate to https://moatazeldebsy.github.io/test-automation-practices/#/checkboxes
        // Verify Check All and Uncheck All
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/checkboxes");
        wait.until(ExpectedConditions.titleContains("Test Automation Practices"));

        driver.findElement(By.xpath("//button[@data-test='check-all-button']")).click();
        driver.findElement(By.xpath("//button[@data-test='uncheck-all-button']")).click();

        Assert.assertTrue(!driver.findElement(By.xpath("//input[@data-test='checkbox-checkbox1']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@data-test='checkbox-checkbox2']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@data-test='checkbox-checkbox3']")).isSelected());
    }
}