package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class POMCreateWork1 {
	private WebDriver driver;
	// Declaring Web Elements
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_settings']")
	private WebElement settingsPopupMenu;
	@FindBy(xpath = "//a[text()='Types of Work']")
	private WebElement typesOfWorkLink;
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	@FindBy(id = "name")
	private WebElement nameTextField;
	@FindBy(xpath = "//select[@name='active']")
	private WebElement statusDropdown;
	@FindBy(xpath = "//option[@value='false']")
	private WebElement archivedSelectOption;
	@FindBy(xpath = "//input[@value='   Create Type of Work   ']")
	private WebElement createNewTypeOfWorkButton;	
	@FindBy(xpath = "//a[contains(text(),'Dinesh')]/../..//a[contains(.,'delete')]")
	private WebElement deleteButton;
	
	// Initialization of WebElements
	// Create a constructor
	public POMCreateWork1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// Utilization
	public void createWork() throws IOException {
		try {
			Thread.sleep(5000);
			settingsPopupMenu.click();
			typesOfWorkLink.click();
			Thread.sleep(3000);
			createTypeOfWorkButton.click();
			nameTextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 3));
			statusDropdown.click();
			archivedSelectOption.click();
			createNewTypeOfWorkButton.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteWork()
	{		
		try {
			settingsPopupMenu.click();
			typesOfWorkLink.click();
			Thread.sleep(3000);
			deleteButton.click();
			driver.switchTo().alert().dismiss();
			deleteButton.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
