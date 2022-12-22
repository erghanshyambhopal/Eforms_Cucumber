package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EformsLibrary
{
	public static WebDriver driver;
	@Given("^user open browser with url \"([^\"]*)\"$")
	public void user_open_browser_with_url(String arg1) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://eforms.com");
		
		
	}

	@Then("^user should see home page$")
	public void user_should_see_home_page()
	{
		
	}

	@When("^user click sign in$")
	public void user_click_sign_in() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	}

	@Then("^user should see login page$")
	public void user_should_see_login_page() 
	{
		
	}

	@When("^user enter email as \"([^\"]*)\"$")
	public void user_enter_email_as(String username) 
	{
		driver.findElement(By.xpath("//input[@id='dm_email']")).sendKeys(username);
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) 
	{
		driver.findElement(By.xpath("//input[@id='dm_password']")).sendKeys(password);
	}

	@When("^user click signin$")
	public void user_click_signin() 
	{
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	}

	@Then("^user should see my eform module$")
	public void user_should_see_my_eform_module() 
	{
		
	}

	@When("^user click logout$")
	public void user_click_logout() 
	{
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
	}

	@Then("^user close browser$")
	public void user_close_browser() 
	{
		driver.close();
	}



}
