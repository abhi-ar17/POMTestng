package com.beCognizant.first.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beCognizant.first.pages.FirstPage;

public class TestClass extends TestBase{
  @Test
  public void f() {
	  FirstPage fp = PageFactory.initElements(driver, FirstPage.class);
	  fp.logIn();
	  fp.clickAbout();
	  
  }
}
