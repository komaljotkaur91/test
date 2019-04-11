package stepDefinations;

import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefination {
	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
	}

	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO Log In Screen", title);
	  
	}

	/*@Then("^User enters \"(.*)\" and \"([^\"]*)\"$")
	public void user_enters_Username_and_Password(String username, String password) {
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(
				username);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(
				password);

	}
*/
	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	    
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		String title = driver.getTitle();
		System.out.println("Home page title is::"+ title);
		Assert.assertEquals("CRMPRO", title);
	}
	/*@Then("^User click on New Contacts$")
	public void user_click_on_New_Contacts() throws InterruptedException  {
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
	}

	@Then("^User adds information \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void user_adds_information_and(String firstName, String lastName, String company) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
	    driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastName);
	    driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(company);
	    driver.findElement(By.xpath("//input[@type='button' and @value='Load From Company']//following::input[@type='submit' and @value='Save' and @class='button']")).click();
	}
*/	
	/*@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentails) {
		List<List<String>> data = credentails.raw();
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(
				data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(
				data.get(0).get(1));

	}*/
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentails) {
		for(Map<String,String> data : credentails.asMaps(String.class, String.class)){
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(
				data.get("username"));
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(
				data.get("password"));
		
		}

	}

	@Then("^User moves to new deal page$")
	public void user_moves_to_new_deal_page(){
		driver.switchTo().frame("mainpanel");
	}

/*	@Then("^User enters deals details$")
	public void user_enters_deals_details(DataTable dealinfo) {
		List<List<String>> deal1 = dealinfo.raw();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(deal1.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(deal1.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(deal1.get(0).get(2));
		driver.findElement(By.xpath("//td[@colspan='2']//input[@type='submit' and @value='Save']")).click();
	  
	}
	*/
	
	//data table with maps: parametrization of test cases
	
	@Then("^User enters deals details$")
	public void user_enters_deals_details(DataTable dealinfo) {
		for(Map<String, String> deal:dealinfo.asMaps(String.class, String.class)){
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(deal.get("Title"));
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(deal.get("Company"));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(deal.get("Probability"));
		driver.findElement(By.xpath("//td[@colspan='2']//input[@type='submit' and @value='Save' and @class='button']")).click();
		}
	}

	@Then("^Close the Browser$")
	public void close_the_Browser(){
		driver.quit();
	}

}
