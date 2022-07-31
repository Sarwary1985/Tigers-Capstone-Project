package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import core.Base;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;

public class Initializer extends Base {

	//In Initializer class we will write or define our beforeHooks and afterHooks method and they are
	//both coming from io.cucumber
	
	//@Before = when we add the @Before hooks on top of our beforeHooks method, this method will
	//run before every scenario
	//cucumber Before and After hooks
	@Before
	public void beforeHooks(Scenario scenario) {
		//we used the logger to log when the scenario started
		logger.info("Scenario " + scenario.getName() + " started");
		//the method are coming from base class
		//browser() will get the browser
		browser();
		//openBrowser() will launch the url for us and launch the browser
		openBrowser();
		Utils.verify = scenario;
	}
	
	//@After = When we add the @After annotation on top of our afterHooks method, this method will
	//run after every scenario
	//In this method, we can also write the code to add a screenshot of our failed test step, if it fails
	@After
	public void afterHooks(Scenario scenario) {
		//we can also write code to capture screenshot if our test fails
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}else {
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}
	}

	
}
