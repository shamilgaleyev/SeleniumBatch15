package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement enterMessage = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        enterMessage.sendKeys("Batch15");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        WebElement a = driver.findElement(By.xpath("//input[@id='sum1']"));
        a.sendKeys("3");
       WebElement b = driver.findElement(By.xpath("//input[@id='sum2']"));
       b.sendKeys("7");
        driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
        WebElement total = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        System.out.println(total.getText());
    }
}
