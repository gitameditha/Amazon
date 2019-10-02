package com.travel.com.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesCase {

	public WebDriver driver;
	
	@Before
	public void test(){
		
		

		//fail("Not yet implemented");
//		System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\GeckoDriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette",true);
//		driver = new FirefoxDriver(capabilities);
		
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		  driver=new ChromeDriver();  
	}
	
	@Test
	public void TestCase() {
		
		 	JavascriptExecutor js = (JavascriptExecutor)driver;	
	        driver.get("https://www.amazon.com");
	        
	        WebElement searchDropdown = driver.findElement(By.id("searchDropdownBox"));  
	        js.executeScript("window.scrollTo(0,"+searchDropdown.getLocation().y+")");
		    Select Objelec = new Select(searchDropdown); 
		    
		    
		    Objelec.selectByValue("search-alias=electronics-intl-ship");
	        
	        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div")).click();
	        
	        driver.findElement(By.linkText("Television & Video")).click();

	        driver.findElement(By.linkText("Televisions")).click();

	        WebElement sortPrice = driver.findElement(By.id("s-result-sort-select"));
	        Select lowPrice = new Select(sortPrice); 
	        lowPrice.selectByValue("price-asc-rank");
	        
	    	driver.findElement(By.id("high-price")).sendKeys("150");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/span/div/div[4]/ul/li[5]/span/form/span[3]/span")).click();
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/span/div/div[5]/ul[1]/li[1]/span/a/div")).click();
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/span/div/div[5]/ul[3]/li[3]/span/a/div")).click();
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/span/div/div[3]/ul/li[4]/span/a/div")).click(); //Naxa electronic

	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[3]/div[1]/div/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span")).click();
	        
	        driver.findElement(By.id("add-to-wishlist-button-submit")).click(); 
	        
	        driver.findElement(By.id("ap_email")).sendKeys("xtremaxtest082@gmail.com");
	        
	        driver.findElement(By.id("continue")).click(); 
	        
	        driver.findElement(By.id("ap_password")).sendKeys("cilokbakar123");
	        
	        driver.findElement(By.id("signInSubmit")).click(); 

	        

   


	}
	
	@After
    public void endTest() {
        driver.quit();
        
    }
}
