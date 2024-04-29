package web.VMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class allSteps {
    public static void trafficDropDown(WebDriver wb)
    {
        List<WebElement> li = wb.findElements(By.xpath("//ul[@data-qa='giguqaloro']")) ;

        Iterator<WebElement> i1 = li.iterator();
        while (i1.hasNext())
        {
            WebElement w1 = i1.next();
            if(Objects.equals(w1.getAttribute("id"),"select-box-next-option-0-0"))
            {
                w1.click();
                break;
            }


        }
    }

    public static void industryDropDown(WebDriver wb)
    {
        List<WebElement> li = wb.findElements(By.xpath("//ul[@data-qa='giguqaloro']")) ;

        Iterator<WebElement> i1 = li.iterator();
        while (i1.hasNext())
        {
            WebElement w1 = i1.next();
            if(Objects.equals(w1.getAttribute("id"),"select-box-next-option-1-0")) ////ul[@data-qa='giguqaloro']/li[@id='select-box-next-option-1-0']
            {
                w1.click();
                break;
            }


        }
    }

    public static void storeDropDown(WebDriver wb)
    {
        List<WebElement> li = wb.findElements(By.xpath("//ul[@data-qa='giguqaloro']")) ;

        Iterator<WebElement> i1 = li.iterator();
        while (i1.hasNext())
        {
            WebElement w1 = i1.next();
            if(Objects.equals(w1.getAttribute("id"),"select-box-next-option-2-1")) ////ul[@data-qa='giguqaloro']/li[@id='select-box-next-option-1-0']
            {
                w1.click();
                break;
            }


        }
    }

    public static void details(WebDriver wb, String firstName, String lastName, String phone, String password)
    {
        FluentWait <WebDriver> f3 = new FluentWait<>(wb);
        f3.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='first_name']")));
        wb.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
        wb.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
        wb.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        wb.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        wb.findElement(By.xpath("//button[@data-qa='page-su-submit']")).click();

    }

    public static void signUp(WebDriver wb,String email, String firstName, String lastName, String phone, String password)
    {
        FluentWait<WebDriver> f1 = new FluentWait<>(wb);
        f1.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa='qewoqoleka']/a")));
        wb.findElement(By.xpath("//div[@data-qa='qewoqoleka']/a")).click();

        FluentWait<WebDriver> f2 = new FluentWait<>(wb);
        f2.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
        wb.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        wb.findElement(By.xpath("//input[@id='page-v1-step1-email']")).sendKeys(email);

        wb.findElement(By.xpath("//input[@id='page-195cu-gdpr-consent-checkbox']")).click();

        wb.findElement(By.xpath("//button[@data-qa='page-su-submit']")).click();

        details(wb,firstName,lastName,phone,password);

    }

    public static void Configuration(WebDriver wb, String website)
    {
        wb.findElement(By.xpath("//input[@id='account-setup-url']")).sendKeys(website);

        trafficDropDown(wb);
        industryDropDown(wb);
        storeDropDown(wb);
        wb.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void planSelection(WebDriver wb)
    {
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Testing - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO FullStack']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Mobile App']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Personalize - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Rollouts - Web']")).click();
        wb.findElement(By.xpath("//button[@data-qa='btn-next']")).click();


    }

    public static void logOut(WebDriver wb)
    {
        wb.findElement(By.xpath("//button[@title='User menu']")).click();
        wb.findElement(By.xpath("//li[@class='dropdown-menu-list-item'][2]")).click();

    }

    public static void editProfile(WebDriver wb)
    {
        wb.findElement(By.xpath("//button[@title='User menu']")).click();
        wb.findElement(By.xpath("//li[@class='dropdown-menu-list-item'][1]")).click();

    }
   public static void reVerification(WebDriver wb)
   {
       wb.findElement(By.xpath("//div[@data-qa='btn-account-upgrade']//span[text()='Verify Now']")).click();
   }

   public static void connectToWebsite(WebDriver wb)
   {
       FluentWait<WebDriver> f1 = new FluentWait<>(wb);
       f1.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@vwo-async-click='vm.goToSmartcode()']")));
       wb.findElement(By.xpath("//button[@vwo-async-click='vm.goToSmartcode()']")).click();
   }




}
