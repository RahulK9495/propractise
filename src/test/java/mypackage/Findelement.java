package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		username.sendKeys("rahul.khot@net-effect.com");
		pass.sendKeys("Marvel@123");

		driver.findElement(By.id("submit-button")).click();
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//div[@class=\"foundation-collection-navigator globalnav-homecard\"]"));
		
		System.out.println(element1.getText());
		
		List<WebElement> ele2=driver.findElements(By.xpath("//div[@class=\"foundation-collection-navigator globalnav-homecard\"]"));
		
		for(WebElement ele1:ele2 )
		{
			System.out.println(ele1.getText());
		}
		
	}

}
