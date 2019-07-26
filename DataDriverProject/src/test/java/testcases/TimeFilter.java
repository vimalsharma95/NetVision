package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class TimeFilter extends BaseTest{
	
	@Test
	public void timeFilter() throws InterruptedException {
		
		type("id_XPATH",OR.getProperty("username"));
		log.info("clicking on ---"+OR.getProperty("id_XPATH"));
		type("pwd_XPATH",OR.getProperty("password"));
		log.info("clicking on ---"+OR.getProperty("pwd_XPATH"));
		click("loginbutton_ID");
		
		log.info("clicking on ---"+OR.getProperty("loginbutton_ID"));
		waitForElement("view_CLASS");
		//Thread.sleep(10000);
		
		click("view_CLASS");
		waitForElement("search_XPATH");
		//Thread.sleep(2000);
		click("search_XPATH");
		log.info("clicked on search");
		
		waitForElement("TimeFilter_XPATH");
		//Thread.sleep(10000);
		
		click("TimeFilter_XPATH");
		//click("FromTime_XPATH");
		
		keyboardvalue("fromcal_XPATH","fromdate");
		//driver.findElement(By.xpath("//*[@id=\"wid-id-2\"]/div/div/div/div[2]/div[1]/p-calendar[1]/span/input")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"05/05/2019 00:00");
		keyboardvalue("tocal_XPATH","todate");
		//driver.findElement(By.xpath("//*[@id=\"wid-id-2\"]/div/div/div/div[2]/div[1]/p-calendar[2]/span/input")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"07/07/2019 00:00");
		click("header_XPATH");
		//driver.findElement(By.xpath("//*[@id=\"wid-id-2\"]/header")).click();
		waitForElement("Done_XPATH");
		//Thread.sleep(2000);
		click("Done_XPATH");
		waitForElement("count_XPATH");
		Thread.sleep(2000);
		String count = text("count_XPATH");
		System.out.println(count);
		String[] splittext = count.split(" ");
		/*int i;
		for(i=0;i<=splittext.length-1;i++)
		{
			System.out.println(splittext[i]);
		}*/
		String sessioncount=splittext[5];
		System.out.println(splittext[5]);
		String validatesession = OR.getProperty("sessioncount");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(sessioncount, validatesession);
		softassert.assertAll();
		
		
	}

}
