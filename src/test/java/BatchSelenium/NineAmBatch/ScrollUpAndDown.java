package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-2000)");

		WebElement footerLandMark = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));

		js.executeScript("arguments[0].scrollIntoView(true)", footerLandMark);

		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(true)",
				driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")));

	}

}
