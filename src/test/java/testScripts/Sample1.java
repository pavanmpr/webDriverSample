package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://automationbookstore.dev/");
		String a=driver.findElement(with(By.tagName("li"))
				.toLeftOf(By.id("pid6"))
				.below(By.id("pid1"))).getAttribute("id");
		System.out.println(a);
				
		

	}

}
