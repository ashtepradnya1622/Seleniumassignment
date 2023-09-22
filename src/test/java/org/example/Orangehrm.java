package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class Orangehrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        // driver.get("https://narayantomar47-trials710.orangehrmlive.com/auth/seamlessLogin");
        driver.get("https://pradny-trials710.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Du5qh1K@FF");
        // Thread.sleep(2000);
        //driver.findElement(By.xpath("//label[@class='remember-me-field']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //  js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.cssSelector("ul li:nth-child(11)")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(("noncoreIframe"));
        driver.findElement(By.cssSelector("#addItemBtn i")).click();
        //Actions a=new Actions(driver);
        //driver.switchTo().defaultContent();

    }
}





