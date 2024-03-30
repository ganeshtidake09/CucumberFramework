package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)                 //Create constructor of this calss
	{
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		email.sendKeys(pwd);
	}
	
	public void clickOnloginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnlogout()
	{
		logout.click();
	}


}
