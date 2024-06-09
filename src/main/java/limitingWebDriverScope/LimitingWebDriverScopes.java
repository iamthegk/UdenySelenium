package limitingWebDriverScope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebDriverScopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// count of links on the whole page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Apt way - by creating section driver for particular
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // mini driver
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// get count of links from first coloumn on the footer - creating mini driver
		WebElement firstColoumnLinks = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstColoumnLinks.findElements(By.tagName("a")).size());

	}

}
