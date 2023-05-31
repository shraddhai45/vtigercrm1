package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.com/contact.html");
		driver.findElement(By.cssSelector("")).click();
		Thread.sleep(2000);
	}

}
