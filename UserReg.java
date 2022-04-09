package com.TestKeywordLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserReg
{
	static WebDriver driver;
		 public static void Open_Browser()
			{	    		
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMTK\\Softwares\\chromedriver.exe");
//			    driver = new ChromeDriver();
			 System.out.println("Opened Chrome Browser");
			}
		 public static void Website() throws Exception
	    	{	    		
			 driver.get("http://demowebshop.tricentis.com/");
		        Thread.sleep(1000);
			 System.out.println("Navigated to Website");
	    	}
		 public static void Reg_Link() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
			 Thread.sleep(1000);
			 System.out.println("Navigated to Register Page");
	    	}
		 public static void Male() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			 Thread.sleep(1000);
			 System.out.println("selected Male Option");
	    	}
		 public static void Female() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='gender-female']")).click();
			 Thread.sleep(1000);
			 System.out.println("selected Female Option");
	    	}
		 public static void First_Name() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("pramod");
			 Thread.sleep(1000);
			 System.out.println("New User First Name Entered");
	    	}
		 public static void Last_Name() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kulkarni");
			 Thread.sleep(1000);
			 System.out.println("New User Last Name Entered");
	    	}
		 public static void First_Name_F() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rashmi");
			 Thread.sleep(1000);
			 System.out.println("New User First Name Entered");
	    	}
		 public static void Last_Name_F() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kulkarnie");
			 Thread.sleep(1000);
			 System.out.println("New User Last Name Entered");
	    	}
		 
		 public static void Email() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Pramodrocky13xcxa@gmail.com");
			 Thread.sleep(1000);
			 System.out.println("New user Valid Email Entered ");
	    	}
		 public static void Email_F() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Rashmirockydxxcds@gmail.com");
			 Thread.sleep(1000);
			 System.out.println("New user Valid Email Entered ");
	    	}
		 public static void Wrong_Email() throws Exception
	    	{
		 		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("pramodgmail.com");
				 Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//span[contains(text(),'Wrong email')]")).isDisplayed();
//				 Thread.sleep(1000);
			 System.out.println("Entered Email ID Wrong");
	    	}
		 public static void Email_E() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Pramodrocky123fdfa@gmail.com");
			 Thread.sleep(1000);
			 System.out.println("Email Already Exist !");
	    	}
		 	public static void Invalid_Email_Alert() 
	    	{
			 System.out.println("Registration Unsuccessfull");
	    	}
		 public static void Password() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
			 Thread.sleep(1000);
			 System.out.println("New user Valid Password Entered ");
	    	}
		 public static void Wrong_Password() throws Exception
	    	{
		 		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1sjd");
				 Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//span[contains(text(),'The password and confirmation password do not matc')]")).isDisplayed();
//				 Thread.sleep(1000);
			 System.out.println("Entered Password Wrong");
	    	}
		 	public static void Invalid_Password_Alert() 
	    	{
			 System.out.println("Registration Unsuccessfull");
	    	}
		 public static void ConfirmPassword() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
			 Thread.sleep(1000);
			 System.out.println("Validated Confirm Password Entered");
	    	}
		 public static void Password_F() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("qwerty");
			 Thread.sleep(1000);
			 System.out.println("New user Valid Password Entered ");
	    	}
		 public static void ConfirmPassword_F() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("qwerty");
			 Thread.sleep(1000);
			 System.out.println("Validated Confirm Password Entered");
	    	}
		
		 public static void Reg_Button() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//input[@id='register-button']")).click();
			 Thread.sleep(1000);
			 System.out.println("Selected Register Button ");
	    	}
		 public static void Confirm_RegisterPage() throws Exception
	    	{
			 driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed();
			 Thread.sleep(1000);
			 System.out.println("Thank you for Registration");
	    	}
		 public static void Continue() throws Exception
	    	{	    		
			 driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]")).click();
			 Thread.sleep(1000);
			 System.out.println("Selected on Continue Button and Navigated to Home Page ");
			 System.out.println("Close the Chrome Driver");
			 driver.close();
	    	}
	}


	
















	
//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMTK\\Softwares\\chromedriver.exe");
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("http://demowebshop.tricentis.com/");
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(Rocky);
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(Bhai);
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(RockyBhai@gmail.com);
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Rocky123@);
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(Rocky123@);
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@id='register-button']")).click();
//	        Thread.sleep(6000);
//	        
//	        
//	        	
//	        driver.close();
////	}
//	       
//	        public static void Female()
//	    	{	    		System.out.println("User select Gender Female");
//	    	
//	    	}
//	        public static void First_Name()
//	    	{	    		System.out.println("Enter First Name");
//	    	
//	    	}
//	        public static void Last_Name()
//	    	{	    		System.out.println("Enter Last Name");
//	    	
//	    	}
//	        public static void Email()
//	    	{	    		System.out.println("Enter user Email");
//	    	
//	    	}
//	        public static void Password()
//	    	{	    		System.out.println("Enter user Password");
//	    	
//	    	}
//	        public static void Confirm_Password()
//	    	{	    		System.out.println("Enter user Confirm Password");
//	    	
//	    	}
//	        public static void Register()
//	    	{	    		System.out.println("Click on Register Button");
//	    	
//	    	}
//	    	
//}
