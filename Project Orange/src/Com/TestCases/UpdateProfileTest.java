package Com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.LoginPOM;
import Com.PomCase.UpdateProPOM;

public class UpdateProfileTest {
	@Test(groups = {"overAllFunctions"})
	public  void upddateProTest() {
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		
		UpdateProPOM.myInfo(driver).click();
		UpdateProPOM.editAndSaveBtn(driver).click();
		UpdateProPOM.firstName(driver).clear();
		UpdateProPOM.firstName(driver).sendKeys("John");
		UpdateProPOM.middleName(driver).clear();
		UpdateProPOM.lastName(driver).clear();
		UpdateProPOM.lastName(driver).sendKeys("vicks");
		UpdateProPOM.empId(driver).clear();
		UpdateProPOM.empId(driver).sendKeys("09876");
		UpdateProPOM.OtherID(driver).clear();
		UpdateProPOM.OtherID(driver).sendKeys("1100");
		UpdateProPOM.licId(driver).clear();
		UpdateProPOM.licId(driver).sendKeys("xxyyzz");
		UpdateProPOM.gender(driver).click();
		UpdateProPOM.martial(driver).selectByValue("Single");
		UpdateProPOM.dob(driver).clear();
		UpdateProPOM.dob(driver).sendKeys("2020-02-02");
		UpdateProPOM.nationality(driver).selectByVisibleText("Indian");
		UpdateProPOM.editAndSaveBtn(driver).click();

		LoginPOM.quit(driver);
		
		
	}
}
