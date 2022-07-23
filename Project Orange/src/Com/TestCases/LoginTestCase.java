package Com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.LoginPOM;

public class LoginTestCase {
	@Test(groups = {"overAllFunctions"})
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		LoginPOM.quit(driver);
		
	}
	
}