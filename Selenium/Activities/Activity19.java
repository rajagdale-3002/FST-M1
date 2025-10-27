package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity19 {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/webelements/alerts");
	System.out.println("Page title: " + driver.getTitle());
	driver.findElement(By.id("confirmation")).click();
	Alert confirm = driver.switchTo().alert();
	 String cofirmation = confirm.getText();
	 System.out.println("Alert text is = "+cofirmation);
	 confirm.accept();
	 //confirm.dismiss();
}
}
