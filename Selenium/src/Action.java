import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
	public static void main(String[]args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://connect.maveric-systems.com/");
		ConnectLogin.username(driver).sendKeys("varunashok");
		WebDriverWait Wait = new WebDriverWait(driver,20);
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input(@type='text']")));
	}
}
