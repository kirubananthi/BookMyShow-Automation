package com.movie.select;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movie.base.Testbase;

public class selectcity extends Testbase{

	@FindBy(xpath="//input[@placeholder='Search for your city']")
	WebElement Selectcity;
	
	
	public selectcity() throws IOException {
		PageFactory.initElements(driver,this);

	}

	public movieselect selectcity(String location) throws IOException, InterruptedException {
		System.out.println("Entering movie select object");
		Selectcity.sendKeys(location);
		Selectcity.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		
		System.out.println("Returning movie select object");
		return new movieselect();
	}
		
		
}

