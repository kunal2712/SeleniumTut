package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class DriverDemo {

    private static String getTitle(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title;
        title = driver.getTitle();
        return  title;
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Using different types of Locators in Selenium Web Driver

        WebElement usernameInputField = driver.findElement(By.id("username"));

        // Using xPath and css selector
        WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("input[id='username']"));


        /*
         For manual verification of Xpath and CSS selector
         Run the following commands on console in inspect window

         For xPath --> $x('//*[@id="username"]')

         For css --> $$('#username')

         */

        WebElement passwordInputField = driver.findElement(By.name("password"));
        WebElement submitBtn = driver.findElement(By.className("btn"));

        // Getting all elements by tag type
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        // Link and Partial Link Text
        WebElement footerLink = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement footerPartialLink = driver.findElement(By.partialLinkText("Test Automation"));

        // Locating elements using RelativeLocator
        WebElement relativePasswordLocate = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement relativeFooterLinkLocate = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("Practice Test Automation.")));

        // For comppund class names example for home button look for unique substring in classname
        // Example : class="menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-43" ---> "menu-item-home"
        WebElement homeButtonSelector = driver.findElement(By.className("menu-item-home"));

    }


}
