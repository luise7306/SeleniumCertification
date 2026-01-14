package SeleniumCertification;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseFile {
	
	public RemoteWebDriver driver;
	@Parameters({"browsername", "testName", "OS"})
	@BeforeTest
	public void setup(String browsername, String testName, String OS) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browsername);
		capabilities.setCapability("browserVersion", "143.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("build", "SeleniumCertificate");
		ltOptions.put("name", testName);
		ltOptions.put("platformName", OS);
		ltOptions.put("resolution", "1024x768");
		ltOptions.put("project", "Test Scenarios");
		ltOptions.put("selenium_version", "3.13.0");
		ltOptions.put("video", true);
		ltOptions.put("console", true);
		ltOptions.put("network", true);
		ltOptions.put("visual", true);
		capabilities.setCapability("LT:Options", ltOptions);
		try {
		driver = new RemoteWebDriver(new URL("https://luisehexaware:LT_Hz7FLTHKd1U1W3fQ30KQe90VicOLH4R8rAc5BBwtHCfzvly@hub.lambdatest.com/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://www.lambdatest.com/selenium-playground");
	}

		@AfterTest
		public void tearDown() {
			if (driver != null) {
				driver.quit();	
			}
		}
}
