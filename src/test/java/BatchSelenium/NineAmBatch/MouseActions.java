package BatchSelenium.NineAmBatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/droppable/");

		WebElement source = driver.findElement(By.id("draggable"));

		Actions a = new Actions(driver);
		// a.clickAndHold(source).moveToElement(driver.findElement(By.id("droppable"))).release().perform();

		a.dragAndDrop(source, driver.findElement(By.id("droppable"))).perform();
		
	
		
		
		

	}

}
