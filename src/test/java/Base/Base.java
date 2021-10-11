package Base;

import org.openqa.selenium.chrome.ChromeDriver;

import steps.DespegarPage;
import steps.Hooks;

public class Base {
	protected ChromeDriver driver = Hooks.getDriver();
	protected DespegarPage despegarPage = new DespegarPage();

}
