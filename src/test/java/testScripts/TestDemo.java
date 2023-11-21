package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.lambdatest.com/");  
		//div.header__menu__items>div:nth-child(4)
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector("[type='search']")).sendKeys("Java Tutorial");
		List<WebElement> a= driver.findElements(By.cssSelector("[class='sbct']>div>div:nth-child(2)"));
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i).getText());
			if(a.get(i).getText().equalsIgnoreCase("Java Tutorial pdf")) {
				a.get(i).click();
				break;
			}
		}
		
	}

}
