package miscelleanous;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.fetch.model.AuthChallengeResponse.Response;
import org.testng.Assert;

public class BrokenLinkCheck {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> linksList=driver.findElements(By.xpath("//div[@id='gf-BIG']//li/a"));
		
		for(WebElement link : linksList) {
			String url=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responseCode=con.getResponseCode();
		
			if(responseCode>400) {
				System.out.println("the link with text "+link.getText()+"is broken with code "+responseCode);
				Assert.assertTrue(false);
			}
		}
	}

}
