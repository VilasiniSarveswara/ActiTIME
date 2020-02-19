package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class POMCreateProject1 {
	WebDriver driver;
	// Declaring Web Elements
	@FindBy(id="container_tasks")
	private WebElement containerTasks;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement createNewProjectItem;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectNameTextField;
	
	@FindBy(xpath="//div[.='Customer:']/..//div[@class='dropdownButton']")
	private WebElement customerDropdownButton;
	
	@FindBy(xpath="//div[@class='customerContainer']//div[.='Sachin']")
	private WebElement searchItemFromList;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement createProjectButton;
	
	@FindBy(xpath="(//div[@class='greyButton cancelBtn'])[2]")
	private WebElement cancelButton;
	
	//Initialization of WebElements
		//Create a constructor
		public POMCreateProject1(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}		
		//Utilization
		public void createProject() throws IOException
		{
			try {
			Thread.sleep(15000);
			containerTasks.click();
			addNewButton.click();
			createNewProjectItem.click();
			projectNameTextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 4));
			customerDropdownButton.click();
			searchItemFromList.click();
			Thread.sleep(5000);
			createProjectButton.click();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}