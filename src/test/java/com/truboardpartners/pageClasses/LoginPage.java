package com.truboardpartners.pageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.truboard.framework.BaseTest;
import com.truboard.utils.XLUtility;

public class LoginPage {

	XLUtility xlUtil = new XLUtility(
			".//src//main//resources//Test_Data//TestData_TG//TestData_TruGenie.xlsx");

	public By emailTxt = By.xpath("//input[@type='text']");
	public By passwordTxt = By.xpath("//input[@type='password']");
	public By loginButton = By.xpath("//span[text()='Login']");
	public By loginsuccessmsg = By.xpath("//div[text()='Logged in successfully']");
	public By logoutBtcIcon = By.xpath("//span[@class='mantine-1ryt1ht mantine-Button-label']");
	public By logoutBtn = By.xpath("//div[text()='Logout']");
	//public By PmcAndInvlogoutBtn = By.xpath("//span[text()='Log out']");

	public String emailTxt_Name = "Sign-In-email, Phone or Skype text field";
	public String passwordTxt_Name = "Password text field";
	public String loginButton_Name = "Login with customer";
	public String loginsuccessmsg_name = "Login was successful";
	public String logoutBtcIcon_Name = "logoutBtcIconClicking";
	public String logoutBtn_Name = "Logout button";
	//public String PmcAndInvlogoutBtn_Name = "Logout button";

	public void loginCustomer() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Developer credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Customer", 1, "Customer Url"));
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("Customer", 1, "UserName_Customer"));
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("Customer", 1, "Password_Customer"));
		BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);

	}

	public void loginRm() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Lender credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Rm", 1, "Rm Url"));
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("Rm", 1, "UserName_Rm"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("Rm", 1, "Password_Rm"));
		BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);

		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
	}

	public void loginCredit() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Debenture credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Credit", 1, "Credit Url"));
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("Credit", 1, "UserName_Credit"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("Credit", 1, "Password_Credit"));
			BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);
		
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
	}
	public void logiCadMacker() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Developer2 credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("CadMacker", 1, "CadMacker Url"));
		
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("CadMacker", 1, "UserName_CadMacker"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("CadMacker", 1, "Password_CadMacker"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
			BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);
		
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
		}
	
	public void logiCadChecker() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Developer2 credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("CadChecker", 1, "CadChecker_URL"));
		
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("CadChecker", 1, "UserName_CadChecker"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("CadChecker", 1, "Password_CadChecker"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
			BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);
		
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
		}
	
	public void logiFinalRm() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO",
				"<b>Going to login into TURBOPARTNERS application using Developer2 credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("FinalRm", 1, "FinalRm_URL"));
		
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt,
				xlUtil.getCellData("FinalRm", 1, "UserName_FinalRm"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt,
				xlUtil.getCellData("FinalRm", 1, "Password_FinalRm"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
			BaseTest.utilObj.get().getUIUtils().clickElement(loginButton_Name, loginButton);
		
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
		}
	
	
	
	

	public void ClickOnLogOutBtnIcon() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(logoutBtcIcon_Name, logoutBtcIcon);
	}

	public void clickOnlogOut() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(logoutBtn_Name, logoutBtn);
	}

//	public void clickOnPmcAndInvlogOut() {
//		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
//		BaseTest.utilObj.get().getUIUtils().clickElement(PmcAndInvlogoutBtn_Name, PmcAndInvlogoutBtn);
//	}
	
	public void loginSuccessMessage() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(loginsuccessmsg_name, loginsuccessmsg);
		String actualText="Logged in successfully";
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		if(expectedText.equals(actualText)) {
			Assert.assertTrue(true);
			System.out.println("actualText= "+actualText);
			System.out.println("expectedText= "+expectedText);
		}else {
			Assert.fail();
		}
	}
}
