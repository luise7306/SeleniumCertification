package SeleniumCertification;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 extends baseFile{

	@Test
	public void TestFormDemo () {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		

		WebElement demoForm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Simple Form Demo']")));
		demoForm.click();
		
		String valURL = driver.getCurrentUrl();
		
		boolean found = valURL.contains("simple-form-demo");
		assertTrue(found);
		
		String entMessage = "Welcome to LambdaTest";
		
		WebElement msgEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your Message']")));
		msgEle.sendKeys(entMessage);
				
		driver.findElementByXPath("//button[text()='Get Checked Value']").click();

		WebElement eleMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		String valMessage = eleMessage.getText();
		
		Assert.assertEquals(valMessage, entMessage);
		
	}
}
