package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Class2 {
	@FindBy(xpath="//a[text()='Blog']")
	WebElement blogpageObj;
	
	public boolean blogpageselect() {
		boolean myStatus=false;
		try {
		if (blogpageObj.isDisplayed()) {
			myStatus=true;
		}	
		}
		catch (Exception e) {
			myStatus=false;
		}
		return myStatus;
	}

}
