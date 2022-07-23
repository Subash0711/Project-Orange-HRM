package Com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.LoginPOM;
import Com.PomCase.UpdateContDetlsPom;
import Com.PomCase.UpdateProPOM;

public class UpdateContDetlsTest {

	@Test(groups = {"overAllFunctions"})
	public  void updateContDetlsTest() {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		
		UpdateProPOM.myInfo(driver).click();
		
		UpdateContDetlsPom.contactDetails(driver).click();
		UpdateContDetlsPom.editAndSaveBtn(driver).click();
		UpdateContDetlsPom.adress1(driver).sendKeys("01,ABC street,");
		UpdateContDetlsPom.adress2(driver).sendKeys("XYZ City");
		UpdateContDetlsPom.city(driver).sendKeys("XYZ");
		UpdateContDetlsPom.state(driver).sendKeys("MNOP");
		UpdateContDetlsPom.postalCode(driver).sendKeys("123 456");
		UpdateContDetlsPom.country(driver).selectByVisibleText("India");
		UpdateContDetlsPom.homePhone(driver).sendKeys("098-765-432");
		UpdateContDetlsPom.mobile(driver).sendKeys("9876-5432-01");
		UpdateContDetlsPom.workPhone(driver).clear();
		UpdateContDetlsPom.workPhone(driver).sendKeys("5432-6789");
		UpdateContDetlsPom.workEmail(driver).clear();
		UpdateContDetlsPom.workEmail(driver).sendKeys("xyz@gmail.com");
		UpdateContDetlsPom.otherEmail(driver).sendKeys("zyx@gmail.com");
		UpdateContDetlsPom.editAndSaveBtn(driver).click();
		
		LoginPOM.quit(driver);
	}
}
