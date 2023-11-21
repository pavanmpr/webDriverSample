package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePageSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin");
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		

	}

}
