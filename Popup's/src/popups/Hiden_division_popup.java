package popups;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiden_division_popup
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 //driver.get("http://www.flipkart.com");
	// driver.findElement(By.xpath("//button[text()='X']"));
	driver.get("http://www.irctc.co.in");
	driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
	driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close')]")).click();
	}
}