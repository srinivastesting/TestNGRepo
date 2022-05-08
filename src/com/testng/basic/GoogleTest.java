package com.testng.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	
	}
	@Test(priority=1,groups="title")
	public void titleTest(){
		String title=driver.getTitle();
		System.out.println("page title:"+title);
	}
	@Test(priority=2,groups="logo",invocationCount = 10)
	public void logoTest() {
		boolean b=driver.findElement(By.cssSelector("img#hplogo")).isDisplayed();
		System.out.println("logo is displayed:"+b);
	}
	@Test(priority=3,groups="mail")
	public void mailTest() {
		boolean a=driver.findElement(By.xpath("//a[contains(text(),'rac')]")).isDisplayed();
		System.out.println("gmail is displayed:"+a);
		
	}
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("Test case1 for the gmail");
	}
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("Test case2 for the gmail");
	}
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("Test case3 for the gmail");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
