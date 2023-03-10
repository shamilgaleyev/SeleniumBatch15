package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S184583677%3A1678243295334954&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en-US&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindowHamdle = driver.getWindowHandle();
        System.out.println(parentWindowHamdle);
        Set<String> windowHandels = driver.getWindowHandles();
        for(String x:windowHandels){
            driver.switchTo().window(x);
           String title = driver.getTitle();
           if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
               break;
           }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowHamdle);
    }
}
