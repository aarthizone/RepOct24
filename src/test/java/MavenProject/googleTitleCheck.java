package MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleTitleCheck {
	WebDriver driver;
	//Error comes if using BeforeTest and AfterTest method instead of all code in single method
/*@BeforeTest
public void loadUrl() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}*/
@Test(priority = 0)
public void titleCheck() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String expTitle="Google";
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	if(expTitle.contentEquals(actTitle)) {   //(or) 
		//Assert.assertEquals(driver.getTitle(), actTitle);
		System.out.println("Google title TestCase Passed");
		
	}
	else
	{
		System.out.println("Google title TestCase Failed");
	}
	driver.close();
	driver.quit();
}
/*@AfterTest
public void closeDriver() {
	driver.close();
	driver.quit();
}*/
}




