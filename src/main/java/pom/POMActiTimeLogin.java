package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class POMActiTimeLogin {
	// Declaring Web Elements

		@FindBy(xpath = "//input[@name='username']")
		private WebElement usernametextField;

		@FindBy(xpath = "//input[@name='pwd']")
		private WebElement passwordtextField;

		@FindBy(id = "keepLoggedInCheckBox")
		private WebElement keepLoggedInCheckBox;

		@FindBy(id = "loginButton")
		private WebElement loginButton;

		@FindBy(id = "toPasswordRecoveryPageLink")
		private WebElement toPasswordRecoveryPageLink;

		@FindBy(xpath = "//a[.='actiTIME Inc.']")
		private WebElement actiTIMELink;

		// Initialization of WebElements
		// Create a constructor
		public POMActiTimeLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Utilization
		public void loginMethod() throws IOException {
			usernametextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 0));
			passwordtextField.sendKeys(ExcelLibrary.getCellValue("ActiTimeSheet", 1, 1));
			keepLoggedInCheckBox.click();
			loginButton.click();
		}
	}