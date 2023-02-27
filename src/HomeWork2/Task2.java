package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Johnson");
        driver.findElement(By.name("reg_email__")).sendKeys("johnjohnson@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
        driver.findElement(By.name("birthday_month")).sendKeys("02");
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        driver.findElement(By.name("birthday_year")).sendKeys("1983");
        Thread.sleep(3000);
        driver.findElement(By.name("sex")).sendKeys("Male");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
