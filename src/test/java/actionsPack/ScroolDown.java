package actionsPack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScroolDown {
	@Test
	public void Test1() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32 (85)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.END).build().perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		//driver.quit();
		

	}

}
