package org.sample.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass{
public Hotel() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@id='radiobutton_0']")
private WebElement clickradiobtn;
@FindBy(xpath="//input[@id='continue']")
private WebElement clksearch;
@FindBy(xpath="//input[@id='first_name']")
private WebElement typefrst;
@FindBy(xpath="//input[@id='last_name']")
private WebElement typelast;
@FindBy(xpath="//textarea[@id='address']")
private WebElement typeadd;
@FindBy(xpath="//input[@id='cc_num']")
private WebElement typecredit;
@FindBy(xpath="//select[@id='cc_type']")
private WebElement typecard;
@FindBy(xpath="//select[@id='cc_exp_month']")
private WebElement typemon;
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement typeyr;
@FindBy(xpath="//input[@id='cc_cvv']")
private WebElement typecvv;
@FindBy(xpath="//input[@id='book_now']")
private WebElement clkbook;
public WebElement getClickradiobtn() {
	return clickradiobtn;
}
public WebElement getClksearch() {
	return clksearch;
}
public WebElement getTypefrst() {
	return typefrst;
}
public WebElement getTypelast() {
	return typelast;
}
public WebElement getTypeadd() {
	return typeadd;
}
public WebElement getTypecredit() {
	return typecredit;
}
public WebElement getTypecard() {
	return typecard;
}
public WebElement getTypemon() {
	return typemon;
}
public WebElement getTypeyr() {
	return typeyr;
}
public WebElement getTypecvv() {
	return typecvv;
}
public WebElement getClkbook() {
	return clkbook;
}
}