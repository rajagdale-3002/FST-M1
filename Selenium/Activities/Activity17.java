package Activities;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
	public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
        Select multiSelect = new Select(selectElement);
        multiSelect.deselectAll();
        // Select the "HTML" option using the visible text.
        multiSelect.selectByVisibleText("HTML");
        
        //Select the 4th, 5th and 6th options using the index.
        for (int i = 3; i <= 5; i++) {
            multiSelect.selectByIndex(i);
        }
        //Select the "Node" option using the value.
        multiSelect.selectByValue("nodejs");
        //Deselect the 5th option using index.
        multiSelect.deselectByIndex(4);
        driver.quit();

	}
}
