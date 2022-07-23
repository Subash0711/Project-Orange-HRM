package Com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.AddAdminUserPom;
import Com.PomCase.ChkBoardsPOM;
import Com.PomCase.LoginPOM;

public class AddAdminUser {
	@Test(groups = {"overAllFunctions"})
	public  void addAdminUser() {
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		
		ChkBoardsPOM.admin(driver).click();
		
		AddAdminUserPom.addBtn(driver).click();
		AddAdminUserPom.userRole(driver).selectByValue("1");
		AddAdminUserPom.userName(driver).sendKeys("Johnny0011");
		AddAdminUserPom.employeName(driver).sendKeys("Charlie Carter");
		AddAdminUserPom.status(driver).selectByValue("1");
		AddAdminUserPom.password(driver).sendKeys("jhon@321");
		AddAdminUserPom.cnfPassword(driver).sendKeys("jhon@321");
		AddAdminUserPom.saveBtn(driver).click();
		
		LoginPOM.quit(driver);
		
		
	}
	
}
