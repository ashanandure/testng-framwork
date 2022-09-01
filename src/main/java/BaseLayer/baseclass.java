package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class baseclass { 

	public static WebDriver driver;
	public static Properties prop;

	public baseclass() {
		prop = new Properties();
		
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\Dell\\eclipse-workspace\\TestNGHybridframework\\src\\main\\java\\Configlayer\\configue.properties ");
			prop.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}				 	

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("Implicitwait"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadtimeoutOoooo"))));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("prop.getProperty");

	}

	
	

}
