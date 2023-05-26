package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/text-box");
        System.out.println("Enter URL Textbox");

        driver.findElement(By.id("userName")).sendKeys("Juara Coding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeAsyncScript("windows.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();
        System.out.println("Button submit clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Close Browser");
    }
}