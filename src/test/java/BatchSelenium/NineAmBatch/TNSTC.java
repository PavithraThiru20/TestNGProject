package BatchSelenium.NineAmBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TNSTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.tnstc.in/home.html");

		WebElement destinations = driver.findElement(By.xpath(
				"//table[@width='100%' and @border='0']/parent::td[@background='images/td_bg.jpg']/table/tbody"));

		System.out.println(destinations.getText());
	}

}
