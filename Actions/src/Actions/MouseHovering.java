package Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering 
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
	 driver.get("http://localhost/login.do");
	 String ParentWindow = driver.getWindowHandle();
	 driver.findElement(By.xpath("//a[text()='Actimind Inc.']")).click();
	 Set<String> ChildWindow = driver.getWindowHandles();
	 int count = ChildWindow.size();
	 System.out.println(count);
	 
	 for (String all : ChildWindow) 
	 {
		driver.switchTo().window(all);
		if(ParentWindow.equals(all)) 
		{
			String title = driver.getTitle();
			System.out.println("parent title is :"+title);
			driver.close();
		}
		else
		{
			String Ctitle = driver.getTitle();
			System.out.println("child title is :"+Ctitle);
			WebElement ref = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
			
			Actions act = new Actions(driver);
			act.moveToElement(ref).perform();
			driver.findElement(By.xpath("//a[.='Web Browser Plug-ins']")).click();
			
			
		}
	}
	 
	 
	}
}

