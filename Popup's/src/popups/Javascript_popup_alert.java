package popups;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_popup_alert
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("http://localhost/login.do");
	 driver.findElement(By.name("username")).sendKeys("Manoj");
	 driver.findElement(By.name("pwd")).sendKeys("Manoj@1234");
	 driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//div[text()='Settings']/../img")).click();
	 driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	 driver.findElement(By.id("FormModifiedDivButton")).click();
	 
	 Alert aleartpop = driver.switchTo().alert();
	 
	 String text = aleartpop.getText();
	 System.out.println(text);
	 aleartpop.accept();
	}
}