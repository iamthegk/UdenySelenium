package base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));// this is Global - applicable to all
																			// lines/step following by.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Gopirkishnan");
		// name locator
		driver.findElement(By.name("inputPassword")).sendKeys("gopi");
		// class name locator
		driver.findElement(By.className("signInBtn")).click();
		// css selector locator
		String errorMessage = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorMessage);

		// link text locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gopi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("gopi@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7418529630");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

	}

}
