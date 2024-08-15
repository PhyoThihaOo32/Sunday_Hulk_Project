package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpSkillPracticeLocators {
	
	//MouseHover
	@FindBy (xpath="//button[contains(text(), 'Hover Over')]")
	public WebElement linkMouseHover;

	//Link 1	
	@FindBy( xpath= "//a[contains(text(),'Link 1')]")
	public WebElement linkLink;
	
	//DropDown btn
	@FindBy (xpath= "//select[@class= 'form-select']")
	public WebElement btnDropDown;

	//Validate option 1
	@FindBy (xpath= "//*[text()='Option 1']")
	public WebElement optionsdd;

	//Alert box
	@FindBy (xpath="//button[contains(text(),'Alert')]")
	public WebElement bxAlert;
	
	//textbox
	@FindBy ( xpath = "//*[contains(@placeholder,'search')]")
	public WebElement txtbx;
}