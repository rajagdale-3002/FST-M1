package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TSHomepageSteps extends BaseClass {
	@Given("user is on the TS homepage")
	public void openTSHomepage() {
		// Open the browser
		driver.get("https://training-support.net");
		assertEquals(driver.getTitle(), "Training Support");
	}
 
	@When("the user clicks on the About Us link")
	public void clickButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About Us")));
		driver.findElement(By.linkText("About Us")).click();
		
	}
 
	@Then("they are redirected to About us page")
	public void aboutUsPage() throws Throwable {
		//wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText();
		System.out.println("New page title is: " + pageHeading);
		//assertEquals(pageHeading, "About Us");
	}
}
