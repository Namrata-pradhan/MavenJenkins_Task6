package Maven_jenkins.WDGET2024045_MavenJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AppTest {
	WebDriver driver;
	@Test(enabled=false)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement p=(WebElement) driver.findElements(By.name("q"));
		p.sendKeys("VIT");
		p.submit();
		
	}
	
	@Test
	public void  validateLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement u=driver.findElement(By.name("user-name"));
		u.sendKeys("standard_user");
		WebElement p=driver.findElement(By.name("password"));
		p.sendKeys("secret_sauce");
		WebElement l=driver.findElement(By.name("login-button"));
		l.click();
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual url="+actualURL);
		Assert.assertEquals(expectedURL,actualURL);
		
		
	}
}
