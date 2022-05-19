import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditiontestcase

{
	
	public static String browser="chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) {
	
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")){
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
			driver.get("http://www.google.com");
	
			String title= driver.getTitle();
			System.out.println(driver.getTitle());
			System.out.println(title);
			driver.quit();
		}

	}


