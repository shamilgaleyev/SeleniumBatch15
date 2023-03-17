package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/login.aspx?returnurl=%2f samples%2f testcomplete 11%2f weborders%2fdefault.aspx");
       WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
       username.sendKeys("Tester");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");


       username.clear();

       WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        System.out.println(passwordText.getText());
    }
}
