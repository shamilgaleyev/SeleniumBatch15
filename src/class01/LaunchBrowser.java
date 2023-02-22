package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

       String title = driver.getTitle();
        System.out.println("the title of the page is "+title);
        Thread.sleep(3000);

        driver.quit();
    }
}
