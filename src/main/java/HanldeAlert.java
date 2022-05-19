import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanldeAlert {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver 
		 
		 driver= new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	   // driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("althaf@.com");
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    Alert a= driver.switchTo().alert();
	   a.sendKeys(" hello");
	   a.accept();
	   

	   
	    
	}
}
