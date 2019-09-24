import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactElements {
	WebDriver driver;
	public PageFactElements(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"LoginForm_username\"]")WebElement username;
	WebElement Username;
	@FindBy(xpath="//*[@id=\"LoginForm_password\"]")WebElement password;
	WebElement Password;

}