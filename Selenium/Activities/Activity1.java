package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/");
		System.out.println("Title of main page is = "+ driver.getTitle());
		
		//BY Class Name
		driver.findElement(By.className("svelte-4bhb3l")).click();
		
		//By CSS selector
		//driver.findElement(By.cssSelector("a.card.svelte-4bhb3l")).click();
		
		System.out.println("Title of main page is = "+ driver.getTitle());
		driver.quit();
	}
}
