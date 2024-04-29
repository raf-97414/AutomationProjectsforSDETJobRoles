package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class webDriverParallelSession {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static void setSession(String browser) throws MalformedURLException {
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions co = new ChromeOptions();
            driver.set(new RemoteWebDriver(new URL("http://127.0.0.1:4444"), co));
        }

        else {
            FirefoxOptions fo = new FirefoxOptions();
            driver.set(new RemoteWebDriver(new URL("http://127.0.0.1:4444"), fo));

        }


    }

    public static WebDriver getSession() {

        return driver.get();

    }

    public static WebDriver createSession(String browser) throws MalformedURLException {
       setSession(browser);
       return getSession();
    }
    public static void deleteSession() {

      driver.remove();

    }
}
