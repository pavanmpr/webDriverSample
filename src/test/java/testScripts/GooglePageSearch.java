package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Images Blocked
		
		
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin");
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();*/
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		a.addArguments("--blink-settings=imagesEnabled=false"); //Method 1 for not to load Images in site
	/*	Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2); */ //Method 2
		
		WebDriver driver=new ChromeDriver(a);
		driver.get("https://demo.opencart.com/");
		Thread.sleep(7000);
		
		
		driver.get("https://www.selenium.dev/");

	}

}
