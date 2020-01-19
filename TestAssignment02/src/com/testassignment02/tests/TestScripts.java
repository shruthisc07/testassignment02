package com.testassignment02.tests;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.testassignment02.driverscript.DriverScript;
import com.testassignment02.objectrepository.ObjectRepository;

public class TestScripts extends DriverScript {
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	static void launchApp(String strBrowser)
	{
		
		try {
			switch(strBrowser.toLowerCase())
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
					oBrowser = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
					oBrowser = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\drivers\\geckodriver.exe");
					oBrowser = new FirefoxDriver();
					break;
				default:
					System.out.println("Fail,Executing 'launchApp' method Invalid browser name '"+strBrowser);
			}
			oPage=new ObjectRepository(oBrowser);
			
			if(oBrowser!=null)
			{
				oBrowser.manage().window().maximize();
				
			}else {
				System.out.println("invalid"); 
				
			}
		}catch(Exception e)
		{
			System.out.println("Fail,Executing 'launchApp' method Exception while executing 'launchApp' method. "+e.getMessage());
			
		}
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */

	 static void navigate()
	{
		try
		{
			oBrowser.get("https://www.tripadvisor.in/");
			Thread.sleep(5000);
			System.out.println("page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void search()
	{
		try
		{
			oPage.getsearch().click();
			System.out.println("clicked on search");
			oPage.getclickonsearchicon().sendKeys("Club Mahindra");
			System.out.println("searching for clubmahindra"); 
			oPage.getclickOnSearchButton().click();
			
			Thread.sleep(5000);
			oPage.getclickonfristsearch().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void writeReview()
	{
		
			String sParent = oBrowser.getWindowHandle();
			System.out.println("Parent: "+sParent);
			try
			{
				
				Set<String> s1=oBrowser.getWindowHandles();		
		        Iterator<String> i1=s1.iterator();		
		        		
		        while(i1.hasNext())			
		        {		
		            String ChildWindow=i1.next();		
		            		
		            if(!sParent.equalsIgnoreCase(ChildWindow))			
		            {    		
		                 
		                    // Switching to Child window
		                    oBrowser.switchTo().window(ChildWindow);
		                    Thread.sleep(4000);
		                    
		                    System.out.println("new window");
		                    String sURL = oBrowser.getCurrentUrl();
							System.out.println("URL: "+sURL);
			oPage.getwritereview().click();
			System.out.println("clicked on review");
			Actions action=new Actions(oBrowser);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@class='ui_bubble_rating fl bubble_00']"));
			action.moveToElement(oEle).perform();
		//  action.moveToElement(driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[4]")));
		 //   action.moveToElement(driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[5]"))).perform();
		    action.click();
			
		
			
			oPage.getwriteReviewOnTexttitle().sendKeys("good");
			oPage.getwriteReviewOnTextfield().sendKeys("nice place to visit");
			System.out.println("searching for clubmahindra"); 
			oPage.getclickOnSearchButton().click();
			
			Thread.sleep(5000);
			oPage.getclickonfristsearch().click();
		            }}}catch(Exception e)
		{
			e.printStackTrace();
		}}
		static void HotelReview()
		{
			try
			{
				if(oPage.getsearchhotelsectionreview().isDisplayed())
				{
					System.out.println("hotel review is available");
				Actions action=new Actions(oBrowser);
				WebElement oEle=oPage.getservice();
				action.moveToElement(oEle).perform();
			//  action.moveToElement(driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[4]")));
			 //   action.moveToElement(driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[5]"))).perform();
			    action.click();
			    oPage.getsubmitrating().click();
			    
				}
			
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	

	
	
	 public static void closeApp()
		{
			oBrowser.quit();
		}
}


