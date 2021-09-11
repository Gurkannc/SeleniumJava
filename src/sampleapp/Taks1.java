package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taks1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String url= driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

}
