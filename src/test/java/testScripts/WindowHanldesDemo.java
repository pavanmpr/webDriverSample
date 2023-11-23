package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHanldesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin=driver.getWindowHandle();
		System.out.println("Parent Window : "+ parentWin);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Set<String> all=driver.getWindowHandles();
		System.out.println("No of Window : "+ all);
		for(String child:all) {
			System.out.println("Windows"+child);
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				System.out.println("Child Window"+child +"----"+driver.getTitle());
				driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
			}
			
		}
		driver.close();
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);  //Opens New Window
		driver.get("https://demo.opencart.com/");
		//Thread.sleep(5000);
		//String parentWin1=driver.getWindowHandle();
		//System.out.println("Parent Window : "+ parentWin1);
	}

}
