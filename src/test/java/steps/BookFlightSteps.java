package steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookFlightSteps extends Base {

	@Given("the user enters the index page of despegar.com")
	public void userEnter() throws InterruptedException {
		if (despegarPage.isDisplayed(despegarPage.locatorLogo)) {
			System.out.println("the user is on index page of despegar.com");

		} else {
			System.out.println("the user isn't on index page of despegar.com");
		}
	}

	@When("select medellin as city of origin")
	public void SelectCityOrigin() throws InterruptedException {

		despegarPage.click(despegarPage.selectCityOrigin);
		despegarPage.type("mMedellin", despegarPage.selectCityOrigin);
		despegarPage.enter(despegarPage.selectCityOrigin);
	}

	@When("select Bogota as your destination city")
	public void SelectCityDestination() throws InterruptedException {
		despegarPage.click(despegarPage.selectCityDestination);
		Thread.sleep(1000);
		despegarPage.type("bBogota", despegarPage.selectCityDestination);
		despegarPage.enter(despegarPage.selectCityDestination);
		Thread.sleep(1000);

	}

	@When("select departure and return date")
	public void SelectDates() throws InterruptedException {
		despegarPage.click(despegarPage.departureBox);
		despegarPage.click(despegarPage.departureDate);
		despegarPage.click(despegarPage.returnBox);
		despegarPage.click(despegarPage.returnDate);
		despegarPage.click(despegarPage.btnApply);

	}

	@When("the user clicks the search button")
	public void clickSearchButton() {
		despegarPage.click(despegarPage.btnSearch);
	}

	@When("the user selects the first flight he sees with the select button")
	public void SelectFlight() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(despegarPage.btnSelect));
		despegarPage.click(despegarPage.btnSelect);
		wait.until(ExpectedConditions.presenceOfElementLocated(despegarPage.btnContinue));
		despegarPage.click(despegarPage.btnContinue);
	}

	@Then("we should see the message Falta poco! Completa tus datos y finaliza tu compra")
	public void LocateMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(despegarPage.locatorMessage));
		try {
			if (despegarPage.isDisplayed(despegarPage.locatorMessage)) {
				System.out.println("the message was successfully located.");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("the message is not on the screen");
		}

		despegarPage.asserteq(despegarPage.locatorMessage, despegarPage.message);
		if (driver.findElement(despegarPage.locatorMessage).getText().equals(despegarPage.message)) {
			System.out.println("Test completed successfully");
		} else {
			System.out.println("the test failed");

		}

	
	}

}
