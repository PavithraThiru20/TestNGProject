package BatchSelenium.NineAmBatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='callout']")));

		driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();

		driver.switchTo().parentFrame();

		WebElement link = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail (opens a new tab)')]"));

		Actions ac = new Actions(driver);
		ac.contextClick(link).perform();

		Robot r = new Robot();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
