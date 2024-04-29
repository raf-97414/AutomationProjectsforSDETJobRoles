package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class webDriverSession {
    public static WebDriver wb;
    public static WebDriver createSession(String browser) throws MalformedURLException {
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions co = new ChromeOptions();
            wb = new RemoteWebDriver(new URL("http://192.168.0.163:4444"), co);
        }

        else {
            FirefoxOptions fo = new FirefoxOptions();
            wb = new RemoteWebDriver(new URL("http://192.168.0.163:4444"), fo);

        }


        return wb;
    }

    public static WebDriver getSession(String browser) throws MalformedURLException {

        return createSession(browser);

    }

    public static void deleteSession(String browser) throws MalformedURLException {

        getSession(browser).quit();

    }}

