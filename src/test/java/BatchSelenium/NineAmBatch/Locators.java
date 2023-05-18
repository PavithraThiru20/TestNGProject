package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		WebElement gSearchBox = driver.findElement(By.name("q"));
		// gSearchBox.sendKeys("Oranium Tech, Velachery", Keys.ENTER);

		gSearchBox.sendKeys("Java Selenium");
		driver.findElement(By.className("gNO89b")).click();

		WebElement searchResults = driver.findElement(By.id("result-stats"));
		String results = searchResults.getText();

		System.out.println("results of the search : " + results);

	}

}
