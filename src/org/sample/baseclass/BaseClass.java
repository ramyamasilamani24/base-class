package org.sample.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\ExcelDateFormat\\src\\main\\java\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadurl(String url) {
		driver.get(url);
	}
	public static void btnclick(WebElement element ) {
	element.click();
	}
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
		

	}
	public static void mouseOver(WebElement element) {
		new Actions(driver).moveToElement (element).perform();
		

	}
	public static void dropdown(WebElement element, String VisbleText) {
	Select s=new Select(element);
	s.selectByVisibleText(VisbleText);
		
	}
	public static void dropinteger(WebElement element,String a){
		Select s1=new Select(element);
		s1.selectByVisibleText(a);
		

	}
}
