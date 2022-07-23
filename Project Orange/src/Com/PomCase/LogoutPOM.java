package Com.PomCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPOM {

	public static WebElement welcomeBoard(WebDriver driver) {
		 return driver.findElement(By.id("welcome"));
	}
	public static WebElement logout(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'welcome-menu\']"));
	}
	
	
}
