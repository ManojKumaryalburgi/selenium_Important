package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Element {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count = allLink.size();
		System.out.println(count);
		
		for(WebElement link:allLink)
		{
			String li = link.getText();
			System.out.println(li);
		}
		
		

	}
}
