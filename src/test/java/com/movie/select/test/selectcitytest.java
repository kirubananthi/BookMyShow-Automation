package com.movie.select.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.movie.base.Testbase;
import com.movie.select.selectcity;

public class selectcitytest extends Testbase {

	selectcity city;

	public selectcitytest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException  {
		initialization();
		city=new selectcity();
	}
	

	//	@DataProvider
	//	public Object[][]getTestdata(){
	//		Object data[][]=testutil.getTestdata(sheetName);
	//		return data;
	//	}

	@Test
	public void selectcity() throws IOException, InterruptedException {
		city.selectcity("Coimbatore");
		
	}


	//	@Test(dataProvider="getTestdata")
	public void Location(String Location) {

	}

	
		

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}