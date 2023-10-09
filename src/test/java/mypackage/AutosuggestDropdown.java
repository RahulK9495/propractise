package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]//div[1]/span"));
		System.out.println(list.size());
		
		for(WebElement litsitem:list)
		{
			if(litsitem.getText().contains(" webdriver download"))
			{
				litsitem.click();
				break;
			}
		}
		
	}

}
