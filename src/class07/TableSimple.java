package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //        task:1
//        get the whole table accessed and print it on the console
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
      //  System.out.println(table_data);
        //        get the rows of the table and print them
//        print the row that contains Company google
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//    print the rows
//        for(WebElement row:Rows){
////            extract text from each row
//            String row_text = row.getText();
//            System.out.println(row_text);
//        }
//        for(WebElement row:Rows){
//////
//           String row_text = row.getText();
//           if(row_text.contains("Google")) {
//               System.out.println(row_text);
//           }
//        }
//        List<WebElement> colums = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//        for(WebElement colum: colums){
//            System.out.println(colum.getText());
 //       }
        List<WebElement> first_colums = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement first_colum:first_colums) {
            System.out.println(first_colum.getText());
        }

    }
}
