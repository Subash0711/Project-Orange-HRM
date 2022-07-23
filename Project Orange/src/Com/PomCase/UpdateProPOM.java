package Com.PomCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UpdateProPOM {

	public static  WebElement myInfo(WebDriver driver) {
		return driver.findElement(By.id("menu_pim_viewMyDetails"));
	}
	
	public static WebElement editAndSaveBtn(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
	
	public static WebElement firstName(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmpFirstName"));
	}
	
	public static WebElement middleName(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmpMiddleName"));
	}
	
	public static WebElement lastName(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmpLastName"));
	}
	
	public static  WebElement empId(WebDriver driver) {
		return driver.findElement(By.id("personal_txtEmployeeId"));
	}
	
	public static  WebElement OtherID(WebDriver driver) {
		return driver.findElement(By.id("personal_txtOtherID"));
	}
	
	public static  WebElement licId(WebDriver driver) {
		return driver.findElement(By.id("personal_txtLicenNo"));
	}
	public static  WebElement gender(WebDriver driver) {
		return driver.findElement(By.id("personal_optGender_1"));
	}
	
	public static  Select martial(WebDriver driver) {
		Select dropMarital =new Select(driver.findElement(By.id("personal_cmbMarital")));
		return dropMarital;
	}
	
	public static WebElement dob(WebDriver driver) {
		return driver.findElement(By.id("personal_DOB"));
	}

	public static Select nationality(WebDriver driver) {
		Select dropNationality= new Select(driver.findElement(By.id("personal_cmbNation")));
		return dropNationality;
	}
	
}
