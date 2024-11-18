package com.truboardpartners.pageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.truboard.framework.BaseTest;
import com.truboard.utils.CommonUtils;
import com.truboard.utils.XLUtility;

public class Customer_Page {

	XLUtility xlUtil = new XLUtility(".//src//main//resources//Test_Data//TestData_TG//TestData_TruGenie.xlsx");
	public static String UnitNo = "";
	Robot robot;
	
	public By searchfeildL = By.xpath("//input[@type='text']");
	public String searchfeildL_name = "Enter Projectname Searchfeild";
	public By veiwButton = By.xpath("//img[@alt='view']");
	public String viewButton_name = "Clickon viewButton";
	public By requestNocButton = By.xpath("//span[text()='Request NOC']");
	public String requestNocButton_name = "ClickOn requsetnocButton";
	public By unino = By.xpath("//input[@placeholder='Select Unit No.']");
	public String unino_name = "Enter Unit number";
	public By remarks = By.xpath("//input[@placeholder='Enter Remarks']");
	public String remarks_name = "Enter REmarks";
	public By uploadBank = By.xpath("//img[@alt='upload' and @width='15' ]");
	public String uploadBank_name = "Click on uploadButton";
	public By lenderUpload = By.xpath("//div[@class='mantine-zzbiqn']//button[@class='mantine-UnstyledButton-root mantine-Button-root mantine-h05gq2']");
	public String lenderUpload_name = "click On UploadLender";
	public By verifyPayment = By.xpath("//span[text()='Verify Payment']");
	public String verifyPayment_name = "click on verifypayment";
	public By verifyPaymentSuccessMsg = By.xpath("//div[text()='Payment Verification done successfully...']");
	public String verifyPaymentSuccessMsg_name = "verify payment success full done";
	public By dowloadbtn = By.xpath("//span[text()='Download Letter']");
	public String dowloadbtn_name = "clickon dwonload btn";
	public By uploadLetter = By.xpath("//div[@class='mantine-9gumke']//span//img");
	public String uploadLetter_name = "click on uploadletter";
	public By submitBtn = By.xpath("//span[text()='Submit']");
	public String submitBtn_name = "Submit btn clicking";
	public By conformBtn = By.xpath("//span[text()='Confirm']");
	public String conformBtn_name = "Conform btn clicking";
	public By nocSuccessMsg = By.xpath("//div[text()='NOC Request created successfully...']");
	public String nocSuccessMsg_name = "Noc request success full done";
	
	
	public void clickOnSearchAndSendData() throws AWTException, IOException {
		BaseTest.utilObj.get().getUIUtils().clickElement(searchfeildL_name, searchfeildL);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(searchfeildL_name, searchfeildL,
				xlUtil.getCellData("Sheet1", 1, "Project Name"), Keys.ENTER);

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
	}
	
	public void clickOnViewButton() {
		BaseTest.utilObj.get().getUIUtils().clickElement(viewButton_name, veiwButton);
	}
	
	public void clickOnRequestNocButton() {
		BaseTest.utilObj.get().getUIUtils().clickElement(requestNocButton_name, requestNocButton);
	}
	
	public void enterUnitNo() throws AWTException, IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().inputText(unino_name, unino, xlUtil.getCellData("Sheet1", 1, 0));
 		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
 		robot = new Robot();
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
 		robot.keyPress(KeyEvent.VK_ENTER);
 		robot.keyRelease(KeyEvent.VK_ENTER);	
 		}
	
	public void enterRemarks() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputText(remarks_name, remarks,xlUtil.getCellData("Sheet1", 1, "Remarks"
				
));
	}
	
	public void clickOnUploadBankStatementAndUploadPDFFile() {
		BaseTest.utilObj.get().getUIUtils().clickElement(uploadBank_name, uploadBank);
		BaseTest.utilObj.get().getUIUtils().uploadFile("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\Apr_2022.pdf");
	}
	
	public void clickOnUploadLedgerAndUploadXlsFile() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(lenderUpload_name, lenderUpload);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().uploadFile("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\Customer_ABC.xls");
	}
	
	public void clickOnVerifyPayment() {
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(verifyPayment_name, verifyPayment);
	}
	public void verifyPaymentSuccessMessage() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(verifyPaymentSuccessMsg_name, verifyPaymentSuccessMsg);
		String actualText="Payment Verification done successfully...";
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		if(expectedText.equals(actualText)) {
			Assert.assertTrue(true);
			System.out.println("actualText= "+actualText);
			System.out.println("expectedText= "+expectedText);
		}else {
			Assert.fail();
		}
	}
	public void clickOnDownloadButton() {
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(dowloadbtn_name, dowloadbtn);
	}
	
	public void clickOnuploadLetter() {
		String downloadedSignatureFile = CommonUtils.getLastModifiedFilePath("C:\\Users\\Admin\\Downloads");
		String expectedFileName = downloadedSignatureFile.replace("C:\\Users\\Admin\\Downloads\\", "");
		System.out.println("expectedFileName:" + expectedFileName);
		BaseTest.utilObj.get().getUIUtils().clickElement(uploadLetter_name, uploadLetter);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().uploadFile(downloadedSignatureFile);
		BaseTest.utilObj.get().getUIUtils().waitForSec(1);
	}
	
	public void clickOnSubmitbtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(submitBtn_name, submitBtn);
	}
	
	public void clickOnConformBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(conformBtn_name, conformBtn);
	}
	
	
	public void nocRequestSuccessMessage() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(nocSuccessMsg_name, nocSuccessMsg);
		String actualText="Payment Verification done successfully...";
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
