package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Auto_Suggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("http://www.google.com");
	 WebElement searchBOX = driver.findElement(By.name("q"));
	  searchBOX.sendKeys("java");
	  List<WebElement> sjava = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	  int count = sjava.size();
	  System.out.println(count);
	  Thread.sleep(2000);
	  for (WebElement sj : sjava)
	  {
		String sjtext = sj.getText();
		System.out.println(sjtext);
	}
	  Thread.sleep(2000);
	 sjava.get(3).click();;

	}

}
