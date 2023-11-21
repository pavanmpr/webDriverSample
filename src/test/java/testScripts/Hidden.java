package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		WebElement a=driver.findElement(By.xpath("//a[@title='Clear text']"));
		System.out.println(a.isDisplayed());
		if(a.isDisplayed()) {
			a.click();
		}
	}

}
