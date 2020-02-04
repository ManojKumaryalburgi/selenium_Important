package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTime_loginPage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		ActiTime_LoginPage acti = new ActiTime_LoginPage(driver);
		acti.SelectCheckBox();
		acti.SetUsername("admin");
		acti.SetPassword("manager");
		acti.SelectCheckBox();
		acti.ClickOnLoginBTN();
	}

}
