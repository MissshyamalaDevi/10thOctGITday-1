package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;
	public static Actions a ;
	public static Robot r;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static String getHeading() {
		String title = driver.getTitle();
		return title;

	}

	public static String getUpdatedUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void quit() {
		driver.quit();

	}
	public static void select(WebElement r) {
		r.click();

	}

	public static void close() {
		driver.close();

	}
	
	public static void fill(WebElement ref, String txt) {
		ref.sendKeys(txt);

	}

	public static void mousehover(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void dragdrop(WebElement s, WebElement t) {
		a.dragAndDrop(s, t).perform();

	}

	public static void doubleclick(WebElement ref) {
		a = new Actions(driver);
		a.doubleClick(ref).perform();

	}

	public static void contextclick(WebElement ref) {
		a = new Actions(driver);
		a.contextClick(ref).perform();

	}
	public static void thribleClick(WebElement ref) {
		a =new Actions(driver);
		a.click(ref).click().click().perform();

	}

	public static void cut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	public static void arrowDownKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static String readExcel(String excelName,String sheetname,int i,int j) throws IOException {
		File f = new File("C:\\Users\\ACER\\eclipse-workspace\\Maven\\Excelfile\\"+excelName+".xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(in);
		Sheet sh = book.getSheet(sheetname);
		Row row = sh.getRow(i);
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		String value="";
		if (type ==1) {
			 value = cell.getStringCellValue();
		}
		
		
		else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date d= cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			 value = s.format(d);
		}
		
		
		
		else {
			double d = cell.getNumericCellValue();
			long l = (long)d;
			 value= String.valueOf(l);
			
			 
		}
		return value;
		

	}
	
	public static void getText(WebElement ref) {
		ref.getText();
		System.out.println(ref.getText());
		

	}
	
	public static void getAttri(WebElement r) {
		String attribute = r.getAttribute("value");
		System.out.println(attribute);

	}
}
