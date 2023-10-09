package qa.Discover;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpaths_Discovery  {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHOK SHANKAR\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.discover.com/");
	    //login details
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid-content")));
	    driver.findElement(By.id("userid-content")).sendKeys("Ashok");
	    driver.findElement(By.id("password-content")).sendKeys("Shankar");
	    driver.findElement(By.xpath("(//div[@class=\"select-box-wrapper\"])[2]")).click();
	    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-4")));
	    driver.findElement(By.id("ui-id-4")).click();
 
	    //help and Resources list print in console
	    driver.findElement(By.xpath("//li[@class=\"dropdown\"]")).click();
	    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"dropdown-wrapper\"]//li")));
	    List<WebElement> element3 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( By.xpath("//div[@class=\"dropdown-wrapper\"]//li")));
	    int count=0;
	    for(int i=0;i<(element3.size()-1);i++) {
	    	String lists = element3.get(i).getText();
	    	System.out.println(lists);
	    	count++;
	    }
	    System.out.println(count);
	  
	    //Search box
	    driver.findElement(By.xpath("(//li[@class=\"dropdown search-tab\"])[1]")).click();
	    driver.findElement(By.id("predict-submit")).click();
	    
	    driver.navigate().back();
	    
	  //all products list print
	    driver.findElement(By.xpath("//span[@class=\"desktop-menu \"]")).click();
//	    WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[contains(@class,\"left-panel left-panel--right header--variation--reskin show-panel\")]//ul")));
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//ul[@class=\"side-navigation\"]//a"));
	    List<WebElement> list2 = driver.findElements(By.xpath("//nav[contains(@class,\"left-panel left-panel--right header--variation--reskin show-panel\")]//ul"));
	    int num=0; 
	    for(int i=0;i<list2.size();i++) {
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	System.out.println(list2.get(i).getText());
	    	num++;
	    }
	    System.out.println(num);
	    driver.findElement(By.xpath("//span[@class=\"desktop-menu \"]")).click();  //for close
	    
        
        //Help and Resources links open
        driver.findElement(By.xpath("//li[@class=\"dropdown\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> lis = driver.findElements(By.xpath("//div[@class=\"dropdown-wrapper\"]//li//a")); 
        for(int t=0; t<lis.size();t++){
        	System.out.println(lis.get(t).getText());
        	String op = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	lis.get(t).sendKeys(op);
        }  
        System.out.println("All product print And Help Resources link open");
}
}
