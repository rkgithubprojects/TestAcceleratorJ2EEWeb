package com.cigniti.airlines.exe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.cigniti.airlines.utils.HtmlData;

public class Test {

	public static void main(String[] args) {
		boolean result = false;
		XSSFWorkbook tcWorkbook = null;
		FileOutputStream tcOutputStream = null;
		try {

			/*
			 * String sheetName = "Sheet1"; tcWorkbook = new XSSFWorkbook();
			 * File testCaseFile = new File("C:\\ABC\\A.xlsx"); tcOutputStream =
			 * new FileOutputStream(testCaseFile); Sheet tcOutsheet =
			 * tcWorkbook.createSheet(sheetName);
			 * 
			 * Row row = tcOutsheet.createRow(0); Cell cell = row.createCell(0);
			 * cell.setCellValue("//span[text()='Flight']");
			 * 
			 * tcWorkbook.write(tcOutputStream); tcWorkbook.close();
			 * tcOutputStream.close();
			 * 
			 * Integer a=new Integer(3); int a1=a.intValue();
			 */

			/*
			 * WebDriver driver=new FirefoxDriver();
			 * driver.get("https://www.google.co.in/"); Thread.sleep(2000);
			 * Actions actions=new Actions(driver);
			 * actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).
			 * build().perform(); Thread.sleep(5000);
			 * System.out.println("Success");
			 */

			String s = "Hello,Hai!,How:are;you.";
			System.out.println(s);
			s = s.replace(",", "COMMA").replace("|", "LINE").replace(":", "XCOLON").replace(";", "SCOLON")
					.replace("'", "SQUOTE").replace("\"", "DQUOTE").replace("/", "SSLASH").replace("//", "DSLASH")
					.replace("(", "ROBRACE").replace(")", "RCBRACE").replace("]", "SCBRACE").replace("[", "SOBRACE");

			System.out.println(s);
			
			s=s.replace( "COMMA",",").replace( "LINE","|").replace("XCOLON",":").replace("SCOLON",";")
			.replace("SQUOTE","'").replace("DQUOTE","\"").replace("SSLASH","/").replace( "DSLASH","//")
			.replace( "ROBRACE","(").replace("RCBRACE",")").replace("SCBRACE","]").replace("SOBRACE","[");
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
