package reusableFunction;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cucumber.listener.Reporter;

import baseClass.BaseUtil;
import ru.yandex.qatools.allure.annotations.Step;

public class Abstract extends BaseUtil {

	public static final Logger logg = LoggerFactory.getLogger(Abstract.class);
	public static String folderName;

	public BaseUtil base;

	public Abstract(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@Step("Method to select by text from drop down")
	public void selectTheDropDownList(BaseUtil base, WebElement dropDown, String text) {
		try {
			Select select = new Select(dropDown);
			select.selectByVisibleText(text);
			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Step("Method to wait until condition is satisfied")
	public WebElement waitUntilConditionSatisfy(BaseUtil base, WebElement webElement)
			throws IOException, AWTException, InterruptedException {

		try {
			FluentWait<WebDriver> waitforelement = new FluentWait<WebDriver>(base.driver)
					.withTimeout(90, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			waitforelement.until(ExpectedConditions.elementToBeClickable(webElement));
			base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (NoSuchElementException exc) {
			exc.printStackTrace();

		} catch (WebDriverException e) {
			e.printStackTrace();
			// Method to capture failed Screenshot
			screenshotcapture();

		}
		return webElement;
	}

	public void checkPageIsReady(BaseUtil base) {

		JavascriptExecutor js = (JavascriptExecutor) base.driver;

		// Initially bellow given if condition will check ready state of page.
		if (js.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page Is loaded.");
			return;
		}

		// This loop will rotate for 25 times to check If page Is ready after
		// every 1 second.
		// You can replace your value with 25 If you wants to Increase or
		// decrease wait time.
		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			// To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	public void scrolldown(BaseUtil base) throws InterruptedException {
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) base.driver;
		js.executeScript("javascript:window.scrollBy(300,450)");
		Thread.sleep(1000);
		base.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void screenshotcapture() throws IOException, AWTException {
		folderName = Reporter.getFolder();
		int i = Reporter.takescreenshot();
		Reporter.addScreenCaptureFromPath("./FailedScreenshot" + i + ".jpg", "CNET_Incident");

	}

}
