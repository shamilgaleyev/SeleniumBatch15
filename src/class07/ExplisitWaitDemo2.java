package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplisitWaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//        driver.findElement(By.xpath("//button[@id='alert']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();

//        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//h2[@class='target-text']"),"Selenium Webdriver"));

//        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
//        driver.close();

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        driver.findElement(By.xpath("//button[@id='disable']")).click();


    }
}
