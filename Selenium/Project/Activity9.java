package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity9 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

    @Test
    public void retrieveEmergencyContacts() {
        // Step b: Navigate to the site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Step c & d: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        // Step f: Verify homepage
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        assert dashboardHeader.isDisplayed() : "Dashboard not visible. Login might have failed.";

        //Step g: Click "My Info"
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        // Step h & j: Click "Emergency Contacts"
        driver.findElement(By.linkText("Emergency Contacts")).click();

        // Step k: Retrieve all rows from the emergency contacts table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));

        System.out.println("Emergency Contacts:");
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.print(column.getText() + " | ");
            }
            System.out.println();
        }
    }

    @AfterClass
    public void tearDown() {
        // Step m: Close the browser
        driver.quit();
    }
}
