package mypackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yopmail {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://yopmail.com/en/wm");
        driver.findElement(By.id("login")).sendKeys("treleixeudouje-1811@yopmail.com");
        driver.findElement(By.xpath("//button[@class='md']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.linkText("Activate your account")).click();
        //System.out.println(driver.getWindowHandles());
        //Set<String>handles= driver.getWindowHandles();
       // driver.findElement(By.xpath("(//i[@class=\"material-icons-outlined f18 bhabs\"])[1]")).click();
        
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        driver.switchTo().frame("ifmail");
        driver.findElement(By.linkText("Activate your account")).click();
        
		
		
	}

}
