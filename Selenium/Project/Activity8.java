package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity8 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }
	
	
	@Test
    public void applyLeave() throws InterruptedException {
        // Step b: Navigate to the site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Step c & d: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        // Step f: Verify homepage
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard not visible. Login might have failed.");

        // Step g: Click Apply Leave
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        driver.findElement(By.id("menu_leave_applyLeave")).click();

        // Step h: Select leave type and duration
        Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leaveType.selectByVisibleText("DayOff");

        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2025-11-05");

        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2025-11-05");

        driver.findElement(By.id("applyleave_txtComment")).sendKeys("Applying for a day off.");

        // Step j: Click Apply
        driver.findElement(By.id("applyBtn")).click();

        // Optional: Verify leave was applied
        WebElement confirmation = driver.findElement(By.xpath("//div[@class='message success fadable']"));
        Assert.assertTrue(confirmation.isDisplayed(), "Leave application confirmation not displayed.");
    }

    @AfterClass
    public void tearDown() {
        // Step k: Close the browser
        driver.quit();
    }


}
