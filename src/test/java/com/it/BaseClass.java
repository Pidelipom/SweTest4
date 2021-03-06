package com.it;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public static WebDriver driver;
    public static JavascriptExecutor js ;

    @BeforeAll
    @DisplayName("Setup")
    public static void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();

    }

    @AfterAll
    @DisplayName("Teardown")
    public static void teardown(){
        driver.quit();
    }
}
