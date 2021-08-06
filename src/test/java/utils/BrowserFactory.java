package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    // Create a method that returns a driver object. This method will
    //  take one parameter - String browser. Based on the value of browser,
    //  parameter method will return corresponded webdriver object. If
    //  browser equals to Chrome, then return chromebrowser object.
    public static WebDriver getDriver(String browser){ // 1
     // instead of "void", I used "WebDriver" cause it returns WebDriver.
     // It takes one parameter, "String browser
        // It sets up a driver and returns an object based on the parameter.

        if (browser.equalsIgnoreCase("chrome")){ // 2
        // if a browser equals to chrome (ignore case),

            WebDriverManager.chromedriver().setup(); // 3
            return new ChromeDriver(); // 4
            // it returns me a new ChromeDriver.

        } else if (browser.equalsIgnoreCase("firefox")){ // 5
            WebDriverManager.firefoxdriver().setup(); // 6
            return new FirefoxDriver(); // 7
        }
        return null; // 8
        // reason for #8, if the both #2,5 don't work, then it must return
        //  something, or the method wouldn't compile.
    }

}
