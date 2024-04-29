package web.VMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;

public class VMOAuto {

    public void trafficDropDown(WebDriver wb)
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

    public void industryDropDown(WebDriver wb)
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
    ////ul[@data-qa='giguqaloro']/li[@id='select-box-next-option-2-1']
    public void storeDropDown(WebDriver wb)
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
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ChromeOptions co = new ChromeOptions();
        WebDriver wb = new RemoteWebDriver(new URL("http://192.168.1.4:4444"),co);

        wb.get("https://app.vwo.com/#/login");

        wb.findElement(By.xpath("//div[@data-qa='qewoqoleka']/a")).click();

        FluentWait <WebDriver> f2 = new FluentWait<>(wb);
        f2.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
        //Signup
        wb.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        wb.findElement(By.xpath("//input[@id='page-v1-step1-email']")).sendKeys("cyb3rark97@gmail.com");

        wb.findElement(By.xpath("//input[@id='page-195cu-gdpr-consent-checkbox']")).click();

        wb.findElement(By.xpath("//button[@data-qa='page-su-submit']")).click();


        //Details

        FluentWait <WebDriver> f3 = new FluentWait<>(wb);
        f3.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='first_name']")));
        wb.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Raf");
        wb.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Fer");
        wb.findElement(By.xpath("//input[@name='phone']")).sendKeys("9886513772");
        wb.findElement(By.xpath("//input[@name='password']")).sendKeys("Rafelia14041997");
        wb.findElement(By.xpath("//button[@data-qa='page-su-submit']")).click();




        //configuration
        wb.findElement(By.xpath("//input[@id='account-setup-url']")).sendKeys("testark97.blog");
        VMOAuto v = new VMOAuto();
        v.trafficDropDown(wb);
        v.industryDropDown(wb);
        v.storeDropDown(wb);
        wb.findElement(By.xpath("//button[@type='submit']")).click();


        //Plan selection
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Testing - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO FullStack']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Mobile App']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Personalize - Web']")).click();
        wb.findElement(By.xpath("//div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Rollouts - Web']")).click();




        ////div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO FullStack']
        ////div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Web']
        ////div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Insights - Mobile App']
        ////div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Personalize - Web']
        ////div[@class='Fxg(1)']//div[@class='Fxg(1)']/h5[text()='VWO Rollouts - Web']



        wb.findElement(By.xpath("//button[@data-qa='btn-next']")).click();

        //Reverification
        wb.findElement(By.xpath("//div[@data-qa='btn-account-upgrade']//span[text()='Verify Now']")).click();

        //Logging out
        wb.findElement(By.xpath("//button[@title='User menu']")).click();
        wb.findElement(By.xpath("//li[@class='dropdown-menu-list-item'][2]")).click();

        //Edit profile
        wb.findElement(By.xpath("//button[@title='User menu']")).click();
        wb.findElement(By.xpath("//li[@class='dropdown-menu-list-item'][1]")).click();


        wb.quit();
        //webelement list selection

        //register for a website and continue
        //TESTNG FRAME WORK PARALLEL EXECUTION AND NORMAL
        //CUCUMBER
        //POM
        //do with csselector
    }

}
