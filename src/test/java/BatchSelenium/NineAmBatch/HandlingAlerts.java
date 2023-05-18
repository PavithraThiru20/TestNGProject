package BatchSelenium.NineAmBatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();

		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();

		Thread.sleep(2000);

		alert.dismiss();

		driver.findElement(By.cssSelector("a[href='#Textbox']")).click();

		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();

		String promptText = alert.getText();

		System.out.println("Msg : " + promptText);

		alert.sendKeys("Oranium Tech");

		Thread.sleep(2000);

		alert.accept();

	}

}
