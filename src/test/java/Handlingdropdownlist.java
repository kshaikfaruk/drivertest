import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingdropdownlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.wikipedia.org");
        driver.manage().window().maximize();
        //xpath
  //  List<WebElement> dropdown=driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
//                dropdown.get(10).click();
        // select class
        
//       WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
//      Select select=new Select(dropdown);  
//         select.selectByValue("hi");
//       select.selectByVisibleText("Dansk");
//      select.selectByIndex(10);
    
 //   List<WebElement> list=select.getAllSelectedOptions();
 //    System.out.println(dropdown.size());
 //     for(int i=0;i<dropdown.size();i++){
 //   	 System.out.println(dropdown.get(i).getAttribute("lang"));
    List<WebElement> links=driver.findElements(By.tagName("a"));
     System.out.println(links.size());
     for(WebElement e:links){
    	  System.out.println(e.getAttribute("href"));
    	  
      }
      
      }
      
   }
	   
   
   
     
  
        
       
        	          
	


