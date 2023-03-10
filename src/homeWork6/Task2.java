package homeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        /*
        HW2
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");


        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement cont = driver.findElement(By.xpath("//p"));
          cont.clear();
          cont.sendKeys("Hello World!");
          driver.switchTo().defaultContent();
          driver.close();

    }
}
