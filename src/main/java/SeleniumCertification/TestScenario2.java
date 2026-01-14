package SeleniumCertification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario2 extends baseFile{
	
	@Test
	public void TestSlider() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();

		WebElement slidersOp = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Drag & Drop Sliders")));
		slidersOp.click();
		
		WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='sp__range'])[3]")));
		WebElement range = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rangeSuccess")));
						
		int number;

		WebElement rangeSucc = driver.findElement(By.id("rangeSuccess"));
		slider.click();
		do {
			number = Integer.parseInt(rangeSucc.getText());
			//System.out.println("number : " + number);

			if (number < 95) {	
				slider.sendKeys(Keys.ARROW_RIGHT);

			} else if (number > 95) {
				slider.sendKeys(Keys.ARROW_LEFT);
			}
			
		} while(number!= 95);
		
		wait.until(ExpectedConditions.textToBe(By.id("rangeSuccess"), "95"));
		String success = driver.findElement(By.id("rangeSuccess")).getText();
		System.out.println(success);
		
		Assert.assertEquals(success, "95");
	}

}
