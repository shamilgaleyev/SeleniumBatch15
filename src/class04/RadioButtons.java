package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        Thread.sleep(2000);
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
       boolean isEnable = maleBtn.isEnabled();
        System.out.println(isEnable);
        boolean isDisplayed = maleBtn.isDisplayed();
        System.out.println(isDisplayed);
        boolean isSelected = maleBtn.isSelected();
        System.out.println(isSelected);

        if(!isSelected){
            maleBtn.click();
        }
        isSelected = maleBtn.isSelected();
        System.out.println(isSelected);
    }
}
