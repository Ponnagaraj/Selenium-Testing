package org.test;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FlipkartProject extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException{
	WebDriver driver = chromeLaunch();
	urlLaunch("https://www.flipkart.com/");
	implicitWait(30);
	btnEsc();
	WebElement search = driver.findElement(By.name("q"));
	sendKeys(search, "iphone");
	btnEnter();
	//acsending----> (//div[@class='_10UF8M'])[2]
	//product----->  //div[@class='_4rR01T']
	WebElement asc = driver.findElement(By.xpath("//div[@class='_10UF8M'][2]"));
	click(asc);
	singleTime(3000);
	//WebElement ds = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	//System.out.println(ds.getText());
	List<WebElement> products1 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	int size = products1.size();
	System.out.println(size);
	for (int i=1; i<=products1.size(); i++) {
		WebElement fg = driver.findElement(By.xpath("(//div[@class='_4rR01T'])"+"["+i+"]"));
		System.out.println(fg.getText());
		WebElement gf = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])"+"["+i+"]"));
		System.out.println(gf.getText());
	}
	}	
	
	
	}
