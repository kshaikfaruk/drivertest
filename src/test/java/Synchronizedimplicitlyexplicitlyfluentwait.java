import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronizedimplicitlyexplicitlyfluentwait {



	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
element.sendKeys("ys jaganmohanreddy");
WebDriver driver1= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);

	WebDriverWait wait= new WebDriverWait(driver1,8);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='q']"))).sendKeys("ys jaganmohanreddy");
	  Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver1).withTimeout(20, TimeUnit.MICROSECONDS).ignoring(NoSuchElementException.class).withMessage("userdefinedTimeout30secnds").pollingEvery(30, TimeUnit.MILLISECONDS);
	  
			  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='q']"))).sendKeys("ys jaganmohanreddy");
	}

}
