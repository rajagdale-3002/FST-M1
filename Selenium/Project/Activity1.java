package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testWebsiteTitle() {
        // Navigate to the OrangeHRM site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Get the title of the page
        String actualTitle = driver.getTitle();

        // Print the title (optional)
        System.out.println("Website Title: " + actualTitle);

        // Verify the title matches "OrangeHRM"
        Assert.assertEquals(actualTitle, "OrangeHRM", "Title does not match!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
