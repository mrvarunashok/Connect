package ConnectTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NodeHub {
WebDriver driver;
String value="http://localhost:4444/wd/hub";
@BeforeTest
public void beforeTest()throws MalformedURLException
{
	DesiredCapabilities ds=DesiredCapabilities.chrome();
	ds.setPlatform(Platform.ANY);
	driver=new RemoteWebDriver(new URL(value),ds);
	driver.manage().window().maximize();
	driver.get("https://connect.maveric-systems.com/");
}

@AfterTest
public void afterTest()
{
	driver.close();
}

@Test
 
 @Parameters({"sUsername", "sPassword"}) public void loginConn(String
 sUsername, String sPassword) throws InterruptedException {
 
 
 driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
 driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
 Thread.sleep(2000); driver.findElement(By.name("yt0")).click(); }


}
