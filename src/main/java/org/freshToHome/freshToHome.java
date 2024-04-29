package org.freshToHome;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class freshToHome {
    public static void main(String[] args) {
       try {
           UiAutomator2Options ui = new UiAutomator2Options();
           //we tell which device which app to connect to while creating the session for an Android app
           ui.amend("appium:platformName", "Android")
                   .amend("appium:automationName", "uiautomator2")
                   .amend("appium:deviceName", "emulator-5554")
                   .amend("appium:appPackage", "com.freshtohome")
                   .amend("appium:appActivity", "com.freshtohome.MainActivity")
                   .amend("appium:uiautomator2ServerLaunchTimeout", "60000");

           //Intializing Android driver to connect to the app and perform tasks
           AndroidDriver ad = new AndroidDriver(new URL("http://127.0.0.1:4723/"), ui);

           //initialising a variable to set fluent wait mechanisms for connecting to Android Elements
           FluentWait<AndroidDriver> f1 = new FluentWait<AndroidDriver>(ad);

           //To set location on the FreshToHome app
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='getStarted']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='getStarted']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='currentLocation']")));
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='pincodeInput']")).sendKeys("560032");
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='locality-RT Nagar']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='locality-RT Nagar']")).click();

           //To turn on location tracking on Android phone
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
           ad.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();

           //Going to Account Activity
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@resource-id='Account']")));
           ad.findElement(By.xpath("//android.view.View[@resource-id='Account']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='signInButton']")));
           //Signing in the app with phone number
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='signInButton']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='phoneNumber']")));
           ad.findElement(By.xpath(" //android.widget.EditText[@resource-id='phoneNumber']")).sendKeys("9916633772");
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='login']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='login']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='otpInput0']")));
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='otpInput0']")).sendKeys("0");
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='otpInput1']")).sendKeys("0");
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='otpInput2']")).sendKeys("0");
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='otpInput3']")).sendKeys("0");
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();
           //To access contact option in Account activity
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='Contact']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='Contact']")).click();
           //f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='goToMap-FreshToHome - Brook Field']")));
           //ad.findElement(By.xpath("//android.widget.TextView[@resource-id='goToMap-FreshToHome - Brook Field']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();
           //FAQ Section on Account Activity
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='Faq']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='Faq']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='What about antibiotics in the Chicken?']")));
           ad.findElement(By.xpath("//android.widget.TextView[@text='What about antibiotics in the Chicken?']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();

           //Home Activity
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@resource-id='Home']")));
           ad.findElement(By.xpath("//android.view.View[@resource-id='Home']")).click();
           //Searching for an item prawns on Home Activity in Search tab
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Search']")));
           ad.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='search']")));
           ad.findElement(By.xpath("//android.widget.EditText[@resource-id='search']")).sendKeys("prawns");
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='clearSearch']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='clearSearch']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();

           //select a banner image
        /*f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='bannerImagePress'][1]")));
        ad.findElement(By.xpath("//android.widget.ImageView[@resource-id='bannerImagePress'][1]")).click();
        ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='closeButton']")).click();
         */
           //select a banner image of getting membership
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='bannerImagePress'][4]")));
           ad.findElement(By.xpath("//android.widget.ImageView[@resource-id='bannerImagePress'][4]")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='vipPlan-4372']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='vipPlan-4372']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='addPlanToCart']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();

           //Select a product and adding a product to cart and going to cart to view item
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='productCard-1177']//android.widget.TextView[@text='ADD']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='productCard-1177']//android.widget.TextView[@text='SELECT']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='goToCart']")));
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goToCart']")).click();

           //To select favorites activity
           ad.findElement(By.xpath("//android.view.View[@resource-id='Favorites']")).click();

           //To select categories activity and select combo pack
           ad.findElement(By.xpath("//android.view.View[@resource-id='Categories']")).click();
           ad.findElement(By.xpath("//android.widget.TextView[@text='Combo Packs']")).click();
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='goBack']")).click();

           //To select Cart Activity and increase the items quantity by 1
           ad.findElement(By.xpath("//android.view.View[@resource-id='Cart']")).click();
           f1.withTimeout(Duration.ofSeconds(6000)).pollingEvery(Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='+']")));
           ad.findElement(By.xpath("//android.widget.TextView[@text='+']")).click();
           //To checkout
           ad.findElement(By.xpath("//android.view.ViewGroup[@resource-id='proceedToCheckoutButton']")).click();

       }catch (MalformedURLException m)
       {
           System.out.println("Please enter a url in format - https://url.com or http://url.com");
       }

    }
}
