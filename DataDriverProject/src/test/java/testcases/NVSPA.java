package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class NVSPA extends BaseTest{
 
 @Test
 public void nvspa() throws InterruptedException {
	 
	    type("id_XPATH",OR.getProperty("username"));
		log.info("clicking on ---"+OR.getProperty("id_XPATH"));
		type("pwd_XPATH",OR.getProperty("password"));
		log.info("clicking on ---"+OR.getProperty("pwd_XPATH"));
		click("loginbutton_ID");
		
		log.info("clicking on ---"+OR.getProperty("loginbutton_ID"));
		Thread.sleep(10000);
		
		String name = text("usernametext_XPATH");
		log.info("user is ----"+name);
		//String element=OR.getProperty("username");
		SoftAssert softassert = new SoftAssert();
		/*softassert.assertEquals(name, element);
		softassert.assertAll();*/
		
		click("view_CLASS");
		Thread.sleep(2000);
		click("search_XPATH");
		log.info("clicked on search");
		Thread.sleep(10000);
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	*/
		
		String table = text("session_CLASS");
		String window = OR.getProperty("window");
		//SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(table, window);
		softassert.assertAll();
		
 } 

}
