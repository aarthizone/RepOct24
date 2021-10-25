package MavenProject;
// hi arthi lj==
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class gmailLoginCheck {
	
	WebDriver driver;
	@Test
	public void loginCheck() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("aarthizone@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("welcome");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		if (driver.getPageSource().contentEquals("The password you’ve entered is incorrect. Forgot Password?"))
		{
			System.out.println("Facebook Login TestCase passed");
		}
		else {
			System.out.println("Facebook Login TestCase Failed");
		}
		driver.close();
	}
	

}
