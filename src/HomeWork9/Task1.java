package HomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
        Thread.sleep(4000);
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        select.selectByVisibleText("Aug");
        Thread.sleep(4000);

        WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);

        select1.selectByValue("2123");
        Thread.sleep(4000);

        List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day : days) {
            String day1=day.getText();
            if (day1.equalsIgnoreCase("23")){
                day.click();
            }
        }
        Thread.sleep(4000);
        driver.close();
    }
}
