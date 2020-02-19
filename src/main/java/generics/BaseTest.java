package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.POMActiTimeLogin;

public class BaseTest implements AutoConstant{
	public WebDriver driver;
	@BeforeMethod
	public void openApp() throws IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(url);
		POMActiTimeLogin login = new POMActiTimeLogin(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Browser is opening");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Browser is closing");
	}
}
