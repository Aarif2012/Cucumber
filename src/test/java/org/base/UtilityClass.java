package org.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;

	public static Actions a;

	public static JavascriptExecutor js;

	public static Robot r;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void launchUrl(String Url) {

		driver.get(Url);
	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

	public static String pageUrl() {

		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void toClose() {
		
		driver.quit();
		
	}

	public static void passTxt(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void clickWebElement(WebElement btnWebElement) {

		btnWebElement.click();

	}

	public static void screenShot(String imgName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\images" + imgName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void moveTheCursor(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement taeget) {

		a = new Actions(driver);
		a.dragAndDrop(src, taeget).perform();

	}

	public static void doubleClick(WebElement ele) {

		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void contentClick(WebElement e) {

		a = new Actions(driver);
		a.contextClick(e).perform();

	}

	public static void javaScriptClick(WebElement targetWebElement) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", targetWebElement);
	}

	public static void scrollThePage(WebElement targetWebElement) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", targetWebElement);

	}

	public static void javaScriptSendvalue(String text, WebElement ele) {

		js.executeScript("arguments[0].setAttribute('Value', 'text')", ele);

	}

	public static void toCopy() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_COPY);
		r.keyRelease(KeyEvent.VK_COPY);

	}

	public static void topaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PASTE);
		r.keyRelease(KeyEvent.VK_PASTE);
	}

	public static void toSelectval(WebElement ele, String val) {

		Select s = new Select(ele);
		s.selectByValue(val);

	}

	public static void toApplyWait(int time) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void createSheet(String creSheet, int creRow, int creCell, String setValue) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\Excelfiles\\liyana.xlsx");

		Workbook w = new XSSFWorkbook();

		Sheet newSheet = w.createSheet(creSheet);

		Row newRow = newSheet.createRow(creRow);

		Cell newCell = newRow.createCell(creCell);

		newCell.setCellValue(setValue);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed....");

	}

	public static void createNewRow(String getTheSheet, int creNewRow, int creNewCell, String setTheValue)
			throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\Excelfiles\\liyana.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet newSheet = w.getSheet(getTheSheet);

		Row newRow = newSheet.createRow(creNewRow);

		Cell newCell = newRow.createCell(creNewCell);

		newCell.setCellValue(setTheValue);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed.....");

	}

	public static void createNewCell(String getTheSheet, int getTheRow, int creTheCell, String setTheValue)
			throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\Excelfiles\\liyana.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet newSheet = w.getSheet(getTheSheet);

		Row newRow = newSheet.getRow(getTheRow);

		Cell newCell = newRow.createCell(creTheCell);

		newCell.setCellValue(setTheValue);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed.....");

	}

	public static String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\Excelfiles\\liyana.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet mySheet = w.getSheet(sheetName);

		Row r = mySheet.getRow(rowNum);

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		String value;
		
		if (cellType == 1) {

			value = c.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MMMM-yyyy");
			value = s.format(d);
			

		} else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);

		}
		return value;

	}

	public static String updateTheExcel(String getTheSheet, int getRow, int getCell, String checkValue,
			String updateValue) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenTasks\\Excelfiles\\liyana.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet s = w.getSheet(getTheSheet);

		Row r = s.getRow(getRow);

		Cell c = r.getCell(getCell);

		String getValue = c.getStringCellValue();

		
		if (getValue.equals(checkValue)) {

	c.setCellValue(updateValue);
			System.out.println(checkValue);

		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		System.out.println("Writed....");
		return updateValue;
		
	}

}
