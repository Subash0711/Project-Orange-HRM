package Com.PomCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UploadFilePom {

//	Addbtn
//	firstName
//	email
//	jobVacncy
//	Upload File
	
	
	public static WebElement addBtn(WebDriver driver) {
		 return driver.findElement(By.id("btnAdd"));
	}
	public static WebElement firstName(WebDriver driver) {
		 return driver.findElement(By.id("addCandidate_firstName"));
	}
	public static WebElement lastName(WebDriver driver) {
		 return driver.findElement(By.id("addCandidate_lastName"));
	}
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.id("addCandidate_email"));
	}
	public static Select vacancy(WebDriver driver) {
		Select dropVacncy=new Select(driver.findElement(By.id("addCandidate_vacancy")));
		return dropVacncy;
	}
	public static WebElement choosefile(WebDriver driver) {
		return driver.findElement(By.id("addCandidate_resume"));
		
	}
	public static WebElement saveBtn(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
}
