package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static int numberOfCase = 0;
	protected static ChromeDriver driver;
	
	@Before
	 public void SetUp() {
		numberOfCase ++;
		System.out.println("scenario number is running "+numberOfCase );
		 System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chrome1\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.despegar.com.co/");
			driver.manage().window().maximize();
	 }
	
	
	@After
	public void TearDown() throws InterruptedException {
		System.out.println("scenario number "+numberOfCase + " ran successfully");
		Thread.sleep(5000);
		driver.close();
	}
	
	
	public static ChromeDriver getDriver() {
		
			return driver;
	}
}
