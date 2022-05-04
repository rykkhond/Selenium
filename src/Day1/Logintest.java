package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//2168382//Desktop/chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	WebElement usernametxt	=driver.findElement(By.id("txtUsername"));
	usernametxt.sendKeys("Admin");
	 WebElement passwordtxt	=driver.findElement(By.id("txtPassword"));
	 passwordtxt.sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	}

}
