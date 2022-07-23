package Com.PomCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChkBoardsPOM {

	public static WebElement admin(WebDriver driver) {
		return	driver.findElement(By.id("menu_admin_viewAdminModule"));
	}	
	public static WebElement pim(WebDriver driver) {
		return	driver.findElement(By.id("menu_pim_viewPimModule"));
	}
	public static WebElement leave(WebDriver driver) {
		return	driver.findElement(By.id("menu_leave_viewLeaveModule"));
	}
	public static WebElement time(WebDriver driver) {
		return	driver.findElement(By.id("menu_time_viewTimeModule"));
	}
	public static WebElement recuirment(WebDriver driver) {
		return	driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
	}
	public static WebElement myInfo(WebDriver driver) {
		return	driver.findElement(By.id("menu_pim_viewMyDetails"));
	}
	public static WebElement performance(WebDriver driver) {
		return	driver.findElement(By.id("menu__Performance"));
	}
	public static WebElement directory(WebDriver driver) {
		return	driver.findElement(By.id("menu_directory_viewDirectory"));
	}
	public static WebElement maintanence(WebDriver driver) {
		return	driver.findElement(By.id("menu_maintenance_purgeEmployee"));
	}
	public static WebElement buzz(WebDriver driver) {
		return	driver.findElement(By.id("menu_buzz_viewBuzz"));
	}
	
}
