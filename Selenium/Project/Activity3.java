package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity3 {
	WebDriver driver;
	@BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();

}

	  @Test
	    public void loginTest() {
	        // Navigate to the OrangeHRM site
	        driver.get("http://alchemy.hguy.co/orangehrm");

	        // Find username and password fields
	        WebElement usernameField = driver.findElement(By.id("txtUsername"));
	        WebElement passwordField = driver.findElement(By.id("txtPassword"));

	        // Enter credentials
	        usernameField.sendKeys("orange");
	        passwordField.sendKeys("orangepassword123");

	        // Click login
	        driver.findElement(By.id("btnLogin")).click();

	        // Verify homepage is displayed by checking for a known element
	        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
	        Assert.assertTrue(dashboardHeader.isDisplayed(), "Login failed or Dashboard not visible.");
	        System.out.println("User Logged in Successfully");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	

	
}