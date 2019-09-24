import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Chrome {
	public static void main(String[]args) throws InterruptedException, IOException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.toolsqa.com/iframe-practice-page");
		//Select Sh=new Select	(driver.findElement(By.id("continents")));
		//Sh.selectByVisibleText("Australia");
		//Thread.sleep(5000);
		//Sh.selectByIndex(3);
		//Sh.deselectByIndex(3);
		//List<WebElement> input=driver.findElements(By.tagName("input"));

		//System.out.println(input.size());

		//WebElement username=driver.findElement(By.id("LoginForm_username"));
		//WebElement in = driver.findElement(By.id("LoginForm_rememberMe"));
		//System.out.println(in.isSelected());		
		//driver.findElement(By.id("LoginForm_username")).sendKeys("varunashok");
		//driver.findElement(By.id("LoginForm_password")).sendKeys("varun123");
		//driver.findElement(By.name("yt0")).click();
		//driver.findElement(By.xpath("//input[@type='text']"));

		//String inp = driver.findElement(By.xpath("//*[contains(text(),'credentials')]")).getText();
		//System.out.println(inp);

		//driver.findElement(By.tagName("input")).sendKeys("varunashok");
		//WebDriver Driver;
		//driver.manage().window().maximize();

		//WebElement Alert2=driver.findElement(By.id("cookie_action_close_header"));
		//Alert2.click();
		//Thread.sleep(5000);
		//WebElement Alert1=driver.findElement(By.xpath("//button[@onclick=\"if(!window.cfRLUnblockHandlers) return false; pushAlert()\"]"));
		//Alert1.click();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();

		//WebElement Alert2=driver.findElement(By.id("cookie_action_close_header"));
		//driver.manage().window().maximize();
		//Alert2.click();
		//Thread.sleep(1000);
		//driver.switchTo().frame("iframe1");
		//driver.findElement(By.linkText("Software Testing Tutorial")).click();
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/]")).click();

		//String MainWindow=driver.getWindowHandle();
		//Set<String>s1=driver.getWindowHandles();
		//Iterator<String> i1=s1.iterator();
		//while(i1.hasNext())
		{
			//String ChildWindow=i1.next();
			//if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				//driver.switchTo().window(ChildWindow);
			}
			//String str="Burj Khalifa";
			//WebElement ele= driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]"));
			//System.out.println(ele.getText());
			//TakesScreenshot scrShot=((TakesScreenshot)driver);
			//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			// File DestFile = new File("C:\\Users\\hp\\Desktop\\Varun Ashok.PNG");
			// Files.copy(SrcFile,DestFile);

			//Actions actions = new Actions(driver); 
			//WebElement ele=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
			//actions.moveToElement(ele);
			//WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[11]/a"));
			//actions.moveToElement(subMenu); 
			//actions.click().build().perform();
			//Thread.sleep(1000);	

			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//WebElement Element=driver.findElement(By.xpath("//a[@href='https://sites.google.com/a/chromium.org/chromedriver/downloads']"));
			//js.executeScript("arguments[0].scrollIntoView();",Element);

			//WebElement Element=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input"));
			//String toolTipText=Element.getAttribute("Value");
			//System.out.println(toolTipText);

			//WebElement element=driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[2]/ol/li[1]/a"));
			//String toolTipText=element.getAttribute("Property");
			//System.out.println(toolTipText);
		
			
			
					
		}
	}
}
