package com.testng.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login page validation");
		//Assert.assertEquals(false, true);
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page validation");
	}
	@Test(dependsOnMethods="homePageTest")
	public void searchPageTest() {
		System.out.println("search page validation");
	}
	@Test(dependsOnMethods="searchPageTest")
	public void RegPageTest() {
		System.out.println("Registration page validation");
	}

}
