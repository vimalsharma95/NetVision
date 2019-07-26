package testcases;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class Login extends BaseTest{

	@Test
	public void Login() throws InterruptedException  {
		
		//driver.findElement(By.xpath(OR.getProperty("id_XPATH"))).sendKeys(OR.getProperty("username"));
		type("id_XPATH",OR.getProperty("username"));
		log.info("clicking on ---"+OR.getProperty("id_XPATH"));
		type("pwd_XPATH",OR.getProperty("password"));
		log.info("clicking on ---"+OR.getProperty("pwd_XPATH"));
		click("loginbutton_ID");
		
		log.info("clicking on ---"+OR.getProperty("loginbutton_ID"));
		Thread.sleep(5000);
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//Assert.assertTrue(alert.getText().contains("allertmsg"),"account");
		//alert.accept();
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));*/
		String name = text("usernametext_XPATH");
		log.info("user is ----"+name);
		String element=OR.getProperty("username");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(name, element);
		softassert.assertAll(); 
		
		
	}
}
