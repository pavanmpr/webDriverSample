package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text : "+alert.getText());
		alert.accept();
		
		//Handling COnfirmation Alert
		driver.findElement(By.cssSelector("[onclick='myConfirmFunction()']")).click();
		Alert confirm=driver.switchTo().alert();
		System.out.println("Confirm Alert :"+ confirm.getText());
		confirm.dismiss();
		
		//Handling Prompt Alert
		driver.findElement(By.cssSelector("[onclick='myPromptFunction()']")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Test");
		System.out.println("Confirm Alert :"+ prompt.getText());
		
		
		
	}

}
