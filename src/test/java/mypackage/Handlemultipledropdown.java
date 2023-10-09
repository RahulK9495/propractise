package mypackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultipledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
				
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//li[@class=\"dropdown\"]")).click();
		List<WebElement> Resources=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li/a"));
		System.out.println(Resources.size());
		
		for(WebElement rtype:Resources)
		{
			if(rtype.getAccessibleName().equals("Showcase"))
			{
				rtype.click();
				break;
			}
			
		}
	}

}
