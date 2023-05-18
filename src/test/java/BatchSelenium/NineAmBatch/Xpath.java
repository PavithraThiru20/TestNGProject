package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Google Pixel");
		
		WebElement searchIconBtn = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[3]/div/span/input"));
		
		searchIconBtn.click();
		
		driver.findElement(By.xpath("//span[text()='Google Pixel 6a 5G (Charcoal, 6GB RAM, 128GB Storage)']")).click();
	
		//driver.findElement(By.cssSelector("#nav-belt"));
	
	}

}
