package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    @Test
     public void firstHomeTest() throws InterruptedException {
          WebDriverManager.chromedriver().setup();

          WebDriver driver = new ChromeDriver();

          driver.get("https://www.amazon.com");

          Thread.sleep(500);

          driver.manage().window().fullscreen();

          Thread.sleep(500);

          driver.manage().window().minimize();

           Thread.sleep(500);

          driver.manage().window().maximize();


          driver.quit();






        // driver.findElement(By.name("serch")).sendKeys("watch");

      //  Thread.sleep(500);

          //driver.findElement(By.linkText("About")).click();



       // amzdriver.findElement(By.name("username"));

          //amzdriver.getPageSource();



     }

}
