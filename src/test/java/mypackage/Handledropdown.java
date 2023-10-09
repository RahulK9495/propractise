package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		//driver.findElement(By.xpath("//option[@value=\"3\"]")).click();
		
		WebElement drpcountryele =driver.findElement(By.id("input-country"));
		
		Select drpcountry=new Select(drpcountryele);
		
		//drpcountry.selectByVisibleText("Monaco");
		
		//drpcountry.selectByIndex(6);
		
		//drpcountry.selectByValue("19");
		
		List<WebElement> alloptions=drpcountry.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
	}

}
