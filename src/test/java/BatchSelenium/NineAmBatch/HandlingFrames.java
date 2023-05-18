package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Selenium is FUN");// textbox

		// driver.switchTo().defaultContent();

		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outerFrame);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Helloooo");

	}

}
