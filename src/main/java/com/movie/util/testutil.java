package com.movie.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.movie.base.UserInputs;

public class testutil {

	public static long PAGE_LOAD_TIMEOUT=60;
	public static long IMPLICIT_WAIT=10;



	public static String TESTDATA_SHEET_PATH="/Users/vigne/eclipse-workspace/Movie/src/main/java/com/movie/testdata/Testdata.xlsx";

	static XSSFWorkbook book;
	static XSSFSheet sheet;
	public static UserInputs getTestdata() throws IOException{
		FileInputStream file=null;
		UserInputs ui = null;
		try{
			file = new FileInputStream(new File(TESTDATA_SHEET_PATH));
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(1);
			String location = row.getCell(0).getStringCellValue();
			int numOfUsers = (int) row.getCell(1).getNumericCellValue();
			
			ui = new UserInputs();
			ui.setLocation(location);
			ui.setNumOfUsers(numOfUsers);
			workbook.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		return ui;

	}
}

