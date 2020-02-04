package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload_popup {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	 WebDriver driver=new FirefoxDriver();	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("http://www.seleniumhq.org");
	 driver.findElement(By.xpath("//a[text()='Downloads']")).click();
	 WebElement ref = driver.findElement(By.xpath("//h2[text()='Selenium Client & WebDriver Language Bindings']"));
	 int yaxis = ref.getLocation().getY();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,"+yaxis+")");
	 
	 driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a[1]")).click();
	 
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_O);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	}
}