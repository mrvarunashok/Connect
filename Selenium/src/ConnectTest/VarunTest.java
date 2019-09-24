package ConnectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VarunTest {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
		
        driver.get("https://connect.maveric-systems.com/index.php/site/login");
	}
	
	
	//Test
	//Test
	
	
	@Test
	 
	 @Parameters({"sUsername", "sPassword"}) 
	public void loginConn(String sUsername, String sPassword) throws InterruptedException {
	 
	 
	 driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
	 driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
	 Thread.sleep(2000); driver.findElement(By.name("yt0")).click(); }
	 


	
	
	/*
	 * @Test(priority=2) public void openBrowser1() {
	 * driver.get("https://connect.maveric-systems.com/");
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test(priority=2)
	 * 
	 * @Parameters({"sUsername", "sPassword"}) public void loginConn(String
	 * sUsername, String sPassword) throws InterruptedException {
	 * 
	 * 
	 * driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
	 * driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
	 * Thread.sleep(2000); driver.findElement(By.name("yt0")).click(); }
	 */
	@AfterTest
	public void terminateBrowser() {
	driver.quit();


	}
	}

