package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Selenium_grid_project {
	
	@Test
	@Parameters({"node","browser"})
	public void TestActiTime(String node,String browser) throws MalformedURLException
	{
		URL url = new URL(node);
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		
		WebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.name("username"));
		un.clear();
		un.sendKeys("admin");
		
		
	}

	
}
