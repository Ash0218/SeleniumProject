package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice2 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement input = driver.findElement(By.name("email"));
        input.sendKeys("random@email.com", Keys.ENTER);

        WebElement confimationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";

        String actualMessage = confimationMessage.getText();

        if (expectedMessage.equals(actualMessage)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        BrowserUtils.wait(2);
        driver.close();
    }
}
