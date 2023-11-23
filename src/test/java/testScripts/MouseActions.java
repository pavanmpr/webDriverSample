package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		/*driver.get("https://stqatools.com/demo/DoubleClick.php");
		WebElement db=driver.findElement(By.cssSelector("[class='col-lg-6']>p>button"));
		System.out.println(db.getText());
		action.doubleClick(db).perform();
		Thread.sleep(8000);
		action.doubleClick(db).doubleClick(db).build().perform();
		Thread.sleep(5000);*/
		driver.get("https://demo.opencart.com/");
		WebElement comp=driver.findElement(By.cssSelector("[class='nav navbar-nav']>li:nth-child(3)"));
		action.moveToElement(comp).perform();
		WebElement mon=driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
		//WebElement mon1=driver.findElement(By.xpath("//a[contains(text(),'Printers')]"));
		action.click(mon).perform();
		Thread.sleep(5000);
		//COmbine more than one action also
		//action.moveToElement(comp).click(mon1).build().perform();  //20 and 22 Line Mixed Actions at one Line
		//Thread.sleep(7000);
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src, new File(path));
		Thread.sleep(5000);
		WebElement image=driver.findElement(By.cssSelector("div[class='product-thumb']"));
		action.scrollToElement(image).perform();
		File src1=image.getScreenshotAs(OutputType.FILE);
		String path1= System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src1, new File(path1));
		/*WebElement srcBox=driver.findElement(By.name("search"));
		action.contextClick(srcBox).perform();  //Right CLick  */
		//driver.close();
		System.out.println("Completed");
	}

}
