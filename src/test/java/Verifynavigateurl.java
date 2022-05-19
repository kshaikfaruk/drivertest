import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifynavigateurl {
public static void main(String[] args) throws InterruptedException, IOException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	String url="http://automationpractice.com/index.php";
	 

	
//	   TakesScreenshot ts=(TakesScreenshot)driver;
//		File f= ts.getScreenshotAs(OutputType.FILE);
//		Files.move(f, new File(".\\scrrenshot.png"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.move(f, new File(".\\Shot.png"))
		
		
		;
			
		
	
		
	if(url.equalsIgnoreCase(driver.getCurrentUrl())){
		System.out.println("url is navigate correct url");
	}
	driver.findElement(By.xpath("//a[@title='Women']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//input[@name='layered_category_4']")).click();
	driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_2']")).click();
	driver.findElement(By.xpath("(//a[@title='Tops'])[2]")).click();
	Thread.sleep(3000);
	
}
}