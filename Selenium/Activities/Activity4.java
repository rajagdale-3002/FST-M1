package Activities;


import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
	 public static void main(String[] args) {
	        // Initialize the Firefox driver
	        WebDriver driver = new ChromeDriver();

	        // Open the page
	        driver.get("https://training-support.net/webelements/target-practice");
	        // Print the title of the page
	        System.out.println("Home page title: " + driver.getTitle());

	       //Find the 3rd header on the page and print it's text to the console.
	      String txt = driver.findElement(By.xpath("//h3[contains(text(),'Heading #3')]")).getText();
	        System.out.println(txt);
	        
	        //Find the 5th header on the page and print it's color
	        Color colo = Color.fromString( driver.findElement(By.xpath("//h5[contains(text(),'Heading #5')]")).getCssValue("colo"));
	        System.out.println("Color is =="+ colo.asRgb());
	        
	        
	        //Find the purple button and print all it's classes.
	        String clas = driver.findElement(By.className("svelte-2hb4ib")).getDomAttribute("clas");
	        System.out.println(clas);
	        
	        // Find the slate button and print it's text
	        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
	        System.out.println(slateButtonText);

	        // Close the browser
	        driver.quit();
	    }

}
