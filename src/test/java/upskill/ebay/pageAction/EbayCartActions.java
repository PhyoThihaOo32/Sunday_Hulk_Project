package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
			for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void selectSizeTypeDD() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);
//		dropDown.selectByVisibleText("Big & Tall");
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
	}
	
	public void selectMenSizeDD() throws Exception{
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
//		dropDown.selectByVisibleText("4XLT");
//		dropDown.deselectAll();
//		dropDown.selectByValue("5");
		dropDown.selectByValue(ReadExcelSheet.getMapData("MenSize"));
	}
	
	public void selectShadeDD() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObj.ddShade);
//		dropDown.selectByVisibleText("Black");
//		dropDown.selectByIndex(3);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
	}
	
	public void enterQuantity() throws Exception{
		EbayCartLocatorsObj.txtbxQty.clear();
//		EbayCartLocatorsObj.txtbxQty.sendKeys("2");
		EbayCartLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
	}
	
	public void addToCart(){
		EbayCartLocatorsObj.btnAddCart.click();
	}
}