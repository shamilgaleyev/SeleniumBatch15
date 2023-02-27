package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Shamil");
        driver.findElement(By.name("customer.lastName")).sendKeys("Galeyev");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Street St");
        driver.findElement(By.name("customer.address.city")).sendKeys("Jax");
        driver.findElement(By.id("customer.address.state")).sendKeys("Fl");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("32259");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5555555555");
        driver.findElement(By.name("customer.ssn")).sendKeys("777777777");
        driver.findElement(By.id("customer.username")).sendKeys("shamgal");
        driver.findElement(By.name("customer.password")).sendKeys("123456789");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
        Thread.sleep(5000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
