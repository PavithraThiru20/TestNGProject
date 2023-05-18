package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("a[role='button'][data-testid='open-registration-form-button']")).click();

		Thread.sleep(3000);

		WebElement firstDropDown = driver.findElement(By.id("day"));

		Select s = new Select(firstDropDown);
		s.selectByIndex(6);

		Select s1 = new Select(driver.findElement(By.id("month")));
		s1.selectByValue("7");

		Select s2 = new Select(driver.findElement(By.name("birthday_year")));
		s2.selectByVisibleText("2011");

	}

}
