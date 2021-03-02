package com.movie.select;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movie.base.Testbase;

public class selectseat extends Testbase {
	
	@FindBy(xpath="//*[@id='layout']/table/tbody")
	WebElement table;

	public selectseat() throws IOException {
		PageFactory.initElements(driver,this);
	}

	public void select(int numOfPersons) {
		int selectedCount = 0;
		int rowCount=0;
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for (WebElement webElement : tableRows) {
			rowCount++;
			int columnCount = 0;
			System.out.println("Checking row number: "+rowCount);
			List<WebElement> tableD = webElement.findElements(By.tagName("td"));
			for (WebElement tdElem : tableD) {
				columnCount++;
				System.out.println("Checking column number: "+columnCount);
				if(tdElem.getAttribute("class").equalsIgnoreCase("SRow1")) {
					List<WebElement> divList = tdElem.findElements(By.tagName("div"));
					int divCount = 0;
					for (WebElement divElem : divList) {
						divCount++;
						System.out.println("Checking div number: "+divElem.getAttribute("id"));
						if(divElem.getAttribute("class").equalsIgnoreCase("seatI")) {
							List<WebElement> aTag = divElem.findElements(By.tagName("a"));
							if(aTag.size()>0) {
								System.out.println("Div with a tag: "+divElem.getAttribute("id")+ "    a tag class: "+aTag.get(0).getAttribute("class"));
								System.out.println();
								if(aTag.get(0).getAttribute("class").equalsIgnoreCase("_available")){
									aTag.get(0).click();
									selectedCount++;
									System.out.println("Selected Div ID: "+divElem.getAttribute("id"));
									if(selectedCount==numOfPersons) {
										break;
									}
								}
							}
						}
					}
					if(selectedCount==numOfPersons) {
						break;
					}
				}
			}
			if(selectedCount==numOfPersons)
				break;
			}
		}
	}
	

