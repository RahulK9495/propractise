package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {
	
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Rahul\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");*/
		
		
		/*System.setProperty("webdriver.edge.driver","C:\\Rahul\\chromedriver_win32\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	
}
