package com.movie.select;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movie.base.Testbase;

public class booktickets extends Testbase{

	@FindBy(xpath="(//*[@id='page-cta-container']/button)")
	WebElement Booktickets;
	
	public booktickets() throws IOException {
		PageFactory.initElements(driver,this);
	}

	public selecttime select() throws IOException {
		Booktickets.click();
	    return new selecttime();
	}

}
