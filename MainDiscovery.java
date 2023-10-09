package qa.Discover;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class MainDiscovery extends WebDiscovery {

	static WebDriver  driver;
	public static void main(String[] args) throws IOException {
		
		driver = web();
		
		LoginsDiscovery login = new LoginsDiscovery(driver);
		login.loginData();				
	}
}