package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.2");
		driver.navigate().to("https://auth-usintelligence-qa.pwc.com/libs/granite/core/content/login.html");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();

	}

}
