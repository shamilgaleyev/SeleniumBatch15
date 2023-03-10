package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("abcde");

        driver.switchTo().defaultContent();
       WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is " + text.getText());
        driver.switchTo().frame("iframe_a");

        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("the label is "+getLabel.getText());

        driver.switchTo().defaultContent();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
         driver.switchTo().frame(frame1);
         textBox.clear();




}
}
