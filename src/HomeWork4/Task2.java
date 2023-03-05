package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
    1. u need to write down the code that can select  1 check box out of 4 mentioned,
     e.g option1 , option2 , option 3, option 4
    Note write down the logic in dynamic way i.e one change in if else
     condition can change ur selection
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> options = driver.findElements(By.cssSelector("input[class$='element']"));
        for (WebElement option : options) {
            String checkbox = option.getAttribute("value");
            if(checkbox.equals("Option-4")){
                option.click();
            }
        }

    }
}
