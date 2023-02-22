package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        /**
         * 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String title = driver.getTitle();
        System.out.println("the title of the page is "+title);

        driver.close();
    }
}

