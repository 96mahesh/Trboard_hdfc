package com.truboardpartners.testClasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.truboard.framework.BaseTest;
import com.truboardpartners.pageClasses.Customer_Page;
import com.truboardpartners.pageClasses.Debenture_Page;
import com.truboardpartners.pageClasses.Developer_Page;
import com.truboardpartners.pageClasses.Invester_Page;
import com.truboardpartners.pageClasses.LoginPage;
import com.truboardpartners.pageClasses.PMC_Page;

public class AAA_Test extends BaseTest {


	@Test(priority = 1, description = "Customer raise NOC request")

	public void raiseNOCRequest() throws AWTException, IOException {

		LoginPage login = new LoginPage();
		login.loginCustomer();
		login.loginSuccessMessage();
		Customer_Page customer = new Customer_Page();
		customer.clickOnSearchAndSendData();
        customer.clickOnViewButton();
        customer.clickOnRequestNocButton();
        customer.enterUnitNo();
        customer.enterRemarks();
        customer.clickOnUploadBankStatementAndUploadPDFFile();
        customer.clickOnUploadLedgerAndUploadXlsFile();
        customer.clickOnVerifyPayment();
        customer.verifyPaymentSuccessMessage();
        customer.clickOnDownloadButton();
        customer.clickOnuploadLetter();
        customer.clickOnSubmitbtn();
        customer.clickOnConformBtn();
        customer.nocRequestSuccessMessage();
		login.ClickOnLogOutBtnIcon();
		login.clickOnlogOut();
	}

	@Test(priority = 2, description = "Approve Noc Request by Rm")
	public void approvePMC_RFA() throws InterruptedException, IOException {

		LoginPage login = new LoginPage();
		login.loginRm();

		
		login.ClickOnLogOutBtnIcon();
	}

	@Test(priority = 3, description = "Approve Noc Request by Credit")
	public void approveInvester_RFA() throws InterruptedException, IOException {

		LoginPage login = new LoginPage();
		login.loginCredit();

		login.ClickOnLogOutBtnIcon();
	}

	@Test(priority = 4, description = "Approve Noc Request by CadMacker")
	public void approveDT_RFA() throws InterruptedException, AWTException, IOException {

		LoginPage login = new LoginPage();
		login.logiCadMacker();

		login.clickOnlogOut();
	}
	
     @Test(priority = 4, description = "Approve Noc Request by CadChecker")
     public void approvedCadChecker_RFA() throws IOException {
    	 LoginPage login = new LoginPage();
 		login.logiCadChecker();

 		login.clickOnlogOut();
     }

	@Test(priority = 5, description = "Validation at Developer Page(Approved NOC's Table)")
	public void validationOnApprovedNOC() throws AWTException, IOException {
		LoginPage login = new LoginPage();

		login.logiFinalRm();

		login.clickOnlogOut();
	}

}
