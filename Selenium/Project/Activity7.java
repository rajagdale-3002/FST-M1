package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

    @Test
    public void addWorkExperience() throws InterruptedException {
        // Step b: Navigate to the site
    	driver.get("http://alchemy.hguy.co/orangehrm");

        // Step c & d: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        // Step f: Verify homepage
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard not visible. Login might have failed.");

        // Step g: Click "My Info"
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        // Step h: Click "Qualifications" from left menu
        driver.findElement(By.linkText("Qualifications")).click();

        // Step j: Click Add Work Experience
        driver.findElement(By.id("addWorkExperience")).click();

        // Fill in Work Experience details
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Software Engineer");
        driver.findElement(By.id("experience_from_date")).sendKeys("2020-01-01");
        driver.findElement(By.id("experience_to_date")).sendKeys("2025-12-31");
        driver.findElement(By.id("experience_comments")).sendKeys("Test Engineer");

        // Click Save
        driver.findElement(By.id("btnWorkExpSave")).click();

        // Optional: Verify entry was added
       // WebElement experienceTable = driver.findElement(By.id("tblWorkExperience"));
       // Assert.assertTrue(experienceTable.getText().contains("TechCorp"), "Work experience not added.");
    }

    @AfterClass
    public void tearDown() {
        // Step k: Close the browser
        driver.quit();
    }
}
