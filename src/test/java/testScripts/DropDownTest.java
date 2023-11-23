package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Iphone");
		Thread.sleep(7000);
	List<WebElement>	all=driver.findElements(By.cssSelector("[class='YGcVZO _2VHNef']"));
	System.out.println(all.size());
	for(WebElement all1:all) {
		System.out.println(all1.getText());
	}
		
		
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select a=new Select(driver.findElement(By.id("select-demo")));
		a.selectByValue("Monday");
		
		Select b=new Select(driver.findElement(By.id("multi-select")));
		if(b.isMultiple()) {
			b.selectByIndex(7);
			b.selectByValue("Florida");
			b.selectByVisibleText("Texas");
		}
		
		List<WebElement> items=b.getAllSelectedOptions();
		System.out.println("Items Selected :"+items.size());
		b.deselectByValue("Texas");
		
		Thread.sleep(8000);
		driver.close();

	}

}
