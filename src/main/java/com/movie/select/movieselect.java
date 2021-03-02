package com.movie.select;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.movie.base.Testbase;

public class movieselect extends Testbase{

	@FindBy(xpath="//span[contains(text(),'Search for Movies')]")
    WebElement SearchMovie;
	
	@FindBy(xpath="//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")
	WebElement typeMovieName;


	public movieselect() throws IOException {
		PageFactory.initElements(driver,this);

	}

	public booktickets movieselect(String moviename) throws IOException, InterruptedException {
		System.out.println("Entered movie select");
	
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Search for Movies')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);

		System.out.println("Clicked span");
	
	
	
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(typeMovieName));
		
		System.out.println("Wait is over");
		typeMovieName.sendKeys(moviename);
		Thread.sleep(2000);
		typeMovieName.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		return new booktickets();
	}
}




