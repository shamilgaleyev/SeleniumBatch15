package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,20);

        driver.get("http://www.delta.com/");

        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

        WebElement month =driver.findElement(By.xpath("//span[@class ='dl-datepicker-month-0']"));
        WebElement next =driver.findElement(By.xpath("//span[text()='Next']"));
        boolean isFound = false;
        while(!isFound){

           String month_ = month.getText();
           if(month_.equalsIgnoreCase("January")){
           List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
           for(WebElement day: days){
               String day_text = day.getText();
               if(day_text.equalsIgnoreCase("20")){
                   day.click();
                   isFound=true;
                   break;
               }
           }
           } else {
               next.click();
           }

        }

    }
}
