
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserMgtManager {
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\TEST AUTOMATION TOOLS\\Selenium\\Chrome\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test5() throws Exception {
		driver.get("https://testtradermoni.riby.ng");
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div/div/div/a[1]/button")).click();
		driver.findElement(By.id("username")).sendKeys("seyifakoya@mailnator.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("submitBtn")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Teams'])[2]/following::span[1]"))
				.click();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Admins'])[2]/following::span[1]"))
				.click();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created'])[1]/following::button[1]"))
				.click();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Deactivate")).click();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]"))
				.click();
		// Thread.sleep(30);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
