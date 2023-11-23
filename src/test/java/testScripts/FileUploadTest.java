package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile=driver.findElement(By.cssSelector("input[type='file']"));
		Thread.sleep(4000);
		String strPath=System.getProperty("user.dir")+"//1700661375794.png";
		Thread.sleep(4000);
		addFile.sendKeys(strPath);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
		System.out.println("Completed");

	}

}
