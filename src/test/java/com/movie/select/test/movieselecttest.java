package com.movie.select.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.movie.base.Testbase;
import com.movie.select.movieselect;
import com.movie.select.selectcity;

public class movieselecttest extends Testbase {

		selectcity city;
		movieselect movie;

		public movieselecttest() throws IOException {
			super();
		}

		@BeforeMethod
		public void setup() throws IOException, InterruptedException  {
			initialization();
			city=new selectcity();
			city.selectcity("Coimbatore");
			movie=new movieselect();
		}

		@Test
		public void movieselect() throws IOException, InterruptedException {
			movie.movieselect("Master");
			
		}

//		//	@Test(dataProvider="getTestdata")
//		public void Location(String Location) {
//
//		}
	

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}
	
	
	
	
	
	
	
//	selectcity city;
//	movieselect movie;
//	booktickets book;
//
//	public movieselecttest() throws IOException {
//		super();
//	}
//
//	@BeforeMethod
//	public void setup() throws IOException, InterruptedException  {
//		initialization();
//		city=new selectcity();
//		movie = city.selectcity("Coimbatore");
//	}
//
//	@Test
//	public void movieselect() throws IOException, InterruptedException {
//		movie.select("kutti story");
//	}
//
//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//
//}
