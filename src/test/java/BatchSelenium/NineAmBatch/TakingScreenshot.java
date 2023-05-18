package BatchSelenium.NineAmBatch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");

		// driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();

		String title = driver.getTitle();

		TakesScreenshot tks = (TakesScreenshot) driver;
		File tempFile = tks.getScreenshotAs(OutputType.FILE);

		File permFile = new File("C:\\Users\\THIS PC\\eclipse-workspace\\NineAmBatch\\Screenshots\\" + title + ".png");
		FileUtils.copyFile(tempFile, permFile);
	}

}
