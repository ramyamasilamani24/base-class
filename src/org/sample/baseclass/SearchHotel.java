package org.sample.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
public SearchHotel() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//select[@name='location']")
private WebElement txtSelect;
@FindBy(xpath="//select[@name='hotels']")
private WebElement txtHotel;
@FindBy(xpath="//select[@name='room_type']")
private WebElement txtRoom;
@FindBy(xpath="//input[@id='datepick_in']")
private WebElement txtdate;
@FindBy(xpath="//input[@id='datepick_out']")
private WebElement txt1date;
@FindBy(xpath="//select[@id='adult_room']")
private WebElement Room;
@FindBy(xpath="//select[@id='child_room']")
private WebElement ChildRoom;
@FindBy(xpath="//input[@id='Submit']")
private WebElement Search;
public WebElement getTxtSelect() {
	return txtSelect;
}
public WebElement getTxtHotel() {
	return txtHotel;
}
public WebElement getTxtRoom() {
	return txtRoom;
}
public WebElement getTxtdate() {
	return txtdate;
}
public WebElement getTxt1date() {
	return txt1date;
}
public WebElement getRoom() {
	return Room;
}
public WebElement getChildRoom() {
	return ChildRoom;
}
public WebElement getSearch() {
	return Search;
}
}
