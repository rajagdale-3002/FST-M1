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

public class Activity5 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

@Test
    public void editUserInfo() throws InterruptedException {
        //Navigate to the site
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

        // Step h: Click Edit
        driver.findElement(By.id("btnSave")).click();

        // Step j: Fill in Name, Gender, Nationality, DOB
        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
        firstName.clear();
        firstName.sendKeys("BRUCE");
        lastName.clear();
        lastName.sendKeys("BANE");

        // Gender
        WebElement genderFemale = driver.findElement(By.id("personal_optGender_2"));
        genderFemale.click();

        // Nationality
        Select nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
        nationality.selectByVisibleText("Indian");

        // Date of Birth
        WebElement dob = driver.findElement(By.id("personal_DOB"));
        dob.clear();
        dob.sendKeys("2025-05-15");

        // Step k: Save
        driver.findElement(By.id("btnSave")).click();

        // Optional: Verify changes were saved
        Assert.assertEquals(driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value"), "BRUCE");
        Assert.assertEquals(driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value"), "BANE");
    }

    @AfterClass
    public void tearDown() {
        // Step l: Close the browser
        driver.quit();
    }


}
