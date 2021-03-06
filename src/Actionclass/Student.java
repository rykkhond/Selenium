package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Student {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//2168382//Desktop/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scrollBy(0,1500);");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement usernametxt	=driver.findElement(By.id("txtUsername"));
		usernametxt.sendKeys("Admin");
		 WebElement passwordtxt	=driver.findElement(By.id("txtPassword"));
		 passwordtxt.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	 WebElement usermanagement=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	WebElement users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	Actions act=new Actions(driver);
	act.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();
	//Select class
	 WebElement searchSystemUser_userType =driver.findElement(By.id("searchSystemUser_userType"));
	 Select sec=new Select(searchSystemUser_userType);
	 sec.selectByVisibleText("Admin");
	 
	 driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("rahul");
		
	}

}
