package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\JavidNasibov\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void tearDown() {

		if (driver != null) {
			this.driver.quit();
		}
	}

	protected WebDriver getDriver() {
		return this.driver;

	}

}
