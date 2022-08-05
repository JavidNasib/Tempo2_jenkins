package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_001 extends Base{
	
	@Test
	public void search()
	{
		
		String expectedTitle = "cars - Google Search";
		
		this.getDriver().get("https://www.google.com/");
		this.getDriver().findElement(By.cssSelector("input[title='Search']")).sendKeys("cars"+Keys.ENTER);
		String actualTitle = this.getDriver().getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle,"not match");
		
		this.getDriver().quit();
	}

}
