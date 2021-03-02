package com.movie.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.movie.util.testutil;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;


	public Testbase() throws IOException {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"/Users/vigne/eclipse-workspace/Movie/src/main/java/com/movie/config/Configproperties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void initialization() throws InterruptedException{
		prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		Thread.sleep(4000);
		//WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search for your city']"));
		//location.sendKeys(prop.getProperty("Location"));
	}
}




