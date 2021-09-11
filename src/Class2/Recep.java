package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Recep {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        if(title.equals("Facebook - Log in or Sing up")) {
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is Wrong");
        }
         driver.quit();











    }



}
