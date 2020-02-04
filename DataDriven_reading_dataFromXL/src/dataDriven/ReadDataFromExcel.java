package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String un = wb.getSheet("ValidLogin").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("ValidLogin").getRow(1).getCell(1).toString();
		 WebElement u = driver.findElement(By.name("username"));
		u.sendKeys(un);
		WebElement p = driver.findElement(By.name("pwd"));
		p.sendKeys(pw);
		

	}

}
