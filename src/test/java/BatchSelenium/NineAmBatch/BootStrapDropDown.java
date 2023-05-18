package BatchSelenium.NineAmBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();

		List<WebElement> products = driver
				.findElements(By.xpath("//ul[contains(@class,'dropdown1 dropdown-menu')]/li"));

		System.out.println("Number of products available = " + products.size());

		for (WebElement product : products) {

			System.out.println(product.getText());

			if (product.getText().equalsIgnoreCase("cards")) {
				product.click();
				// break;
			}

		}

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();

		List<WebElement> loanProducts = driver
				.findElements(By.xpath("//ul[contains(@class,'dropdown2 dropdown-menu')]/li"));
		System.out.println("Number of loans availble = " + loanProducts.size());

		for (int i = 0; i < loanProducts.size(); i++) {

			System.out.println(loanProducts.get(i).getText());
			if (loanProducts.get(i).getText().equalsIgnoreCase("FASTag")) {
				loanProducts.get(i).click();
			}

		}

	}

}
