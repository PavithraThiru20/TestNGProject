package BatchSelenium.NineAmBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableContents = driver.findElements(By.xpath("//table[@id = 'customers']//tr"));

		for (WebElement tc : tableContents) {
			System.out.println(tc.getText());
		}
		
		
		List<WebElement> tHeadings = driver.findElements(By.xpath("//table[@id='customers']//th"));
	     for(WebElement th:tHeadings)
	     {
	    	 System.out.println("Table Headings -- " + th.getText());
	     }
	     
	     List<WebElement> tRows = driver.findElements(By.xpath("//table[@id='customers']//tr/td[text()='Ernst Handel']/parent::tr/td"));
	     for(WebElement tr:tRows)
	     {
	    	 System.out.println(tr.getText());
	     }
	     
	     String tData = driver.findElement(By.xpath("//table[@id='customers']//td[text()='UK']")).getText();
	     System.out.println(tData);
	}

}
