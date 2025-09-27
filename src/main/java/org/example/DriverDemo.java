package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDemo {

    private static String getTitle(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title;
        title = driver.getTitle();
        return  title;
    }
    public static void main(String[] args) {
        String googleUrl = "https://www.google.com/";
        System.out.println(getTitle(googleUrl));
    }


}
