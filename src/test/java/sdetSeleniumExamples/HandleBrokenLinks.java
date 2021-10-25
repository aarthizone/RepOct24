package sdetSeleniumExamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			URL link=new URL(url);
			try {
				HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
				httpcon.connect();
				
				if(httpcon.getResponseCode()>=400)
				{
					System.out.println("Broken link");
				}
				else
				{
					System.out.println("Valid link");
				}
			}catch(Exception e) {
				
			}
					
		}
	}

}
