package qa.Discover;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDiscovery {
	public static Properties prop;
	public static WebDriver driver= null;
	public static WebDriver web() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ASHOK SHANKAR\\eclipse-workspace\\POM-Project\\src\\main\\java\\qa\\Discover\\Discovery.properties");
		prop.load(file);
		System.out.println(prop.getProperty("Browser")); 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHOK SHANKAR\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get(prop.getProperty("URL"));
		return driver;
	    
		
	}
}