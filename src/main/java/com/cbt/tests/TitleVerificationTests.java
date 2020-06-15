package com.cbt.tests;

import org.openqa.selenium.WebDriver;
import static com.cbt.utilities.BrowserFactory.*;
import static com.cbt.utilities.StringUtility.*;
import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");
        WebDriver driver=getDriver("chrome");
        String dummy="";
        for (int i=0;i<2;i++)
        {
         driver.get(urls.get(i));
         Thread.sleep(1000);
         dummy=driver.getTitle();
         driver.get(urls.get(i+1));
         verifyEquals(dummy, driver.getTitle());

        }
        closeDriver();
    }
}
