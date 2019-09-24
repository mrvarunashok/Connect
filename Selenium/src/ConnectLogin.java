import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectLogin {

	public static WebElement username(WebDriver Driver) {
		Driver.get("https://connect.maveric-systems.com");
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = Driver.findElement(By.id("LoginForm_username"));
		return ele;
	}
}
