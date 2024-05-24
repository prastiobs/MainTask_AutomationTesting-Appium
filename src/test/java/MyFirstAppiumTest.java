package com.training;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

public class AppiumTest {
    public static void main(String[] args) throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity",".ApiDemos");
        AndroidDriver<AndroidElement> driver =
                new AndroidDriver<AndroidElement>(new URL("0.0.0.0:4723"),capabilities);

        driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720")
                .withTimeLimit(Duration.ofSeconds(200)));

       driver.findElementByAccessibilityId("Views").click();
       driver.findElementByAccessibilityId("Drag and Drop").click();
    }

}