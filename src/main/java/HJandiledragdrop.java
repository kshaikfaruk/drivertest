import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HJandiledragdrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		 WebElement element =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(element);
        WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();

        
	}

}
