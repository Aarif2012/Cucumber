package org.stepDefinition;

import java.io.IOException;

import org.base.UtilityClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilityClass {

	@Before
	public void bef() {
		System.out.println("bef the scenario");
		browserLaunch();
		maxWindow();

	}

	@Before(order = 1)
	public void befsc1() {

		System.out.println("Bef Scenario 1");

	}

	@Before(order = 3)
	public void befsc3() {
		System.out.println("Bef Scenario 3");

	}

	@Before(order = 2)
	public void Befsc2() {
		System.out.println("Bef Scenario 2");

	}

	@After(order = 3)
	public void Aftsc3() {
		System.out.println("Aft Scenario 3");

	}

	@After(order = 1)
	public void aftsc1() {
		System.out.println("Aft Scenario 1");

	}

	@After(order = 2)
	public void aftsc2() {
		System.out.println("Aft Scenario 2");

	}

	@After
	public void aft(Scenario S) {

		if (S.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			S.embed(screen, "image/png");

		}

		System.out.println("After the scenario");

		toClose();

	}

}
