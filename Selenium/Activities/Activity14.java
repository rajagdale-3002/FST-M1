package Activities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity14 {
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    // Open the page
	    driver.get("https://training-support.net/webelements/tables");
	    // Print the title of the page
	    System.out.println("Page title: " + driver.getTitle());
	    
	    //Find the number of rows and columns in the table and print them.
	    List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
	    System.out.println("Number of rows: " + row.size());
	    List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
	    System.out.println("Number of columns: " + cols.size());

	    //Find and print the Book Name in the 5th row.
	    WebElement fifthrow = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]\r\n"
	    		+ ""));
	    System.out.println("Book name 5 row = "+fifthrow.getText());
	    
	    //	    Click the header of the Price column to sort it in ascending order.
	    		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/table/thead/tr/th[5]")).click();
	    
	    //    Find and print the Book Name in the 5th row again.
	    		 WebElement fifthrown = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]\r\n"
	    		    		+ ""));
	    		    System.out.println("Book name 5 row = "+fifthrown.getText());
}
	
}
