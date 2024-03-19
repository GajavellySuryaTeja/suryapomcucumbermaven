package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Class3 {
	@Test
	public void loginpage() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		Class1 c1=PageFactory.initElements(driver,Class1.class);
		Class2 c2=PageFactory.initElements(driver, Class2.class);
		
		c1.stduid("student");
		c1.stdpwd("Password123");
		c1.stdloginbtn();
		Thread.sleep(3000);
		
		if (c2.blogpageselect()) {
			
			System.out.println("Successful login operation");
			  
		}
		else {
			System.out.println("Unsuccessful login operation");
		}
		

	}


}
