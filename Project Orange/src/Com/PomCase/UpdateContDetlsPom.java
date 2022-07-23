package Com.PomCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UpdateContDetlsPom {

	
	public static WebElement contactDetails(WebDriver driver) {
		 return driver.findElement(By.xpath("//*[@id=\'sidenav\']/li[2]/a"));
	}
	
	public static WebElement editAndSaveBtn(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
	
	public static WebElement adress1(WebDriver driver) {
		return driver.findElement(By.id("contact_street1"));
	}
	
	public static WebElement adress2(WebDriver driver) {
		return driver.findElement(By.id("contact_street2"));
	}
	
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.id("contact_city"));
	}
	
	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.id("contact_province"));
	}
	
	public static WebElement postalCode(WebDriver driver) {
		return driver.findElement(By.id("contact_emp_zipcode"));
	}

	public static Select country(WebDriver driver) {
		driver.findElement(By.id("contact_country")).click();
		Select  dropCont = new Select(driver.findElement(By.id("contact_country")));
		return dropCont;
	}
	
	public static WebElement mobile(WebDriver driver) {
		return driver.findElement(By.id("contact_emp_mobile"));
	}
	
	public static WebElement workEmail(WebDriver driver){
		return driver.findElement(By.id("contact_emp_work_email"));
	}
	
	public static WebElement otherEmail(WebDriver driver){
		return driver.findElement(By.id("contact_emp_oth_email"));
	}
	
	public static WebElement homePhone(WebDriver driver) {
		return driver.findElement(By.id("contact_emp_hm_telephone"));
	}
	
	public static WebElement workPhone(WebDriver driver) {
		return driver.findElement(By.id("contact_emp_work_telephone"));
	}
}
