package pom;

import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.webDriverParallelSession;

import java.net.MalformedURLException;

public class mainPOM {

    WebDriver wb;
    loginPOM l;
    @Parameters({"browser"})
    @BeforeTest(alwaysRun=true)
    public void sessionSet(String browser) throws MalformedURLException {
        wb = webDriverParallelSession.createSession("chrome");
        l = new loginPOM(wb);
    }

    @Parameters({"email","pass"})
    @Test(testName = "Login")
    public void loginTest(String email, String pass){
        l.get().delay().emailFill(email).passwordFill(pass).submitButton();
    }



    @AfterTest
    public void end()
    {
        webDriverParallelSession.deleteSession();
    }



}
