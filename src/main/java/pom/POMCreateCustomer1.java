package pom;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class POMCreateCustomer1 {
	WebDriver driver;
	//Declaring Web Elements
	@FindBy(id="container_tasks")
	private WebElement containerTasks;	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createNewCustomerItem;	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNametextField;	
	@FindBy(xpath="(//div[.='  Create Customer'])[2]")
	private WebElement createCustomerButton;	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelCustomerButton;	
	//Initialization of WebElements
		//Create a constructor
		public POMCreateCustomer1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}		
		//Utilization
		public void createCustomer() throws IOException
		{
			containerTasks.click();
			addNewButton.click();
			createNewCustomerItem.click();
			customerNametextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 2));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			createCustomerButton.click();
		}
		public void cancelCustomer() throws IOException
		{
			containerTasks.click();
			addNewButton.click();
			createNewCustomerItem.click();
			customerNametextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 2));
			try {
				Thread.sleep(3000);
				cancelCustomerButton.click();
				Thread.sleep(3000);
				driver.switchTo().alert().dismiss();
				cancelCustomerButton.click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
