package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerydropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		//selectchoicevalue(driver, "choice 1");
		selectchoicevalue(driver, "all");
		
	}

	private static void selectchoicevalue(WebDriver driver, String... value) 
	{
		List<WebElement> choicelist=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist)
			{
				String item2=item.getText();
				
				for(String finalvalue:value)
				{
					if(item2.equals(finalvalue))
							{
						item.click();
							}
						
				}
			}
	
		}
		else
		{
			for(WebElement item:choicelist)
			{
				item.click();
			}
		}
	}

	
}
