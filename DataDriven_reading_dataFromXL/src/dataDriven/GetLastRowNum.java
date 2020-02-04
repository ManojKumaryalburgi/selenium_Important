package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRowNum {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		int rcount = wb.getSheet("ValidLogin").getLastRowNum();
		System.out.println(rcount);
	}
}
