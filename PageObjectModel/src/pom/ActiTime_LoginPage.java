package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime_LoginPage {
	
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkBTN;
	
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	public ActiTime_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void SetUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void SetPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void SelectCheckBox()
	{
		checkBTN.click();
	}
	public void ClickOnLoginBTN()
	{
		loginBTN.click();
	}
}
