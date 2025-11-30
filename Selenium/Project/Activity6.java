package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

@Test
    public void verifyDirectoryMenuItem() {
        // Step b: Navigate to the site
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Step c & d: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        // Step f: Verify homepage
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard not visible. Login might have failed.");

        // Step g & h: Locate and verify Directory menu item
        WebElement directoryMenu = driver.findElement(By.id("menu_directory_viewDirectory"));
        Assert.assertTrue(directoryMenu.isDisplayed(), "Directory menu item is not visible.");
        Assert.assertTrue(directoryMenu.isEnabled(), "Directory menu item is not clickable.");

        // Step j: Click on Directory
        directoryMenu.click();

        // Step k: Verify heading of the page
        WebElement pageHeading = driver.findElement(By.xpath("//h1[contains(text(),'Search Directory')]"));
        Assert.assertTrue(pageHeading.isDisplayed(), "Search Directory page did not open.");
    }

    @AfterClass
    public void tearDown() {
        // Step l: Close the browser
        driver.quit();
    }

}
