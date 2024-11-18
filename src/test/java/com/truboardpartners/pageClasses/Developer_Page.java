package com.truboardpartners.pageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.truboard.framework.BaseTest;
import com.truboard.setup.TestConfig;
import com.truboard.utils.CommonUtils;
import com.truboard.utils.XLUtility;
import com.truboardpartners.classes.TimeMethods;

import edu.emory.mathcs.backport.java.util.Collections;



public class Developer_Page {
	XLUtility xlUtil = new XLUtility("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\truboard.1\\truboard\\src\\main\\resources\\Test_Data\\TestData_TG\\TestData_TruGenie.xlsx");

	public static String UnitNo = "";
	Robot robot;
	// Tower B-Wing A-707
	public By SearchField = By.xpath("//select[@name='wm-datatable']");
	public String SearchField_Name = "Search Bar Field";
	public By Search = By.xpath("//input[@class='form-control app-textbox']");
	public String Search_Name = "Sarch";
	public By ViewRequest = By.xpath("//button[@title='View Request']");
	public String ViewRequest_Name = "ViewRequest";
	public By NocRequest = By.xpath("//a[@name='anchor2']");
	public String NocRequest_Name = "NocRequest";
	public By RequestNocBtn = By.xpath("//span[text()='Request NOC']");
	public String RequestNocBtn_Name = "RequestNocBtn";
	public By SearchUnitNo = By.xpath("//input[@placeholder='Search Unit No']");
	public String SearchUnitNo_Name = "SearchUnitNo";
	public By EnterRemark = By.xpath("//input[@placeholder='Enter remark']");
	public String EnterRemark_Name = "EnterRemark";
	public By UploadBankStatement = By.xpath("//button[@title='Upload Bank Statement']");
	public String UploadBankStatement_Name = "UploadBankStatement";
	public By UploadLedger = By.xpath("//span[text()='Upload ledger']");
	public String UploadLedger_Name = "UploadLedger";
	public By VerifyPayment = By.xpath("//button[@title='Verify Payment']");
	public String VerifyPayment_Name = "VerifyPayment";
	public By Download = By.xpath("//span[normalize-space()='Download']");
	public String Download_Name = "Download";
	public By UploadedSignedRequestFileName = By.xpath("//button//span[text()='Upload']");
	public String UploadedSignedRequestFileName_Name = "UploadedSignedRequestFileName";
	public By SignedIssuanceUploadedLetter = By.xpath("//label[@class='upload-title']");
	public String SignedIssuanceUploadedLetter_Name = "signedIssuanceUploadedLetter";
	public By submitBtn = By.xpath("//button[@caption='Submit']");
	public String submitBtn_Name = "submitBtn";
	public By YesButton = By.xpath("//span[normalize-space()='YES']");
	public String YesButton_Name = "YesButton";
	// Approved Nocs
	public By FirstRowCancelNocIcon = By.xpath("((//table[@class='table table-hover table-condensed'])[3]/tbody/tr/td[8]//i)[2]");
	public String FirstRowCancelNocIcon_Name = "FirstRowCancelNocIcon";
	public By CanceNocBtn = By.xpath("(//span[text()='Cancel NOC'])[2]");
	public String CanceNocBtn_Name = "CanceNocBtn";
	public By YesBtn = By.xpath("//span[text()='Yes']");
	public String YesBtn_Name = "YesBtn";
	public By SuccessMsg = By.xpath("//div[text()='Noc cancelled successfully']");
	public String SuccessMsg_Name = "SuccessMsg";
	public By UnitNoInFristRowApprovedTable = By.xpath("((//table)[4]/tbody/tr/td)[1]");
	public String UnitNoInFristRowApprovedTable_Name = "UnitNoInFristRowApprovedTable";
	
	public By logo_Dev = By.xpath("//img[@name='AppLogo']");
	public String logo_DevName = "logo_Dev";
	public boolean checkLogoPresent_Dev() {
		return BaseTest.utilObj.get().getUIUtils().isDisplayed(logo_Dev);
	}

	public void clickOnSearchFieldEnterValue() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SearchField_Name, SearchField);
		BaseTest.utilObj.get().getUIUtils().selectValue(SearchField_Name, SearchField, "Text",
				TestConfig.getInstance().getSelectField_DevHomePage());
	}

	public void clickOnSearchAndSendData() throws AWTException, IOException {
		BaseTest.utilObj.get().getUIUtils().clickElement(Search_Name, Search);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(Search_Name, Search,
				xlUtil.getCellData("Sheet1", 1, "Project Name"), Keys.ENTER);

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}

	public void clickOnViewRequest() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ViewRequest_Name, ViewRequest);
	}

	public void clickOnNocRequest() {
		BaseTest.utilObj.get().getUIUtils().clickElement(NocRequest_Name, NocRequest);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}

	public void clickOnRequestNocBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(RequestNocBtn_Name, RequestNocBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}
	public By UnitNumbers = By.xpath("//div[@class='autocomplete-items']//div");
	public String UnitNumbers_Name = "UnitNumbers";
	public void enterUnitNo() throws AWTException, IOException {
		//robot = new Robot();
		BaseTest.utilObj.get().getUIUtils().inputText(SearchUnitNo_Name, SearchUnitNo, xlUtil.getCellData("Sheet1", 1, 0));
 		BaseTest.utilObj.get().getUIUtils().waitForSec(10);
 		List<WebElement> listUnitNumbers = BaseTest.utilObj.get().getUIUtils().findElements(UnitNumbers_Name, UnitNumbers, "10");
 		for(WebElement un:listUnitNumbers) {
 			BaseTest.utilObj.get().getUIUtils().waitForSec(2);
 			String text = un.getText();
 			if(text.equals(xlUtil.getCellData("Sheet1", 1, 0))) {
 				un.click();
 			}
 		}
//		robot.keyPress(KeyEvent.VK_DOWN);
//		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
//		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public By PaymentReceivedTillDate = By.xpath("//input[@name='advancedpaymenttext']");
	public String PaymentReceivedTillDate_Name = "PaymentReceivedTillDate";
	
	public void enterPaymentReceivedTillDate() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputText(PaymentReceivedTillDate_Name, PaymentReceivedTillDate, "10000");
	}
	
	public void enterRemark() {
		BaseTest.utilObj.get().getUIUtils().inputText(EnterRemark_Name, EnterRemark, "Test");
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
	}

	public void clickOnUploadBankStatementAndUploadPDFFile() {
		BaseTest.utilObj.get().getUIUtils().clickElement(UploadBankStatement_Name, UploadBankStatement);
		BaseTest.utilObj.get().getUIUtils().uploadFile("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\Apr_2022.pdf");
	}

	public void clickOnUploadLedgerAndUploadXlsFile() {
//		BaseTest.utilObj.get().getUIUtils().moveToElement(UploadLedger_Name, UploadLedger);
//		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(UploadLedger_Name, UploadLedger);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().uploadFile("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\Customer_ABC.xls");
	}

	public static boolean getPaymentVerfiedStatusAtLeastOneRow() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clickOnVerifyPayment() {
		BaseTest.utilObj.get().getUIUtils().clickElement(VerifyPayment_Name, VerifyPayment);
		boolean paymentVerfied = Developer_Page.getPaymentVerfiedStatusAtLeastOneRow();
	}

	public void clickOnDownload() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(Download_Name, Download);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
	}

	public void clickOnUploadAndUploadDownloadedFile() {
		String downloadedSignatureFile = CommonUtils.getLastModifiedFilePath("C:\\Users\\Admin\\Downloads");
		String expectedFileName = downloadedSignatureFile.replace("C:\\Users\\Admin\\Downloads\\", "");
		System.out.println("expectedFileName:" + expectedFileName);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(UploadedSignedRequestFileName_Name,
				UploadedSignedRequestFileName);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().uploadFile(downloadedSignatureFile);
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
	}

	public void validateUploadedFileName() {
		String actualUploadedBankFileName = BaseTest.utilObj.get().getUIUtils()
				.getText(SignedIssuanceUploadedLetter_Name, SignedIssuanceUploadedLetter, true);
	}

	public void clickOnsubmitBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(submitBtn_Name, submitBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
	}

	public void clickOnYesButton() {
		BaseTest.utilObj.get().getUIUtils().clickElement(YesButton_Name, YesButton);
		//BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}

	// Approved Nocs
//	public void getUnitNo() throws InterruptedException {
//		Thread.sleep(10000);
//		UNo=BaseTest.utilObj.get().getUIUtils().getText(UnitNoInFristRowApprovedTable_Name, UnitNoInFristRowApprovedTable);
//		System.out.println("Unit No in Developer page is : "+UnitNo);
//	}
	public void clickOnFirstRowCancelNocIcon() {
		BaseTest.utilObj.get().getUIUtils().clickElement(FirstRowCancelNocIcon_Name, FirstRowCancelNocIcon);
	}

	public void clickOnCancelNocBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(CanceNocBtn_Name, CanceNocBtn);
	}

	public void clickOnYesBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(YesBtn_Name, YesBtn);
	}

	public void VerifyCancelNocSuccessMsg() throws InterruptedException {
		String text = BaseTest.utilObj.get().getUIUtils().getText(SuccessMsg_Name, SuccessMsg);
		System.out.println("Success Message is: " + text);
		Thread.sleep(3000);
		if (text.equals("Noc cancelled successfully")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

	// Pending table
	public By SelectFieldPendingTable = By.xpath("(//select[@name='wm-datatable'])[1]");
	public String SelectFieldPendingTable_Name = "SelectFieldPendingTable";

	public void selectValueFromeSelectFieldPendingTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldPendingTable_Name, SelectFieldPendingTable, "Text",
				TestConfig.getInstance().getSelectField_PendingTable());
	}

	public By SearchPendingTable = By.xpath("(//input[@placeholder='Search'])[1]");
	public String SearchPendingTable_Name = "SearchPendingTable";

	public void enterValueInSearchPendingTable() throws IOException {
	//	String no = Developer_Page.UNo;
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, no,
				Keys.ENTER);
	}

	public void enterValueInSearchForWithdrawPendingTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_Withdraw"), Keys.ENTER);
	}

	public By UnitNosPendingTable = By.xpath("(//table[@class='table table-hover table-condensed'])[1]/tbody/tr/td[1]");
	public String UnitNosPendingTable_Name = "UnitNosPendingTable";

	public void verificationOnPendingTable() {
		String no = TestConfig.getInstance().getSearch_PendingTable_UNo_Withdraw();
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosPendingTable_Name,
				UnitNosPendingTable, TestConfig.getInstance().getOBJWAITTIME());
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		for (WebElement element : elements) {
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in pending table");
				Assert.assertEquals(text, no);
			}else {
				Assert.fail();
			}
		}
	}

	public By WithdrawNocBtn = By.xpath("//button[@title='Withdrawn NOC']");
	public String WithdrawNocBtn_Name = "WithdrawNocBtn";

	public void clickOnWithdrawBtn() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(WithdrawNocBtn_Name, WithdrawNocBtn);
	}

	By YesBtn_WithdrawPopup = By.xpath("//span[text()='Yes']");
	public String YesBtn_WithdrawPopup_Name = "YesBtn_WithdrawPopup";

	public void clickOnYseBtnWithdraw() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElement(YesBtn_WithdrawPopup_Name, YesBtn_WithdrawPopup);
	}

	// Approved Noc's table
	public By SelectFieldApprovedTable = By.xpath("(//select[@name='wm-datatable'])[3]");
	public String SelectFieldApprovedTable_Name = "SelectFieldPendingTable";

	public void selectValueFromeSelectFieldApprovedTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldApprovedTable_Name, SelectFieldApprovedTable, "Text",
				TestConfig.getInstance().getSearchFieldApprovedTable());
	}

	public By SearchApprovedTable = By.xpath("(//input[@placeholder='Search'])[3]");
	public String SearchApprovedTable_Name = "SearchPendingTable";

	public void enterValueInSearchApprovedTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_RaiseNoc"), Keys.ENTER);
	}
	
	public void enterValueInSearchApprovedTable_FinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_RaiseNoc"), Keys.ENTER);
	}
	
	public void enterValueInSearchApprovedTable_CancelNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_CancelNoc"), Keys.ENTER);
	}
	
	public void enterValueInSearchApprovedTable_ExtenalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("External NOC", 1, "Unit Number_ExternalNoc"), Keys.ENTER);
	}
	
	public void enterValueInSearchApprovedTableForCancelNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_CancelNoc"), Keys.ENTER);
	}
	
	
	public By UnitNosApprovedTable = By.xpath("(//table[@class='table table-hover table-condensed'])[3]/tbody/tr/td[1]");
	public String UnitNosApprovedTable_Name = "UnitNosApprovedTable";
	public void verificationOnApprovedTable() throws IOException {
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosApprovedTable_Name,
				UnitNosApprovedTable, TestConfig.getInstance().getOBJWAITTIME());
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		for (WebElement element : elements) {
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in Approved table");
				Assert.assertEquals(text, no);
			}else {
				Assert.fail();
			}
		}
	}
	
	public By TypeOfNoc = By.xpath("(//table[@class='table table-hover table-condensed'])[3]/tbody/tr/td[6]");
	public String TypeOfNoc_Name = "TypeOfNoc";
	int count;
	public void verificationOnApprovedTable_FinalNoc_Approve() throws IOException {
		String no = xlUtil.getCellData("Final Noc", 1, "Unit Number Final_Noc");
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		List<WebElement> unos = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosApprovedTable_Name,
				UnitNosApprovedTable, TestConfig.getInstance().getOBJWAITTIME());
		List<WebElement> typeofnocs = BaseTest.utilObj.get().getUIUtils().findElements(TypeOfNoc_Name,
				TypeOfNoc, TestConfig.getInstance().getOBJWAITTIME());
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		
		for (WebElement element : unos) {
			String text = element.getText();
			if (text.equals(no)) {
				for(WebElement noctype : typeofnocs) {
					if(noctype.getText().equalsIgnoreCase("Conditional NOC") || noctype.getText().equalsIgnoreCase("Final NOC")) {
						count++;
						System.out.println("Type of Noc is : "+noctype.getText());
					}
				}
				Assert.assertEquals(text, no);
			}else {
				Assert.fail();
			}
		}
	if(count==4) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	
	public void verificationOnApprovedTable_ExtrnalNoc() throws IOException {
		String no = xlUtil.getCellData("External NOC", 1, "Unit No_ExternalNoc");
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosApprovedTable_Name,
				UnitNosApprovedTable, TestConfig.getInstance().getOBJWAITTIME());
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		for (WebElement element : elements) {
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in Approved table");
				Assert.assertEquals(text, no);
			}else {
				Assert.fail();
			}
		}
	}


	// Cancelled Noc's table
	public By SelectFieldCancelledTable = By.xpath("(//select[@name='wm-datatable'])[4]");
	public String SelectFieldCancelledTable_Name = "SelectFieldCancelledTable";

	public void selectValueFromeSelectFieldCancelledTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldCancelledTable_Name, SelectFieldCancelledTable, "Text",
				TestConfig.getInstance().getSearchFieldApprovedTable());
	}

	public By SearchCancelledTable = By.xpath("(//input[@placeholder='Search'])[4]");
	public String SearchCancelledTable_Name = "SearchCancelledTable";

	public void enterValueInSearchCancelledTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchCancelledTable_Name, SearchCancelledTable,
				xlUtil.getCellData("Sheet1",1, "Unit Number_CancelNoc"), Keys.ENTER);
	}
	
	public By UnitNosCancelledTable = By.xpath("(//table[@class='table table-hover table-condensed'])[4]/tbody/tr/td[1]");
	public String UnitNosCancelledTable_Name = "UnitNosCancelledTable";
	public void verificationOnCancelledTable() throws IOException {
		String no = xlUtil.getCellData("Sheet1",1, "Unit Number_CancelNoc");
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosCancelledTable_Name,
				UnitNosCancelledTable, TestConfig.getInstance().getOBJWAITTIME());
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		for (WebElement element : elements) {
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in Cancelled table");
				Assert.assertEquals(text, no);
			}else {
				Assert.fail();
			}
		}
	}
	
	//Rejected NOC Table
	
	public By SelectFieldRejectedTable = By.xpath("(//select[@name='wm-datatable'])[5]");
	public String SelectFieldRejectedTable_Name = "SelectFieldRejectedTable";

	public void selectValueFromeSelectFieldRejectedTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldRejectedTable_Name, SelectFieldRejectedTable, "Text",
				TestConfig.getInstance().getSearchFieldApprovedTable());
	}

	public By SearchRejectedTable = By.xpath("(//input[@placeholder='Search'])[5]");
	public String SearchRejectedTable_Name = "SearchRejectedTable";

	public void enterValueInSearchRejectedTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchRejectedTable_Name, SearchRejectedTable,
				xlUtil.getCellData("Sheet1", 1, 0), Keys.ENTER);
	}
	
	public void enterValueInSearchRejectedTable_FinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchRejectedTable_Name, SearchRejectedTable,
				xlUtil.getCellData("Final Noc", 1, 0), Keys.ENTER);
	}
	
	public void enterValueInSearchRejectedTable_Cancel() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchRejectedTable_Name, SearchRejectedTable,
				xlUtil.getCellData("Sheet1", 1, "Unit Number_CancelNoc"), Keys.ENTER);
	}
	
	public By UnitNosRejectedTable = By.xpath("(//table[@class='table table-hover'])[5]/tbody/tr/td[1]");
	public String UnitNosRejectedTable_Name = "UnitNosRejectedTable";
	public By NocRejectedOn = By.xpath("(//table[@class='table table-hover table-condensed'])[5]/tbody/tr/td[4]");
	public String NocRejectedOn_Name = "NocRejectedOn";
	public By nexticon=By.xpath("//label[text()='Rejected NOC']//following-sibling::div//pagination//span[text()='Go to Next page ']/..");
	public String nexticon_Name="nexticon";
	
	TimeMethods timeMethods = new TimeMethods();
	List<String> rejectTimeList = new ArrayList<String>();
	public void verificationOnRejectedTable() throws IOException {

		rejectTimeList=BaseTest.utilObj.get().getUIUtils().getListOfRequestedOnTime(NocRejectedOn_Name, NocRejectedOn,nexticon_Name, nexticon);
		List<Integer> list=new ArrayList<Integer>();
		for(int j=0;j<rejectTimeList.size();j++) {
			String date_timeStamp_Application = rejectTimeList.get(j).trim();
			System.out.println("date_timeStamp_Application = "+date_timeStamp_Application);
			Map<String,String> cur_dt = timeMethods.getCurrentDateAndTime();
			System.out.println("cur_dt = "+cur_dt);
			Map<String,String> app_dt = timeMethods.getAppliDateAndTime(date_timeStamp_Application);
			if(app_dt.get("year").equals(cur_dt.get("year")))
			{
				if(app_dt.get("month").equals(cur_dt.get("month"))) 
				{
					if(app_dt.get("day").equals(cur_dt.get("day"))) 
					{
						if(app_dt.get("hour").equals(cur_dt.get("hour")))
						{
							String k=app_dt.get("minute");
							int val= Integer.parseInt(k);
							list.add(val);
						}
					}
				}
			}
			
		}
		Integer maxvalue=(Integer) Collections.max(list);
		System.out.println("max value is "+maxvalue);
		for(int i=0;i<rejectTimeList.size();i++) {
			if(!rejectTimeList.get(i).equals("")){
				
				String date_timeStamp_Application = rejectTimeList.get(i).trim();
				
				//System.out.println("date_timeStamp_Application = "+date_timeStamp_Application);
				
				Map<String,String> app_dt = timeMethods.getAppliDateAndTime(date_timeStamp_Application);
				
				//System.out.println("app_dt = "+app_dt);
				Map<String,String> cur_dt = timeMethods.getCurrentDateAndTime();
				//System.out.println("cur_dt = "+cur_dt);
				
				if(app_dt.get("year").equals(cur_dt.get("year")))
				{
					if(app_dt.get("month").equals(cur_dt.get("month"))) 
					{
						if(app_dt.get("day").equals(cur_dt.get("day"))) 
						{
							if(app_dt.get("hour").equals(cur_dt.get("hour")))
							{
								String min_app = (String) app_dt.get("minute");
								String min_cur = (String) cur_dt.get("minute");
								int min_app_int = Integer.parseInt(min_app);
								int min_cur_int = Integer.parseInt(min_cur);
								if(min_app_int<=min_cur_int && min_app_int==maxvalue) {
									System.out.println("app min value is "+min_app_int+"*********"+"cur min value is "+min_cur_int);
									Assert.assertTrue(true);
									break;
								}
								
							}
						}
					}
				}else {
					System.out.println("Validation is not happen beacuse year mismatch");
					Assert.assertFalse(true);
				}
			}
			}
		}
		
		

		List<WebElement> al;
		public By PaginationNextBtn = By.xpath("//label[text()='Rejected NOC']//following-sibling::div//pagination//span[text()='Go to Next page ']/..");
		public String PaginationNextBtn_Name = "PaginationNextBtn";
		public By PagDis = By.xpath("//label[text()='Rejected NOC']//following-sibling::div//pagination//span[text()='Go to Next page , Disabled']//parent::a[@aria-disabled='true']");
		public String PagDis_Name = "PagDis";
		public void pagination_RejectTable() {
			al = BaseTest.utilObj.get().getUIUtils().findElements(NocRejectedOn_Name,
					NocRejectedOn, TestConfig.getInstance().getOBJWAITTIME());
			
			try {
				while(!BaseTest.utilObj.get().getUIUtils().findElement(PagDis_Name, PagDis, TestConfig.getInstance().getOBJWAITTIME(), false).isDisplayed())
				{
					BaseTest.utilObj.get().getUIUtils().clickElement(PaginationNextBtn_Name, PaginationNextBtn);
					al = BaseTest.utilObj.get().getUIUtils().findElements(NocRejectedOn_Name,
							NocRejectedOn, TestConfig.getInstance().getOBJWAITTIME());
					//System.out.println(al.size());
				}
			}catch(Exception e) {
				
			}
			System.out.println(al.size());
		}
	
	
	
	//success validations 
	public By withdrawSuccessMessage=By.xpath("//div[text()='Noc withdrawal successfully']");
	public String withdrawSuccessMessage_Name="withdrawSuccessMessage";
	public void withdrawSuccessMessage() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(withdrawSuccessMessage_Name, withdrawSuccessMessage);
		String actualText="Noc withdrawal successfully";
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		if(expectedText.equals(actualText)) {
			Assert.assertTrue(true);
			System.out.println("actualText= "+actualText);
			System.out.println("expectedText= "+expectedText);
		}else {
			Assert.fail();
		}
	}
	
	public By nocRequestSuccessMessage=By.xpath("//div[text()='NOC request sent successfully']");
	public String nocRequestSuccessMessage_Name="nocRequestSuccessMessage";
	public void nocRequestSuccessMessage() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(nocRequestSuccessMessage_Name, nocRequestSuccessMessage);
		String actualText="NOC request sent successfully";
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		if(expectedText.equals(actualText)) {
			Assert.assertTrue(true);
			System.out.println("actualText= "+actualText);
			System.out.println("expectedText= "+expectedText);
		}else {
			Assert.fail();
		}
	}
	
	//Caluclation validations
	public By Area=By.xpath("//input[@placeholder='Enter saleable area']");
	public String Area_Name="Area";
	public int getAreaValue() {
		int value = BaseTest.utilObj.get().getUIUtils().getValueFromTextBox(Area_Name, Area);
		//System.out.println("Area value is:"+ value);
		return value;
	}
	
	public By totalPurchaseConsiderationAmount=By.xpath("//label[@name='totalPurchaseConsiderationAmount']");	
	public String totalPurchaseConsiderationAmount_Name="totalPurchaseConsiderationAmount";
	public int getTotalPurchaseConsiderationAmount() {
		String text = BaseTest.utilObj.get().getUIUtils().getText(totalPurchaseConsiderationAmount_Name, totalPurchaseConsiderationAmount);
		System.out.println("total Purchase Consideration Amount:"+ text);
		String ss="";
		String text1 = text.substring(1, text.length());
		String[] s =text1.split(",");
		for(int i=0;i<s.length;i++) {
			//System.out.println(s[i]);
			ss=ss.concat(s[i]);
		}
	//System.out.println(ss);
	int intvalue=Integer.parseInt(ss);
	//System.out.println("Intvalue is:"+intvalue);
		return intvalue;
	}
	public By realisedPrice=By.xpath("//input[@name='realisedpricetext']");
	public String realisedPrice_Name="realisedPrice";
	public int getRealisedPrice() {
		int value=BaseTest.utilObj.get().getUIUtils().getValueFromTextBox1(realisedPrice_Name, realisedPrice);
		System.out.println("Actual RealisedPrice:"+ value);
		return value;
	}
	
	public void validation() {
	
		int totalAmount = getTotalPurchaseConsiderationAmount();
		System.out.println("totalAmount:"+totalAmount);
		int squareFeetValue = getAreaValue();
		System.out.println("squareFeetValue:"+squareFeetValue);
		int RealisedPrice = totalAmount/squareFeetValue;
		System.out.println("Expected RealisedPrice:"+RealisedPrice);
		if(RealisedPrice == getRealisedPrice()) {
			Assert.assertTrue(true);
		}else {
			System.err.println("wrong realised price");
			Assert.assertTrue(false);
		}
		
	}
	
	//Final Noc
	
	public void enterValueInSearchApprovedTableForFinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Final Noc", 1, "Unit Number_FinalNoc"), Keys.ENTER);
	}
	
	public By ClockIcon = By.xpath("//i[@aria-label='Icon' and @class='app-icon wi wi-restore']");
	public String ClockIcon_Name = "ClockIcon";
	
	public void clickOnClockIcon() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ClockIcon_Name, ClockIcon);
	}
	
	public By SubmitBtn_DPNPaymentVerification = By.xpath("//span[text()='Submit']");
	public String SubmitBtn_DPNPaymentVerification_Name = "SubmitBtn_DPNPaymentVerification";
	
	public void clickOnSubmitBtn_DPNPaymentVerification() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_DPNPaymentVerification_Name, SubmitBtn_DPNPaymentVerification);
	}
	
	public By FinalBtn = By.xpath("//i[@class='app-icon sl-file-add wm-sl-r']");
	public String FinalBtn_Name = "FinalBtn";
	
	public void clickOnFinalBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement("FinalBtn_Name",FinalBtn);
	}
	
	public By SubmitBtn_FinalNOCPaymentVerification_Popup = By.xpath("//span[text()='Submit']");
	public String SubmitBtn_FinalNOCPaymentVerification_Popup_Name = "SubmitBtn_FinalNOCPaymentVerification_Popup";
	
	public void clickOnSubmitBtn_FinalNOCPaymentVerification_Popup() {
		BaseTest.utilObj.get().getUIUtils().clickElement("SubmitBtn_FinalNOCPaymentVerification_Popup_Name",SubmitBtn_FinalNOCPaymentVerification_Popup);
	}
	
//	After Modifing development Scripts
	
	public By AssertProfile_Menu = By.xpath("//img[@name='AppLogo']");
	public By projectBtn = By.xpath("//label[text()='Projects']");
	public By projectDD = By.xpath("//div[@wmtable='table_197']//select[@data-element='dgFilterValue']");
	public By projectSearchBox = By.xpath("//div[@wmtable='table_197']//input[@type='text' and @placeholder='Search']");
	public By project = By.xpath("//div[@wmtable='table_197' and @statehandler='URL']//table[@class='table table-hover table-condensed']//td[text()='Asset Test Perform1']");
	public By setupBtn = By.xpath("//span[text()='Setup']");
	public By updateBtn = By.xpath("//span[text()='Setup']//following::span[text()='Update']");
	public By nocSetupBtn = By.xpath("//span[text()='NOC Setup']");
	
	public String AssertProfile_Menu_Name = "AssertProfile Menu";
	public String projectBtn_name = "ProjectBtnClicking";
	public String projectDD_name = "Select Project name";
	public String projectSearchBox_name = "Enter value search box";
	public String projectnamerow =  "clicking project rowname";
	public String setupBtn_name = "setup Btn Clicking";
	public String updateBtn_name = "update Btn Clicking";
	public String nocSetupBtn_name = "noc setup btn Clicking";

	
	public void clickOnAssetProfile() {
		BaseTest.utilObj.get().getUIUtils().clickElement(AssertProfile_Menu_Name, AssertProfile_Menu);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
	}
	public void clickOnProjectBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(projectBtn_name, projectBtn);
	}
	
	public void selectDropDownList() throws IOException {
		BaseTest.utilObj.get().getUIUtils().selectValue(projectDD_name, projectDD, "text", xlUtil.getCellData("Developer", 1, "projectdropdown"));
	}
	
	public void enterSearchBoxField() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(projectSearchBox_name, projectSearchBox,  xlUtil.getCellData("Developer", 1, "ProjectName"), Keys.ENTER);
	}
	
	public void clickOnProjectName() {
		BaseTest.utilObj.get().getUIUtils().clickElement(projectnamerow, project);
	}
	public void clickOnSetUpBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(setupBtn_name, setupBtn);
	}
	public void clickOnUpdateBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(updateBtn_name, updateBtn);

	}
	
	public void clickOnNocSetupBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(nocSetupBtn_name, nocSetupBtn);

	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
