package Com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.ChkBoardsPOM;
import Com.PomCase.LoginPOM;

public class CheckBoardsTest {

	@Test(groups = {"overAllFunctions"})
	public void checkBoradTest() {
	
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		
		ChkBoardsPOM.admin(driver).click();
		ChkBoardsPOM.pim(driver).click();
		ChkBoardsPOM.leave(driver).click();
		ChkBoardsPOM.time(driver).click();
		ChkBoardsPOM.recuirment(driver).click();
		ChkBoardsPOM.myInfo(driver).click();
		ChkBoardsPOM.performance(driver).click();
		ChkBoardsPOM.directory(driver).click();
		ChkBoardsPOM.maintanence(driver).click();
		ChkBoardsPOM.buzz(driver).click();
		
		LoginPOM.quit(driver);
		
		
	}
}
