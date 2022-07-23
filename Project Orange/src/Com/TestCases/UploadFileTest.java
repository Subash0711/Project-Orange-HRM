package Com.TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.PomCase.ChkBoardsPOM;
import Com.PomCase.LoginPOM;
import Com.PomCase.UploadFilePom;

public class UploadFileTest {
	@Test(groups = {"overAllFunctions"})
	public void uplooadFileTest() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPOM.userName(driver).sendKeys("Admin");
		LoginPOM.passWord(driver).sendKeys("admin123");
		LoginPOM.submit(driver).click();
		
		ChkBoardsPOM.recuirment(driver).click();
		
		UploadFilePom.addBtn(driver).click();
		UploadFilePom.firstName(driver).sendKeys("Jhonny");
		UploadFilePom.lastName(driver).sendKeys("Deep");
		UploadFilePom.email(driver).sendKeys("jhonny123@gmail.com");
		UploadFilePom.vacancy(driver).selectByVisibleText("Test Automation Engindeer");
		UploadFilePom.choosefile(driver).sendKeys("C:\\\\Users\\\\subas\\\\OneDrive\\\\Documents\\\\TEST FILE.docx");
		UploadFilePom.saveBtn(driver).click();
		
		LoginPOM.quit(driver);
		
		
	}
}
