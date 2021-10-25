package sdetSeleniumExamples;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/#");
		String windowId=driver.getWindowHandle();
		System.out.println(windowId);
		driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[3]/ul/li[1]/a")).click();
		Set<String> windowsIDs=driver.getWindowHandles();
		//First method -iterator()
		 //Iterator<String> it= windowsIDs.iterator();
		 //String parentId=it.next();
		 //String childId=it.next();
		
		//Second method - using List/Array list 	
		 List<String> windowsIdsList=new ArrayList(windowsIDs); //Arraylist is class which is implemented from List interface
		 windowsIdsList.get
	}

}
