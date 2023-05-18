package BatchSelenium.NineAmBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstDay {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();

		// ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver = new EdgeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		//driver.manage().window().minimize();

		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		driver.get("https://www.goibibo.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.navigate().to("https://www.zomato.com/chennai");

		String title = driver.getTitle();

		// Datatype variableName = data;

		System.out.println(title);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		String pageSource = driver.getPageSource();

		System.out.println(pageSource);

		driver.close();

	}

}
