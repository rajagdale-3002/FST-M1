package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

    @Test
    public void addEmployee() throws InterruptedException {
        // Step b: Navigate to the site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Step c & d: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        // Step f: Verify homepage
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard not visible. Login might have failed.");

        // Step g: Click PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // Step h: Click Add
        driver.findElement(By.id("btnAdd")).click();

        // Step j: Fill in employee details
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Marvel");
        lastName.sendKeys("Avenger");

        // Save employee
        driver.findElement(By.id("btnSave")).click();

        // Step k: Go back to Employee List
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        // Search for the employee
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Marvel Avenger");
        driver.wait(20000);
        driver.findElement(By.id("searchBtn")).click();

        // Verify employee is listed
        WebElement employeeName = driver.findElement(By.xpath("//a[contains(text(),'John')]"));
        Assert.assertTrue(employeeName.isDisplayed(), "Employee not found in the list.");
    }

    @AfterClass
    public void tearDown() {
        // Step l: Close the browser
        driver.quit();
    }


}
