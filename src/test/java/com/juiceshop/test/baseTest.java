package com.juiceshop.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class baseTest {

    public static WebDriver driver;
    public static Properties prop;
    public static String currentDir = System.getProperty("user.dir");
    public static String baseUrl;

    public baseTest() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream(currentDir + "/application.properties");
        prop.load(ip);
    }

    @BeforeEach
    public void baseSetup(){
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");

        try {
            driver = new RemoteWebDriver(new URL("http://hub.com:4444/wd/hub"),
                    capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl=prop.getProperty("baseurl");
        driver.get(baseUrl);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
