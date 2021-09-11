package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("111gurkanciftci@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456qwer");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot Password?").click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();










    }
}
