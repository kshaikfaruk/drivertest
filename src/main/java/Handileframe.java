import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handileframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']/iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='row']/iframe")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Altha@.com");
	}

}


