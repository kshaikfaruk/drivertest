import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontestcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com");
		driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//a[@aria-label='Computers & Accessories']"));
element.click();
WebElement element1= driver.findElement(By.xpath("//span[contains(text(),'Seagate Portable 2TB External Hard Drive Portable')]"));
 element1.click();
List<WebElement> links=driver.findElements(By.tagName("a"));

System.out.println(links.size());
for(WebElement e:links){
	System.out.println(e.getAttribute("href"));
}

	}

}


