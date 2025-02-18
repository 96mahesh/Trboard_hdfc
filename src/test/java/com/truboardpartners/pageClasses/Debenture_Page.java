package com.truboardpartners.pageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.truboard.framework.BaseTest;
import com.truboard.setup.TestConfig;
import com.truboard.utils.CommonUtils;
import com.truboard.utils.XLUtility;

import junit.framework.Assert;

public class Debenture_Page {
	XLUtility xlUtil = new XLUtility("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\truboard.1\\truboard\\src\\main\\resources\\Test_Data\\TestData_TG\\TestData_TruGenie.xlsx");
	
	public By SearchField = By.xpath("//select[@name='wm-datatable']");
	public String SearchField_Name = "Search Bar Field";
	public By Search1 = By.xpath("//input[@class='form-control app-textbox']");
	public String Search1_Name="Sarch";
	public By ViewRequest = By.xpath("//button[@title='View Request']");
	public String ViewRequest_Name="ViewRequest";
	public By NocRequest = By.xpath("//span[text()='Noc Request']");
	public String NocRequest_Name="NocRequest";
	
	public By logo_DT = By.xpath("//img[@name='AppLogo']");
	public String logo_DTName = "logo_DT";
	public boolean checkLogoPresent_DT() {
		return BaseTest.utilObj.get().getUIUtils().isDisplayed(logo_DT);
	}
	
	public void clickOnSearchFieldEnterValue() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SearchField_Name,SearchField);
		BaseTest.utilObj.get().getUIUtils().selectValue(SearchField_Name,SearchField,"Text", TestConfig.getInstance().getSelectField_DebentureHomePage());
	}
	public void clickOnSearchAndSendData() throws AWTException, IOException {
		BaseTest.utilObj.get().getUIUtils().clickElement(Search1_Name,Search1);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(Search1_Name,Search1,xlUtil.getCellData("Sheet1", 1, "Project Name"), Keys.ENTER);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}
	public void clickOnViewRequest() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ViewRequest_Name,ViewRequest);
	}
	public void clickOnNocRequest() {
		BaseTest.utilObj.get().getUIUtils().clickElement(NocRequest_Name,NocRequest);
	}
	
	public By SelectFieldPendingTable=By.xpath("(//select[@name='wm-datatable'])[1]");
	public String SelectFieldPendingTable_Name="SelectFieldPendingTable";
	public void selectValueFromeSelectFieldPendingTable() {
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldPendingTable_Name, SelectFieldPendingTable, "Text", "Unit");
	}
	public By SearchPendingTable=By.xpath("(//input[@placeholder='Search'])[1]");
	public String SearchPendingTable_Name="SearchPendingTable";
	public void enterValueInSearchPendingTable() throws IOException {
		String no=xlUtil.getCellData("Sheet1", 1, "Unit Number_RaiseNoc");
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, no, Keys.ENTER);
	}
	
	public void enterValueInSearchPendingTable_Cancel() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, xlUtil.getCellData("Sheet1", 1, "Unit Number_CancelNoc"), Keys.ENTER);
	}
//	public void enterValueInSearchPendingTableForCancel() throws IOException {
//		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, xlUtil.getCellData("Sheet1", 1, "Unit Number_CancelNoc"), Keys.ENTER);
//	}
	public By UnitNosPendingTable=By.xpath("(//table[@class='table table-hover table-condensed'])[1]/tbody/tr/td[1]");
	public String UnitNosPendingTable_Name="UnitNos";
	public void verificationOnPendingTable() throws IOException {
		String no=xlUtil.getCellData("Sheet1", 1, 0);
		List<WebElement> elements=	BaseTest.utilObj.get().getUIUtils().findElements(UnitNosPendingTable_Name, UnitNosPendingTable, TestConfig.getInstance().getOBJWAITTIME());
		for(WebElement element : elements) {
			String text=element.getText();
			if(text.equals(no)) {
				System.out.println("text="+text);
				System.out.println("no="+no);
				System.out.println("we got unit no in pending table");
				Assert.assertEquals(text, no);;
			}
		}
	}
	
	public By ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests=By.xpath("((//table[@class='table table-hover'])[1]//tbody/tr)[1]/td[8]/span");
	public String ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests_Name="ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests";
	public void clickOnApproveAndAuthorizeOrCancelNocBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests_Name, ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests);
	}
	//(//button[@hint='Authorize'])[1]
	public By Authorize=By.xpath("//button[@title='Approve and Authorize NoC']");
	public String Authorize_Name="Authorize";
	public void ClickOnAuthorize() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(Authorize_Name, Authorize);
	}
	
	public By CancleAuthorize=By.xpath("//button[@title='Cancel NOC']");
	public String CancelAuthorize_Name="Authorize";
	public void ClickOnCancelAuthorize() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(CancelAuthorize_Name, CancleAuthorize);
	}
	public By FinalDecisionTable=By.xpath("//select[@name='descisionselect']");
	public String FinalDecisionTable_Name="FinalDecisionTable";
	public void selectValueFromFinalDecisionTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTable_Name, FinalDecisionTable, "Text", xlUtil.getCellData("Sheet1", 1, "Debenture"));
	}
	public By Download_Btn=By.xpath("//span[text()='Download']");
	public String Download_Btn_Name="Download_Btn";
	public void clickOnDownload_Btn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(Download_Btn_Name, Download_Btn);
	}
	
	public By Upload=By.xpath("//button//span[text()='Upload']");
	public String Upload_Name="Upload";
	public void uploadDocument() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		String downloadedSignatureFile = CommonUtils.getLastModifiedFilePath("C:\\Users\\Admin\\Downloads");
		String expectedFileName = downloadedSignatureFile.replace("C:\\Users\\Admin\\Downloads\\", "");
		System.out.println("expectedFileName:" + expectedFileName);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(Upload_Name, Upload);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().uploadFile(downloadedSignatureFile);
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
	}
	
	public By SubmitBtn=By.xpath("//span[text()='Submit']");
	public String SubmitBtn_Name="SubmitBtn";
	public void clickOnSubmitBtn() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_Name, SubmitBtn);
	}
	public By Remarks = By.xpath("(//input[@placeholder='Enter your remark'])[last()]");
	public String Remarks_Name = "Remarks";
	public void enterRemarksFeild() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputText(Remarks_Name, Remarks, "Test");
	}
	public By SendBackToBtn=By.xpath("//span[text()='Send Back to']");
	public String SendBackToBtn_Name="SendBackToBtn";
	public void clickOnSendBackToBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SendBackToBtn_Name, SendBackToBtn);
	}
	
	public By SendBackToPMCRow=By.xpath("((//table[@class='table table-hover'])/tbody/tr/td/input)[2]");
	public String SendBackToPMCRow_Name="SendBackToPMCRow";
	public void clickOnSendBackToPMCRow() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SendBackToPMCRow_Name, SendBackToPMCRow);
	}
	public By SendBackToInvestorRow=By.xpath("((//table[@class='table table-hover'])/tbody/tr/td/input)[3]");
	public String SendBackToInvestorRow_Name="SendBackToPMCRow";
	public void clickOnSendBackToInvestorRow() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SendBackToInvestorRow_Name, SendBackToInvestorRow);
	}
	
	public By SubmitBtn_SendBackTo=By.xpath("(//span[text()='Submit'])[2]");
	public String SubmitBtn_SendBackTo_Name="SubmitBtn_SendBackTo";
	public void clickOnSubmitBtn_SendBackTo() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_SendBackTo_Name, SubmitBtn_SendBackTo);
	}
	public By RemarksHold=By.xpath("//input[@name='descisionremarktext']");
	public String RemarksHold_Name="RemarksHold";
	public void enterRemarks_Hold() {
		BaseTest.utilObj.get().getUIUtils().inputText(RemarksHold_Name, RemarksHold, "test");
	}
	
	//Final Noc 
	public void enterValueInSearchPendingTable_FinalNoc() throws IOException {
		String no = xlUtil.getCellData("Final Noc", 1, 0);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, no,
				Keys.ENTER);
	}
	
	public void selectValueFromFinalDecisionTable_FinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTable_Name, FinalDecisionTable, "Text", xlUtil.getCellData("Final Noc", 1, "Debenture"));
	}
	
	
}
