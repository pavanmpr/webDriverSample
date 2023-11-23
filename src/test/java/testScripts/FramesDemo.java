package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.findElement(By.cssSelector("[class='card mb-3']>label")).getText());
		driver.switchTo().frame("frame1");   //From Main Page to Frame1
		WebElement data=driver.findElement(By.cssSelector("[type='text']"));
		data.sendKeys("Testing");
		
		
		driver.switchTo().frame("frame3");  //from frame1 to frame3
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();   //From frame3 to frame1
		data.sendKeys("Welcome Back");
		
		driver.switchTo().defaultContent(); //move to parent HTML
		
		driver.switchTo().frame("frame2");
		Select dd=new Select(driver.findElement(By.id("animals")));
		dd.selectByIndex(3);
		dd.selectByVisibleText("Avatar");
		
	}

}
