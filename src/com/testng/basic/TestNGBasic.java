package com.testng.basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite -----Setup browser app");
		
	}
	@BeforeTest
	public void launch() {
		System.out.println("@BeforeTest----Launch the browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass---login to the app");
	}
	@BeforeMethod
	public void appServer() {
		System.out.println("@BeforeMethod----App server");
	}
	@Test
	public void testCases() {
		System.out.println("@Test-----test cases for the login");
	}
	@Test
	public void google() {
		System.out.println("@Test-----google  for the login");
	}
	@Test
	public void title() {
		System.out.println("@Test-----title cases for the login");
	}
	
	@AfterMethod
	public void booking() {
		System.out.println("@AfterMethod----Booking ticket");
	}
	@AfterClass
	public void payment() {
		System.out.println("@AfterClass----Payment of the ticket");
	}
	@AfterTest
	public void ticketConf() {
		System.out.println("@AfterTest----Ticket confirmation");
	}
	@AfterSuite
	public void movieTheatre() {
		System.out.println("@AfterSuite-----movie theatre");
	}
	
	
	
}
