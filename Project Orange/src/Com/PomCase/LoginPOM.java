package Com.PomCase;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {
	
//	UserName
//	Password
//	Login
	
	public static WebElement userName(WebDriver driver) {	
		return driver.findElement(By.id("txtUsername"));
	}
	public static WebElement passWord(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));
	}
	public static void quit(WebDriver driver) {
		  driver.quit();
	}
  
}
