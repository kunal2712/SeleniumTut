package com.practice.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NegativeLoginTests {

    @Test
    public  void testIncorrectUsername(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameElement = driver.findElement(By.id("username"));
        usernameElement.sendKeys("IncorrectUsername");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Password123");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());


        String errorString = "Your username is invalid!";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals( actualErrorMessage , errorString);


        driver.quit();
    }
}
