package traderMoni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class adminLogin {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\TEST AUTOMATION TOOLS\\Selenium\\Chrome\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void loginButton() throws InterruptedException {
		driver.get("https://testtradermoni.riby.ng/");
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div/div/div/a[1]/button")).click();
		driver.findElement(By.id("username")).sendKeys("seyifakoya@mailnator.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("submitBtn")).click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Organizations"));
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//*[@id=\"user-base\"]/div/div[1]/ui-view[1]/div[2]/div[2]/navigation/ul/li[3]/a/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"DataTables_Table_2\"]/tbody/tr[4]/td[1]/team-option/div/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"DataTables_Table_2\"]/tbody/tr[4]/td[1]/team-option/div/ul/li[1]/a")).click();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@id=\"user-base\"]/div/div[1]/ui-view[1]/div[2]/div[2]/navigation/ul/li[4]/a/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"user-base\"]/div/div[1]/ui-view[1]/div[2]/div[2]/navigation/ul/li[4]/ul/li[1]/a/span")).click();
		//driver.quit();
	}	
}
