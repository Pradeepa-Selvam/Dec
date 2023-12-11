package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void getDriver() {
		//WebDriverManager.chromiumdriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\IPT\\src\\test\\resources\\Driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void windMax() {
		driver.manage().window().maximize();
	}

	public static void jsTextSend(String Text,WebElement element) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('Value','"+Text+"')", element);
		
	}
	public static void jsclick(WebElement element) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", element);
		
	}
	
	public static void selectOption(WebElement element,int no){
		Select s=new Select(element);
		s.selectByIndex(no);	
	}
	
	public static void scrollOption(WebElement element){
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", element);	
		
	}
	public static void sendText(WebElement element,String text){
		element.sendKeys(text);
		
	}
	public static void capture(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		File targetFile = new File(
				"C:\\Users\\lenovo\\Documents\\Screenshot" + name
						+ ".jpeg");

		FileUtils.copyFile(sourceFile, targetFile);
	}

	public static String excelRead(int rowno,int cellno) throws IOException {
		
		File location=new File("C:\\Users\\lenovo\\Documents\\Excel\\IGP.xlsx");
		FileInputStream stream= new FileInputStream(location);
		Workbook book=new XSSFWorkbook(stream);
		
		   Sheet sheet = book.getSheet("Sheet1");
		   Row row = sheet.getRow(rowno);
		   Cell cell = row.getCell(cellno);
		 
		CellType cellType = cell.getCellType();
		String value=null;
		switch(cellType) {
		case STRING:
		value=cell.getStringCellValue();
		break;
		case NUMERIC:
       if(DateUtil.isCellDateFormatted(cell)) {
	   Date dateCellValue = cell.getDateCellValue();
	   SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
	   value = simple.format(dateCellValue);
       }else {
	   double numericCellValue = cell.getNumericCellValue();
	   long l=(long)numericCellValue;
	   BigDecimal valueOf = BigDecimal.valueOf(l);
	   value = valueOf.toString();	
       }
      break;
      default:
	  break;
		
		}
return value;
	
}


}
