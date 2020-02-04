package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataInExcel {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		WebDriver driver=new ChromeDriver();	
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://localhost/login.do");
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		 Cell u = wb.getSheet("ValidLogin").createRow(2).createCell(0);
		 u.setCellValue("gireesh");
		 wb.write(new FileOutputStream("./data/input.xlsx"));
		 Cell p = wb.getSheet("ValidLogin").createRow(2).createCell(1);
		 p.setCellValue("gireesh@1234");
		 wb.write(new FileOutputStream("./data/input.xlsx"));
	}
}