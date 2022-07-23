package Com.PomCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddAdminUserPom {

// 	Add but
//	User Role
//	Employee Name
//	User Name
//	Status
//	Password
//	Confirm PassWord
	
	public static WebElement addBtn(WebDriver driver) {
		return driver.findElement(By.id("btnAdd"));
	}
	public static Select userRole(WebDriver driver) {
		Select dropRole=new Select(driver.findElement(By.id("systemUser_userType")));
		return dropRole;
	}
	public static WebElement employeName(WebDriver driver) {
		return driver.findElement(By.id("systemUser_employeeName_empName"));
	}
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("systemUser_userName"));
	}	
	public static Select status(WebDriver driver) {
		Select dropStatus=new Select( driver.findElement(By.id("systemUser_status")));
		return dropStatus;
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("systemUser_password"));
	}
	public static WebElement cnfPassword(WebDriver driver) {
		return driver.findElement(By.id("systemUser_confirmPassword"));
	}
	public static WebElement saveBtn(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
	
	
	
}
