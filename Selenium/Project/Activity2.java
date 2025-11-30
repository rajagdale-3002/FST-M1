package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity2 {
	WebDriver driver;
	@BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test

public void printHeaderImageURL() {
        // Navigate to the OrangeHRM site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Locate the header image element
        WebElement headerImage = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

        // Get the image URL
        String imageURL = headerImage.getAttribute("src");

        // Print the image URL to the console
        System.out.println("Header Image URL: " + imageURL);
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }


}
