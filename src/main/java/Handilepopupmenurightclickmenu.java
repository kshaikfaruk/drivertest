import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handilepopupmenurightclickmenu {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	driver.manage().window().maximize();
	WebElement img=driver.findElement(By.xpath("//img[@onclick='return dm_popup(1, 2000, event);']"));
	Actions action= new Actions(driver);
	action.contextClick(img).perform();
	 System.out.println("commit");

	}

}
