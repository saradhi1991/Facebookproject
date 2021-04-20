package com.baseclass.methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	
		
	public static void chromeBrowser(){
		WebDriverManager.chromedriver().setup();
		 
		driver = new ChromeDriver();
		
		
		
			
	}
	
//	
	//to launch the URL1
		public static void launchUrl(String url) {
		
			driver.get(url);
			
		}
		
		// to maximize the window
			public static void tomaximize() {
			
				driver.manage().window().maximize();

			}
			
			//to delete all cookies of browser 
			public static void deletCookiesall() {
				driver.manage().deleteAllCookies();

			}
			//to get the page title
			public static void pageTitle() {
				String titlename = driver.getTitle();
				System.out.println(titlename);
		
		}
			//to get the current URL
			public static void pageUrl() {
			String curUrl = driver.getCurrentUrl();
			System.out.println(curUrl);
			}
		

			public static void filltext(WebElement element, String value) {
			element.sendKeys(value);

		}
			
			
			// to button click 
			public static void toClick(WebElement element) {
				element.click();				

		}
			//to page refresh
			public static  void pageRefresh() {
				driver.navigate().refresh();

			}
			// to Double Click
			public static void clickDouble(WebElement element) {
				
				a = new Actions(driver);
				a.doubleClick(element).perform();
				
				

			}
			// copy method 
			public static void copy() throws AWTException {
				r= new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_C);

			}
			//Past method
			public static void paste()throws AWTException {
				r= new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);

			}
			
			public static void selectALL()throws AWTException {
				r= new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);

			}
			public static void deletAll()throws AWTException {
				r= new Robot();
				r.keyPress(KeyEvent.VK_DELETE);
			
				r.keyRelease(KeyEvent.VK_DELETE);
			

			}
			
			
			
			//Right click method
			public static void rightClick(WebElement element) {
				a = new Actions(driver);
				a.contextClick(element).perform();

			}
			//screenshot method
			public static void takeSnap(String fileName) throws IOException {
				TakesScreenshot tk = (TakesScreenshot)driver;
				
				File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File d = new File ("E:\\oxygen3\\AdactinProjectWork\\hotelpicks"+fileName+".jpg");
				
				FileUtils.copyFile(s, d);
			}
			
			//Read from Excel method
			public static String readFromExcel(int rowNo, int cellNo) throws IOException {
				//File Location
				File f=new File("C:\\Users\\pardh\\eclipse-workspace\\NewAllProject\\xkfil\\sheet.xlsx");
				//Read Excel File
				FileInputStream input=new FileInputStream(f);
				
				//Create work Book
				Workbook w =new XSSFWorkbook(input);
				//To Fetch sheet	
				Sheet s= w.getSheet("Hotel");
				
				//To get a row
				Row r = s.getRow(rowNo);
				
				//To get cell Number
				Cell c = r.getCell(cellNo);
				
				int Type = c.getCellType();
				String name ="";
				
				if (Type ==1) {
					name = c.getStringCellValue();
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					
					Date da =c.getDateCellValue();
					
				
					
					SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyy");
				name= form.format(da);
				}
				else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					String.valueOf(l);
				}
				return name;
			}
			
			
			//Mouse drag and drop method
			public static void mouseDrandAndDrop(WebElement drag, WebElement drop ) {
				a = new Actions(driver);
				a.dragAndDrop(drag, drop).perform();
			}
			
			public static void pageScroleUpAndDown() {
				

			}
			
			//thread sleep method
			public static void hold(int time) throws InterruptedException {
			Thread.sleep(time);

			}
			
			public static void alerAccept(WebDriver driver) {
				Alert alert = driver.switchTo().alert();

			}
			public static void alergettext(WebDriver driver) {
				Alert alert = driver.switchTo().alert();
				alert.getText();

			}
			public void alertDismiss() {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			}
			public static  void alertSendKeys( String data) {
				Alert alert = driver.switchTo().alert();
				alert.sendKeys(data);
			}
			
			public static void scroleUp(String a) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement src = driver.findElement(By.xpath(a));
				js.executeScript("arguments(0).scrollIntoView(false)", src);
				
				
				

			}
			
			public static void waitsImplicit() {
				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				

			}
			
			public static void toSelect(WebElement elemet, int i) {
				Select d = new Select(elemet);
					d.selectByIndex(i);
			}
			public static void toquit() {
				driver.quit();
				}
			
				public static void toType(WebElement element,String value) {
					element.sendKeys(value);
				}


}
