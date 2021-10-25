package sdetSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			//Alert window with Ok button
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			
			//Alert window with Ok and Cancel
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//Close alert using Ok button
			driver.switchTo().alert().dismiss();//CLose alert using Dismiss button
			
			
	}

}
