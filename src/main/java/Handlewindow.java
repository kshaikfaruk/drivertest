import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlewindow {
 public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
    driver.get("https://demo.guru99.com/popup.php");
    String mainwindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		 
		// driver.getwindowhandles() --> set<String>  
		//driver.getwindowhandle() --> string
		//driver.switchto().window(string)
		//driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		  Set<String> s= driver.getWindowHandles();
		 Iterator <String> ss= s.iterator();
		  String child="";
		  while(ss.hasNext()){
			  child=ss.next();
		  }
		   driver.switchTo().window(child);
		   System.out.println(driver.getCurrentUrl());
		   driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("a@a.com");
			 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			 driver.close();
			  driver.switchTo().window(mainwindow);
			 System.out.println( driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).getText());
}
 
}

