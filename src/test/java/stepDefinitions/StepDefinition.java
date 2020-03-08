package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^Open The Flipkart And Start Login$")
	public void open_The_Flipkart_And_Start_Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKarthik\\Desktop\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	   
	}

	@When("^Enter the Correct username and Password$")
	public void enter_the_Correct_username_and_Password(DataTable dataTable) throws Throwable {
		List<List<String>>data=dataTable.raw();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(data.get(1).get(0));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	  
	}

	@Then("^User should able easy to Login$")
	public void user_should_able_easy_to_Login() throws Throwable {
		System.out.println("the flipkart sucessfully Login");
	   
	}

}
