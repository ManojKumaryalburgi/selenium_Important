package handlingmultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_List_Box {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("C:/Users/com/Desktop/select.html");
		WebElement selqsp = driver.findElement(By.id("Qspider"));
		
		//select class has a parameterized constructor  it takes an argument
		Select sq = new Select(selqsp);
		
		
		//select using index
		sq.selectByIndex(1);
		
		//select using value
		sq.selectByValue("p");
		
		//select using visibleText
		sq.selectByVisibleText("SELENIUM");
		//isMultiple give Boolean value if it is single list box (it will return false)
		System.out.println(sq.isMultiple());
		//getoptions is use to get the text present in list box
		List<WebElement> allqsp = sq.getOptions();
		int count = allqsp.size();
		System.out.println(count);
		
		for (WebElement aqsp : allqsp) 
		{
			String s = aqsp.getText();
			System.out.println(s);
		}
		
		//getWrappedElement is use to get the text present in list box
		System.out.println("*********************");
		WebElement gwe = sq.getWrappedElement();
		System.out.println(gwe.getText());
		
		System.out.println("///////////////////////////////////");
		
	//getAllselectedoptions in list box
		List<WebElement> sss = sq.getAllSelectedOptions();
		int count1 = sss.size();
		System.out.println(count1);
		
		for (WebElement cs : sss)
		{
			String c = cs.getText();
			System.out.println(c);
		}
		
		
		
	}

}
