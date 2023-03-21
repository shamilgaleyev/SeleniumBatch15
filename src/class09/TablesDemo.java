package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TablesDemo {
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

        boolean idFound = false;
        while (!idFound) {
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();
                if (id.equalsIgnoreCase("52097A")) {

                    System.out.println("it is on the row " + i);
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }
            }
            if(!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

    }
}
