package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions a=new ChromeOptions();
		a.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom");
		WebElement shadowHost=driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context=shadowHost.getShadowRoot();
		WebElement ShadowContent=context.findElement(By.cssSelector("span#shadow_content"));
		System.out.println("Shadow DOM Content : "+ ShadowContent.getText());
		WebElement aa=context.findElement(By.cssSelector("div#nested_shadow_host"));
		SearchContext inner=aa.getShadowRoot();
		WebElement ab=inner.findElement(By.cssSelector("div#nested_shadow_content"));
		System.out.println("Shadow DOM Content : "+ ab.getText());

	}

}
