package com.movie.select;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movie.base.Testbase;

public class selecttime extends Testbase{


	@FindBy(xpath="//div[contains(text(),'																	09:55 PM																')]")
	WebElement selecttime;
	
	
	public selecttime() throws IOException {
		PageFactory.initElements(driver,this);

	}

	public selectseat select(int numOfPersons) throws IOException, InterruptedException {
		selecttime.click();
		Thread.sleep(1000);
	
				driver.findElement(By.id("btnPopupAccept")).click();
				driver.findElement(By.id("pop_"+numOfPersons)).click();
				driver.findElement(By.id("proceed-Qty")).click();

				
		return new selectseat();
	
	}
}

	
	
	
	
	

