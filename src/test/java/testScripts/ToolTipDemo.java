package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		Actions action=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement mo=driver.findElement(By.id("age"));
		//action.scrollToElement(mo).perform();
		//action.scrollByAmount(200, 10).perform();
		mo.sendKeys(Keys.PAGE_DOWN);
		action.moveToElement(mo).perform();
		String tool=driver.findElement(By.cssSelector(".ui-tooltip-content")).getText();
		System.out.println(tool);
		mo.sendKeys("20");    //https://jqueryui.com/autocomplete/ Next
		
		
	}

}
