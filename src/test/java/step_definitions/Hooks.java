package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
//		ChromeOptions option=new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		browser=new ChromeDriver(option);
//		
		ChromeOptions options = new ChromeOptions();
		 options.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		browser = new ChromeDriver(options);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	}
	@After
	public void tearDown() {
		//browser.close();
	}

}
