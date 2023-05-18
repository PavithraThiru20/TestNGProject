package BatchSelenium.NineAmBatch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Windows.html");

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[text()='    click   ']")).click();

		Set<String> windows = driver.getWindowHandles();

		for (String newWindow : windows) {
			if (parentWindow != newWindow) {
				driver.switchTo().window(newWindow);
			}
		}

		driver.findElement(By.cssSelector("a[href='/downloads']")).click();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

		// driver.close();

		driver.quit();

	}

}
