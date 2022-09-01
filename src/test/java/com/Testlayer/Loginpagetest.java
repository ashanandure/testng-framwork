package com.Testlayer;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.baseclass;
import PageLayer.Loginpage;

public class Loginpagetest extends baseclass {
public static WebDriver driver;	

 @BeforeClass
 public void setup()
 {
	 baseclass.initialization();	 
 }
 
 @Test(priority=1)
 public void validateLoginFunctionality()
 {
	Assert.assertEquals(driver.getTitle().contains("HRM"),true);
	Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"),true);                                                  

 }
 @Test(priority=2)
 public void Login()
 {
	 Loginpage loginpage=new Loginpage() ;
	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password")); 
 }

 @Test(priority=3)
 public void validateHomePageFunctionality()
 {
	Assert.assertEquals(driver.getTitle().contains("HRM"),true);
	Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"),true);

}
}