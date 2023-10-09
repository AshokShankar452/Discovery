package qa.Discover;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginsDiscovery extends WebDiscovery{
	WebDriver driver;
    public static Properties prop;
	public LoginsDiscovery (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="//input[@id=\"userid-content\"]")
	WebElement userid;

	@FindBy(id="password-content")
	WebElement pwd;

	public void loginData() {
		//userid.sendKeys("000");
		System.out.println(prop.getProperty("Name"));
		userid.sendKeys(prop.getProperty("Name"));
		pwd.sendKeys(prop.getProperty("pwd"));
		
	}
}