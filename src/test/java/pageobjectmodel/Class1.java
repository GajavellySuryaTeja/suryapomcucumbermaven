package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Class1 {
	
		
	@FindBy(name="username")
	WebElement stdnameObj;
	
	@FindBy(name="password")
	WebElement stdpwdObj;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement stdloginObj;
	
	public void stduid(String uid) { 
		stdnameObj.sendKeys(uid);	
	}
	public void stdpwd(String pwd) {
		stdpwdObj.sendKeys(pwd); 
	}
	public void stdloginbtn() {
		stdloginObj.click();
		
	}


}
