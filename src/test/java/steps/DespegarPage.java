package steps;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class DespegarPage {
	 
	WebDriver driver = Hooks.getDriver();
	String message= "¡Falta poco! Completa tus datos y finaliza tu compra";
	By locatorLogo = By.className("header-logo-container");
	By selectCityOrigin  = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
	By selectCityDestination = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
	By departureBox = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input");
	By returnBox = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input");
	By departureDate = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[29]");
	By returnDate = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[31]");
	By btnApply = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[2]/div[1]/button");
	By btnSearch = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");
	By btnSelect = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button");
	By btnContinue = By.xpath("//*[@id=\"upselling-popup-position\"]/upselling-popup/div/div[3]/div/div/button");
	By locatorMessage = By.xpath("//*[@id=\"checkout-content\"]/div[1]/h2");
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);

	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText );
	}
	
	public  void enter(By locator) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;

		}

	}

	public void click(WebElement element) {
		element.click();
	}

	public void visit(String url) {
		driver.get(url);

	}
	
	
	public void asserteq(By locator, String Message) {
		
	 assertEquals(driver.findElement(locator).getText(), Message);
		
		
	}

	
	
	
	

}
