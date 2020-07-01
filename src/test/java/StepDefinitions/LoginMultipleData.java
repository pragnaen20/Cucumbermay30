package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMultipleData {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com";
	@When("^I open OrangeHRM URL on \"([^\"]*)\"$")
	public void i_open_OrangeHRM_URL_on(String brw) throws Throwable {
	    if(brw.equalsIgnoreCase("Chrome"))
	    {
	    	driver=new ChromeDriver();
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    }
	    else if(brw.equalsIgnoreCase("Firefox"))
	    {
	    	driver=new FirefoxDriver();
	    	driver.get(url);
	    }
	    else
	    {
	    	System.out.println("Browser is not matching");
	    }
	}
	@When("^I enter \"([^\"]*)\" in username field$")
	public void i_enter_in_username_field(String username) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("username");
	}

	@When("^I enter \"([^\"]*)\" in password field$")
	public void i_enter_in_password_field(String password) throws Throwable {
	    driver.findElement(By.name("txtPassword")).sendKeys("password");
	}

	@When("^clicking Login Button$")
	public void clicking_Login_Button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("^I should verify dashboard in URL$")
	public void i_should_verify_dashboard_in_URL() throws Throwable {
	    if(driver.getCurrentUrl().contains("dash"))
	    {
	    	System.out.println("Login Success");
	    }
	    else
	    {
	    	System.out.println("Login Fail");
	    }
	}
	@When("^closing browser$")
	public void closing_browser() throws Throwable {
	    driver.close();
	}

	}
	
