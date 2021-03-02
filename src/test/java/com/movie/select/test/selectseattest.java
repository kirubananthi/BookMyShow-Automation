package com.movie.select.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.movie.base.Testbase;
import com.movie.base.UserInputs;
import com.movie.select.booktickets;
import com.movie.select.movieselect;
import com.movie.select.selectcity;
import com.movie.select.selectseat;
import com.movie.select.selecttime;
import com.movie.util.testutil;

public class selectseattest extends Testbase{

	selectcity city;
	movieselect movie;
	booktickets book;
	selecttime time;
	selectseat seat;
	UserInputs ui = null;

	public selectseattest() throws Exception  {
		super();
	}

	@BeforeClass
	public void setup() throws Exception {
		initialization();
	}

	@Test(priority=1)
	public void getTestData() throws Exception {
		ui = testutil.getTestdata();
		Assert.assertNotNull(ui);
	}
	
	@Test(priority=2)
	public void validateSelectCity() throws Exception {
		city=new selectcity();
		movie = city.selectcity(ui.getLocation());
		Assert.assertNotNull(movie);
	}
	
	@Test(priority=3)
	public void validateSelectMovie() throws Exception {
		book=movie.movieselect("Master");
		Assert.assertNotNull(book);
	}

	@Test(priority=4)
	public void validateBookTicket() throws Exception {
		time=book.select();
		Assert.assertNotNull(time);
	}

	@Test(priority=5)
	public void validateSelectNumOfTickets() throws Exception {
		seat=time.select(ui.getNumOfUsers());
		Assert.assertNotNull(seat);
	}

	@Test(priority=6)
	public void selectSeat() throws IOException {
		seat.select(ui.getNumOfUsers());
	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
