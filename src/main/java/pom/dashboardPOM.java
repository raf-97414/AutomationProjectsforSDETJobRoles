package pom;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class dashboardPOM {
    public WebDriver wb;
    public dashboardPOM(WebDriver wb)
    {
        this.wb = wb;

    }

    public dashboardPOM insightsDropDown()
    {
        wb.findElement(By.xpath("//button[@vwo-simple-collapsible='insights']/span")).click();
        return this;
    }

    public dashboardPOM forms()
    {
       wb.findElement(By.xpath("//button[@vwo-simple-collapsible='insights']//a[@ui-sref='analyze.form-analysis']")).click();
       return this;
    }
    public dashboardPOM startTrackingForms()
    {
        wb.findElement(By.xpath("//button[data-qa='rumuhacelo']")).click();
        return this;
    }

    public dashboardPOM manualSetUp()
    {
        wb.findElement(By.xpath("//label[data-qa='pusefegudo']")).click();
        return this;

    }

    public dashboardPOM websiteEntering(String url)
    {
        wb.findElement(By.xpath("//div[@class='input-wrapper--static-validation'")).sendKeys(url);
        return this;
    }



    public dashboardPOM enableScheduling()
    {
        wb.findElement(By.xpath("//svg[@class='checkbox-radio-icon']")).click();
        return this;

    }

    public dashboardPOM createButton()
    {
        wb.findElement(By.xpath("//button[@vwo-async-click='gotoNextStep()'")).click();
        return this;

    }

    public dashboardPOM delayWait()
    {
        FluentWait <WebDriver> f1 = new FluentWait<>(wb);
        f1.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='navbar ng-scope collapsed']")));
        return this;
    }

}
