package HomeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,20);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");


        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();

        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 0; i <column.size() ; i++) {
            String id = column.get(i).getText();
            if(id.equalsIgnoreCase("52483A")) {
                System.out.println(id);
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
            }
        driver.close();

    }
}
