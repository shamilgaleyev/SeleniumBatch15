package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

       // 1. declare isntance
        JavascriptExecutor js=(JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
        js.executeScript("arguments[0].style.border='5px dotted blue'",username);
        //find the WebElement
        WebElement btnLogin = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        //click login button
        js.executeScript("arguments[0].click();",btnLogin);

    }
}
