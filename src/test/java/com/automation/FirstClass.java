package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com");

        Thread.sleep(1000);

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.quit();



    }
    @Test
    public void secondTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        Thread.sleep(1000);

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.quit();



    }
    @Test
    public void thirdTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(1000);

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.quit();



    }
}

