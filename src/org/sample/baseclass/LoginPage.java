package org.sample.baseclass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@type='text']")
private WebElement txtuser;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(xpath="//input[@type='Submit']")
private WebElement btnlogin;

public WebElement getTxtuser() {
	return txtuser;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnlogin() {
	return btnlogin;
}


}


