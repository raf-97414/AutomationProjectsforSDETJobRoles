package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.beans.Visibility;
import java.time.Duration;

public class RedBus {

  public static void main(String[] args) throws InterruptedException {
    WebDriver wb = new ChromeDriver();
    wb.get("https://www.redbus.in/");
    wb.findElement(By.xpath("//input[@id='src']")).sendKeys("Ben");//@class='sc-gZMcBi grvhsy'
    FluentWait <WebDriver> wait = new FluentWait<>(wb);
    wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-VigVT ishpWr']/ul[@class='sc-dnqmqq eFEVtU']/li[1]")));
    wb.findElement(By.xpath("//div[@class='sc-VigVT ishpWr']/ul[@class='sc-dnqmqq eFEVtU']/li[2]")).click();
    wb.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mum");
    wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-VigVT ishpWr']/ul[@class='sc-dnqmqq eFEVtU']/li[1]")));
    wb.findElement(By.xpath("//div[@class='sc-VigVT ishpWr']/ul[@class='sc-dnqmqq eFEVtU']/li[1]")).click();
    //wb.findElement(By.xpath("")).click();

    wb.findElement(By.xpath("//div[@id='onwardCal']//i")).click();

    wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='onwardCal']//i")));
    String month = wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-jzJRlG dPBSOp']//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();

    //counter to record number of clicks we make to reach a month
    for (int counter = 40; counter>=0; counter--)
    {
      wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-jzJRlG dPBSOp']//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
      String month1 = wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-jzJRlG dPBSOp']//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();

      if(month1.contains("Jun") && month1.contains("2025"))
      {
        wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-jzJRlG dPBSOp']/div/div//div[3]//span[text()='12']")).click();
        //String dateAndMonth = wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-kAzzGY llxTcS']/text[2]")).getText();
        //String year = wb.findElement(By.xpath("//div[@id='onwardCal']//div[@class='sc-kAzzGY llxTcS']/text[3]")).getText();


        //System.out.println(dateAndMonth + " " + year);proof to see if desired date is chosen

        break;
      }




    }

    wb.findElement(By.xpath("//button")).click();





  }

}
