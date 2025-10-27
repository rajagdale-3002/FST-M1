package Activities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {
	public static void main(String[] args) {
		
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/alerts");
	System.out.println("Page title: " + driver.getTitle());
	driver.findElement(By.id("simple")).click();
	 Alert simpleAlert = driver.switchTo().alert();
	 String alerttext = simpleAlert.getText();
	 System.out.println("Alert text is = "+alerttext);
	 simpleAlert.accept();
	 
	 String text = driver.findElement(By.id("result")).getText();
	
			 System.out.println("Alert accepted text is  ="+text);
	 
	 
	 driver.quit();
	 
	 	
}
}