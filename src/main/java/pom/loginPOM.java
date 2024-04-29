package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class loginPOM {

    public  WebDriver wb;
    By email = By.xpath("//input[@type='email']");
    By password =By.xpath( "//input[@type='password']");
    By button = By.xpath("//button[@type='submit']");
    public loginPOM(WebDriver wb){
        this.wb = wb;
    }
    public  loginPOM get()
    {
        wb.get("https://app.vwo.com/#/login");
        return this;
    }

    public loginPOM emailFill(String mail)
    {
        wb.findElement(email).sendKeys(mail);
        return this;

    }

    public loginPOM passwordFill(String pass)
    {
        wb.findElement(password).sendKeys(pass);
        return this;


    }

    public dashboardPOM submitButton()
    {
        wb.findElement(button).click();
        return new dashboardPOM(wb);

    }

    public loginPOM delay()
    {
        FluentWait<WebDriver> f1 = new FluentWait<>(wb);
        f1.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(email));
        return this;
    }
}
