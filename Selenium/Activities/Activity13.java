package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
public static void main(String[] args) {
	// Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    // Open the page
    driver.get("https://training-support.net/webelements/tables");
    // Print the title of the page
    System.out.println("Page title: " + driver.getTitle());
    
    //Find the number of rows and columns in the table and print them.
    List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
    System.out.println("Number of columns: " + cols.size());
    
    //Find and print all the cell values in the third row of the table.
    List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
    System.out.println("Number of rows: " + row.size());
    
    //Find and print the cell value at the second row second column.
    String senconrow = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
    System.out.println(senconrow);
    
}
}


