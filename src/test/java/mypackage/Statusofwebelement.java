package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statusofwebelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		username.sendKeys("rahul.khot@net-effect.com");
		pass.sendKeys("Marvel@123");
		System.out.println(username.isDisplayed());
		
		System.out.println(username.isEnabled());
		
		System.out.println(username.isSelected());
		
		driver.findElement(By.id("submit-button")).click();
		
		driver.findElement(By.xpath("//coral-icon[@icon=\"userCircleColor\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//coral-button-label[normalize-space()='My Preferences']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.name("shortcutsEnabled")).isSelected());
		
	}

}
