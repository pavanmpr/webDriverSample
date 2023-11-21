package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAndOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement a=driver.findElement(By.id("isAgeSelected"));
		if(!a.isSelected()) {
			a.click();
		}
		driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
		
	}

}
