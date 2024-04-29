package web.VMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class testNgVMO {
    WebDriver wb ;
    @BeforeTest
    public void preSteps() throws MalformedURLException {
        ChromeOptions co = new ChromeOptions();
        wb = new RemoteWebDriver(new URL("http://192.168.0.163:4444"),co);
        wb.get("https://app.vwo.com");

    }

    @Parameters({"email","firstName","lastName","phone","password","website"})
    @Test(testName = "chrome")
    public void Register(String email, String firstName, String lastName, String phone, String password, String website){
        allSteps.signUp(wb, email, firstName, lastName, phone, password);
        allSteps.Configuration(wb,website);
        allSteps.planSelection(wb);
        allSteps.connectToWebsite(wb);
    }

    @AfterTest
    public void postSteps()
    {
        allSteps.logOut(wb);
        wb.quit();
    }
}
