package com.cart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greens {
	
	static WebDriver driver;
    
	@BeforeClass
    public void beforeclass()
    {
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    	driver.get("http://greenscart.in/#/login?returnUrl=%2F");
    }
	@AfterClass
	
	   public static void afterclass()
	   {
		driver.close();
	   }
	@Before
	  
	  public void beforeMethod()
	  {
		long start = System.currentTimeMillis();
		System.out.println(start);
	  }
	@After
	
	  public void afterMethod()
	  {
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
	  }
	@Test
	
	 public void login()
	 {
		
		WebElement TxtEmailid = driver.findElement(By.xpath("//input[@placeholder='Email Id *']"));
		TxtEmailid.sendKeys("vinoth");
		
		WebElement TxtPass = driver.findElement(By.xpath("//input[@type='password']"));
		TxtPass.sendKeys("jaculin");
		
		WebElement BtnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
		BtnLogin.click();
		
	 }
     

	

}
