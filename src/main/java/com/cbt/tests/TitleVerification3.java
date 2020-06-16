package com.cbt.tests;

import static com.cbt.utilities.BrowserFactory.*;
import static com.cbt.utilities.StringUtility.*;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    private static WebDriver driver;
    private  static  List<String> urls = Arrays.asList("https://luluandgeorgia.com",
            "https://wayfair.com",
            "https://www.westelm.com",
            "https://walmart.com");

    public static void generic1(String str) throws InterruptedException {
        driver= getDriver("chrome");
        driver.get(str);
        Thread.sleep(1000);
        String title=driver.getTitle().toLowerCase().replace(" ", "");
        verifyEquals(str.contains(title));
        closeDriver();

    }

    public static void main(String[] args) throws InterruptedException {
        for (String url: urls)
        {
            generic1(url);
        }
    }
}
