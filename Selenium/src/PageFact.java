import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageFact {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PageFactElements pp = new PageFactElements(driver);
		pp.username.sendKeys("varunashok");
		pp.password.sendKeys("varun123");
		Thread.sleep(3000);
		driver.quit();  }
}

