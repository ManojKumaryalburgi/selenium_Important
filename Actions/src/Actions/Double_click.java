package Actions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Double_click {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException 
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	
	 driver.get("https://accounts.google.com/ServiceLogin/identifier?service=wise&passive=1209600&continue=https%3A%2F%2Fdrive.google.com%2Fdrive%2Fmy-drive&followup=https%3A%2F%2Fdrive.google.com%2Fdrive%2Fmy-drive&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("manojyalburgi@gmail.com");
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Chintu@1996");
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
}
}