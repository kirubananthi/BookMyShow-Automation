//package com.movie.select.test;
//
//import java.io.IOException;
//
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.movie.base.Testbase;
//import com.movie.select.booktickets;
//import com.movie.select.movieselect;
//import com.movie.select.selectcity;
//import com.movie.select.selectseat;
//import com.movie.select.selecttime;
//
//public class selecttimetest extends Testbase {
//
//	selectcity city;
//	movieselect movie;
//	booktickets book;
//	selecttime time;
//	selectseat seat;
//
//	public selecttimetest() throws IOException {
//		super();
//	}
//
//	@BeforeMethod
//	public void setup() throws IOException, InterruptedException {
//		initialization();
//		city=new selectcity();
//		movie = city.selectcity("Coimbatore");
//		book=movie.movieselect("Master");
//		time=book.select();
//	}
//
//	@Test
//	public void select() throws IOException, InterruptedException {
//		seat=time.select();
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//
//}
//
//
//
//  
//	
//	
//	
//
