package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class OpenFilter extends BaseTest {
	@Test
	public void openfilter()
	{
		
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
		waitForElement("openFilter_XPATH");
		click("openFilter_XPATH");
		waitForElement("GeneralFilter_XPATH");
		boolean a = IsElementPresent("GeneralFilter_XPATH");
		SoftAssert softassert= new SoftAssert();
		softassert.assertEquals(a, true);
		softassert.assertAll();
		
		
	}
}
