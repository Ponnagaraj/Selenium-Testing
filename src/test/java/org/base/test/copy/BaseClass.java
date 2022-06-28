package org.base.test.copy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.execchain.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		
		static WebDriver driver;
		public static WebDriver chromeLaunch() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			return driver;
		}
		public static WebDriver firefoxLaunch() {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			return driver;
		}
		public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
		}
		public static WebDriver ieLaunch() {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			return driver;
		}
		public static void urlLaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		public static void implicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
		public static void singleTime(Integer sec) throws InterruptedException {
			Thread.sleep(sec);	
		}
		public static void sendKeys(WebElement e,String value) {
			e.sendKeys(value);
		}
		public static void click(WebElement e) {
			e.click();
		}
		public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		}
		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		public String getAttribute(WebElement e) {
			String string = e.getAttribute("value");
			return string;
		}
		public static void btnEsc() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		}
		public static void btnEnter() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		
		
		
		
		
}



