package base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
		WebElement staticDropodownCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(staticDropodownCurrency);
		select.selectByIndex(3);// selecting USD from Dropdown
		String selectedCurrencyName=select.getFirstSelectedOption().getText();
		System.out.println(selectedCurrencyName);
		
		driver.close();

	}

}
