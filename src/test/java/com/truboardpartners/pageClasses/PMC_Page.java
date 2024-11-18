
package com.truboardpartners.pageClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.truboard.framework.BaseTest;
import com.truboard.setup.TestConfig;
import com.truboard.utils.XLUtility;

import junit.framework.Assert;

public class PMC_Page {
	XLUtility xlUtil = new XLUtility("C:\\Users\\Admin\\TrueBoardWorkplace\\Truboard\\truboard.1\\truboard\\src\\main\\resources\\Test_Data\\TestData_TG\\TestData_TruGenie.xlsx");
	
	public By AssertProfile_Menu = By.xpath("//img[@name='AppLogo']");
	public By NOC_Link = By.xpath("//span[text()='NOC']");
	public By Project_Drpdwn = By.xpath("//div[@wmtable='table_206' and @name='table3']//select[@name='wm-datatable']");
	public By ManageProject_Link = By.xpath("//span[text()='Manage Project']");
	public By ManageRequest_Link = By.xpath("//span[text()='Manage Request']");
	// entites
	public By EntitesTableRows = By.xpath("(//table[@class='table table-hover table-condensed'])[1]/tbody/tr");
	public By DeleteIcon_Entites = By
			.xpath("(//table[@class='table table-hover table-condensed'])[1]/tbody/tr/td[3]//button");
	public By YesBtn = By.xpath("//span[text()='Yes']");
	public By NewBtn_Entites = By.xpath("(//span[text()='New'])[1]");
	public By NoData_Entites = By.xpath("(//span[text()='No data found.'])[1]");
	public By Role_Drpdwn_Entites = By.xpath("//select[@name='roleselect']");
	public By Entity_Drpdwn_Entites = By.xpath("//select[@name='entityselect']");
	public By SubmitBtn_AddEntity = By.xpath("//button[@name='addentitybutton']");
	// user
	public By UsersTableRows = By.xpath("(//table[@class='table table-hover table-condensed'])[2]/tbody/tr");
	public By Role_Drodwn_User = By.xpath("//select[@name='adduserroleselect']");
	public By Entity_Drpdwn_User = By.xpath("//select[@name='adduserentityselect']");
	public By User_Drpdwn_User = By.xpath("//select[@name='userselect']");
	public By user_Designation = By.xpath("//input[@placeholder='Enter Designation']");
	public By Address_User = By.xpath("//input[@placeholder='Enter address']");
	public By DeleteIcon_Users = By
			.xpath("(//table[@class='table table-hover table-condensed'])[2]/tbody/tr/td[6]//button");
	public By NewBtn_Users = By.xpath("(//span[text()='New'])[2]");
	public By OK_btn = By.xpath("//span[text()='Ok']");
	public By NoData_User = By.xpath("(//span[text()='No data found.'])[1]");
	public By SubmitBtn_User = By.xpath("//span[text()='Submit']");
	public By NextBtn = By.xpath("//span[text()='Next']");
	public By NewBtn = By.xpath("(//span[text()='New'])[3]");
	
	// Add Entity Priority(Manage WorkFlow)
	public By NoData_ManageWorkFlow = By.xpath("(//span[text()='No data found.'])[1]");
	public By Entity_AddEntityPriority = By.xpath("//select[@name='entityPriority']");
	public By TypeOfStep_AddEntityPriority = By.xpath("//select[@name='entityTypeOfStep']");
	public By User_AddEntityPriority = By.xpath("//input[@placeholder='Select Users...']");
	public By Submit_AddEntityPriority = By.xpath("//span[text()='Submit']");
	public By NextBtn_ManageWorkFlow = By.xpath("//span[text()='Next']");
	// Account Details
	public By AccountDetailsTableRows = By.xpath("(//table[@class='table table-hover'])[2]/tbody/tr");
	public By DeleteIcon_AccountDetais = By
			.xpath("(//div[@class='table-container table-responsive'])[last()]//button[@type='button']");
	public By New_AccountDetails = By.xpath("(//span[text()='New'])[4]");
	public By YestBtn_AccountDetails = By.xpath("//span[text()='Yes']");
	public By NoData_AccountDetails = By.xpath("(//span[text()='No data found.'])[1]");
	// Add Account
	public By AccountTypeDrpdwn_AddAccount = By.xpath("//select[@name='accounttypeselect']");
	public By FromDate = By.xpath("//input[@name='fromDate']");
	public By AccountNumber = By.xpath("//input[@name='accountnumbertext']");
	public By BankName = By.xpath("//input[@name='banknametext']");
	public By Address = By.xpath("//input[@placeholder='Enter branch address']");
	public By TowerDrpdwn = By.xpath("(//input[@id='select-state-selectized'])[2]");
	public By SubmitBtn_AddAccount = By.xpath("//span[text()='Submit']/..");
	// Threshold Details
	public By MSP_Margin_of_Tolerance = By.xpath("//input[@name='sptolrancetext']");
	public By Minimum_Advanced_Payment = By.xpath("//input[@name='advancedpaymenttext']");
	public By Margin_of_Tolerance = By.xpath("//input[@name='advancedtolerancetext']");
	public By Threshold_Date = By.xpath("//input[@name='thresholddate']");
	public By Threshold_Type = By.xpath("//select[@name='thresholdtypeselect']");
	public By PriceHeaders = By.xpath("//div[@class='selectize-control select-checkbox multi']");////input[@placeholder='Select Price Headers']
	public By Average_Price_Calculated_for = By.xpath("//select[@name='averagePriceCalculated']");
	public By Period = By.xpath("//select[@name='period']");
	public By Next = By.xpath("//span[text()='Next']");
	public By Done = By.xpath("//span[text()='Done']");
	//
	public By ShowMyDeliverablesPendingTable = By.xpath("(//span[@class='caption'])[1]");
	public String ShowMyDeliverablesPendingTable_Name = "ShowMyDeliverables";

	public By ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests = By
			.xpath("((//table[@class='table table-hover table-condensed'])[1]/tbody/tr)[1]/td[9]//button");
	public String ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests_Name = "ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests";

	public By FinalDecisionTablePendingTable = By.xpath("//select[@name='descisionselect']");
	public String FinalDecisionTablePendingTable_Name = "FinalDecisionTable";
	public By SubmitBtnPendingTable = By.xpath("//span[text()='Submit']");
	public String SubmitBtnPendingTable_Name = "SubmitBtn";

	public String AssertProfile_Menu_Name = "AssertProfile Menu";
	public String NOC_Link_Name = "NOC Link";
	public String Project_Drpdwn_Name = "Project_DrpdwnLink";
	public String ManageProject_Link_Name = "ManageProject Link";
	public String ManageRequest_Link_Name = "ManageRequest_Link";
	// entites
	public String EntitesTableRows_Name = "Entites Table Rows";
	public String DeleteIcon_Entites_Name = "Delete button";
	public String YesBtn_Name = "Yes Button";
	public String NewBtn_Entites_Name = "New Button in Entites";
	public String NoData_Entites_Name = "No Data found text";
	public String Role_Drpdwn_Entites_Name = "Role Dropdown";
	public String Entity_Drpdwn_Entites_Name = "Entity Dropdown";
	public String SubmitBtn_AddEntity_Name = "Submit button";
	// user
	public String UsersTableRows_Name = "Count of user rows";
	public String Role_Drodwn_User_Name = "Role dropdown in user";
	public String Entity_Drpdwn_User_Name = "Entity dropdown in user";
	public String User_Drpdwn_User_Name = "User dropdown in user";
	public String user_Designation_name = "Enter user Designation";
	public String Address_User_Name = "Address in user";
	public String DeleteIcon_Users_Name = "Delete Icon in User";
	public String NewBtn_Users_Name = "New Button in Users";
	public String Ok_btn_Name = "Ok button";
	public String SubmitBtn_User_Name = "Submit Button";
	public String NextBtn_Name = "Next button";
	public String NewBtn_Name = "New Button";
	// add entity priority(Manage WorkFlow)
	public String NoData_ManageWorkFlow_Name = "NoData_ManageWorkFlow";
	public String Entity_AddEntityPriority_Name = "Entity_AddEntityPriority_Name";
	public String TypeOfStep_AddEntityPriority_Name = "TypeOfStep_AddEntityPriority_Name";
	public String User_AddEntityPriority_Name = "User_AddEntityPriority_Name";
	public String Submit_AddEntityPriority_Name = "Submit_AddEntityPriority";
	public String NextBtn_ManageWorkFlow_Name = "NextBtn_ManageWorkFlow";
	// Account Details
	public String AccountDetailsTableRows_Name = "AccountDetailsTableRows";
	public String DeleteIcon_AccountDetais_Name = "DeleteIcon_AccountDetais";
	public String YestBtn_AccountDetails_Name = "YestBtn_AccountDetails";
	public String New_AccountDetails_Name = "New_AccountDetails";
	public String NoData_AccountDetails_Name = "NoData_AccountDetails";
	public String AccountTypeDrpdwn_AddAccount_Name = "AccountTypeDrpdwn_AddAccount";
	public String FromDate_Name = "FromDate";
	public String AccountNumber_Name = "Account Number";
	public String BankName_Name = "Bank Name";
	public String Address_Name = "Address";
	public String TowerDrpdwn_Name = "TowerDrpdwn";
	public String SubmitBtn_AddAccount_Name = "SubmitBtn_AddAccount";
	//
	public String MSP_Margin_of_Tolerance_Name = "MSP_Margin_of_Tolerance";
	public String Minimum_Advanced_Payment_Name = "Minimum_Advanced_Payment";
	public String Margin_of_Tolerance_Name = "Margin_of_Tolerance";
	public String Threshold_Date_Name = "Threshold_Date";
	public String Threshold_Type_Name = "Threshold_Type";
	public String PriceHeaders_Name = "PriceHeaders";
	public String Average_Price_Calculated_for_Name = "Average_Price_Calculated_for";
	public String Period_Name = "Period";
	public String Next_Name = "Next";
	public String Done_Name = "Done";
	
	public By logo_PMC = By.xpath("//img[@name='AppLogo']");
	public String logo_PMCName = "logo_PMC";
	public boolean checkLogoPresent_PMC() {
		return BaseTest.utilObj.get().getUIUtils().isDisplayed(logo_PMC);
	}

	public void clickOnAssetProfile() {
		BaseTest.utilObj.get().getUIUtils().clickElement(AssertProfile_Menu_Name, AssertProfile_Menu);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
	}

	public void clickOnNOCLink() {
		BaseTest.utilObj.get().getUIUtils().clickElement(NOC_Link_Name, NOC_Link);
		BaseTest.utilObj.get().getUIUtils().waitForSec(7);
	}

	public void selectProject() {
		try {
			BaseTest.utilObj.get().getUIUtils().selectValue(Project_Drpdwn_Name, Project_Drpdwn, "Text",
					xlUtil.getCellData("Sheet1", 1, "Project Name"));
		}catch(Exception e) {
			
		}
	}
	

	public void clickOnManageProject() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ManageProject_Link_Name, ManageProject_Link);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
	}

	// Entites Section
	public void deleteAndAddEntites() {
		try {
			int row_count = BaseTest.utilObj.get().getUIUtils().countOfRows(EntitesTableRows_Name, EntitesTableRows);
			System.out.println("entites row count is = " + row_count);
			if (row_count > 0) {
				for (int i = 0; i < row_count; i++) {
					BaseTest.utilObj.get().getUIUtils().clickElement(DeleteIcon_Entites_Name, DeleteIcon_Entites);
					// BaseTest.utilObj.get().getUIUtils().switchToAlertAndAccept();
					BaseTest.utilObj.get().getUIUtils().clickElement(YesBtn_Name, YesBtn);
				}
			} else {
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Entites_Name, NewBtn_Entites);
			}
		} catch (Exception e) {

		}
		try {
			if (BaseTest.utilObj.get().getUIUtils().isDisplayed(NoData_Entites)) {
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Entites_Name, NewBtn_Entites);
				addEntites("Developer", "Borrower A");
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Entites_Name, NewBtn_Entites);
				addEntites("PMC", "PMC demo");
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Entites_Name, NewBtn_Entites);
				addEntites("Investor", "Lender A");
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Entites_Name, NewBtn_Entites);
				addEntites("Debenture", "Independent Trustee Services");
			}

		} catch (Exception e) {

		}
	}

	// Users Section
	//String role, String entity, String user,String Designation, String address
	public void deleteAndAddUsers() throws InterruptedException {
		if (BaseTest.utilObj.get().getUIUtils().isDisplayed(NoData_User)) {
			Thread.sleep(4000);
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Users_Name, NewBtn_Users);
			addUsers("Developer", "Borrower A", "Test 1","Developer","Hyderabad");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Users_Name, NewBtn_Users);
			addUsers("PMC", "PMC demo", "Approver1 test","Pmc", "Hyderabad");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Users_Name, NewBtn_Users);
			addUsers("Investor", "Lender A", "Approver2 test","Investor", "Hyderabad");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Users_Name, NewBtn_Users);
			addUsers("Debenture", "Independent Trustee Services", "Test 3","Debenture", "Hyderabad");
		}

		BaseTest.utilObj.get().getUIUtils().clickElement(NextBtn_Name, NextBtn);
		if (BaseTest.utilObj.get().getUIUtils().isDisplayed(NoData_ManageWorkFlow)) {
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Name, NewBtn);
			BaseTest.utilObj.get().getUIUtils().waitForSec(3
					);
			addEntitiDeveloper("Borrower A","test1@truboardpartners.com");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Name, NewBtn);
			addEntityPriority("PMC demo", "Recommender", "approver1.test@truboardpartners.com");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Name, NewBtn);
			addEntityPriority("Lender A", "Approver", "approver2.test@truboardpartners.com");
			BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_Name, NewBtn);
			addEntityPriority("Independent Trustee Services", "Approver", "test3@truboardpartners.com");
		}

		BaseTest.utilObj.get().getUIUtils().clickElement(NextBtn_ManageWorkFlow_Name, NextBtn_ManageWorkFlow);
		Thread.sleep(5000);
		try {
			int countOfRows_AccountDetails = BaseTest.utilObj.get().getUIUtils()
					.countOfRows(AccountDetailsTableRows_Name, AccountDetailsTableRows);
			System.out.println("No of rows in AccountDetails Table= " + countOfRows_AccountDetails);
			if (countOfRows_AccountDetails > 0) {
				for (int i = 0; i < countOfRows_AccountDetails; i++) {
					Thread.sleep(2000);
					BaseTest.utilObj.get().getUIUtils().clickElement(DeleteIcon_AccountDetais_Name,
							DeleteIcon_AccountDetais);
					BaseTest.utilObj.get().getUIUtils().clickElement(YestBtn_AccountDetails_Name,
							YestBtn_AccountDetails);
				}

			}
		} catch (Exception e) {

		}
	}
	
//	public void accountDetails() {
//		BaseTest.utilObj.get().getUIUtils().clickElement(New_AccountDetails_Name, New_AccountDetails);
//		BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
//				AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
//		BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
//		BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "1234567890");
//		BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "HDFC");
//		BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Hyd");
//		BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
//				"Tower A");
//		BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
//				"Tower B");
//		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);
//	}

	
	public By AddAccountDetailsRows = By.xpath("(//table[@class='table table-hover table-condensed'])[4]/tbody/tr/td[7]//button");
	public String AddAccountDetailsRows_Name = "AddAccountDetailsRows";
	public By DeleteIcon_AddAccountDetails = By.xpath("(//table[@class='table table-hover table-condensed'])[4]/tbody/tr/td[7]//button");
	public String DeleteIcon_AddAccountDetails_Name = "DeleteIcon_AddAccountDetails";
	public By NewBtn_AddAccountDetails = By.xpath("(//span[text()='New'])[4]");
	public String NewBtn_AddAccountDetails_Name = "NewBtn_AddAccountDetails";
	public By rerano = By.xpath("//input[@placeholder='Enter RERA number']");
	public String rerano_name = "Enter Rearano";
	// Account Details
	public void addAccountDetails() {
		try {
			int row_count = BaseTest.utilObj.get().getUIUtils().countOfRows(AddAccountDetailsRows_Name, AddAccountDetailsRows);
			System.out.println("account details row count is = " + row_count);
			if (row_count > 0) {
				for (int i = 0; i < row_count; i++) {
					BaseTest.utilObj.get().getUIUtils().clickElement(DeleteIcon_AddAccountDetails_Name, DeleteIcon_AddAccountDetails);
					// BaseTest.utilObj.get().getUIUtils().switchToAlertAndAccept();
					BaseTest.utilObj.get().getUIUtils().clickElement(YesBtn_Name, YesBtn);
				}
			} else {
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_AddAccountDetails_Name, NewBtn_AddAccountDetails);
			}
		} catch (Exception e) {

		}
		try {
			if (BaseTest.utilObj.get().getUIUtils().isDisplayed(NoData_Entites)) {
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_AddAccountDetails_Name, NewBtn_AddAccountDetails);
				//BaseTest.utilObj.get().getUIUtils().clickElement(New_AccountDetails_Name, New_AccountDetails);
				BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
						AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
				BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
				BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "1234567890");
				BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "HDFC");
				BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Hyd");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower A");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower B");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower C");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower D");
//				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
//						"Tower E");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower F");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Floor");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Villa");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Shop");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Plot");
				Thread.sleep(2000);
				//BaseTest.utilObj.get().getUIUtils().waitForSec(5);
				//BaseTest.utilObj.get().getUIUtils().clickElement(rerano_name, rerano);
				BaseTest.utilObj.get().getUIUtils().inputText(rerano_name, rerano, "P143564884,P746465778");
				
				BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);
				
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_AddAccountDetails_Name, NewBtn_AddAccountDetails);
				
				//BaseTest.utilObj.get().getUIUtils().clickElement(New_AccountDetails_Name, New_AccountDetails);
				
				BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
						AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
				BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
				BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "3214567980");
				BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "Hdfc");
				BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Mumbai");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower A");
				BaseTest.utilObj.get().getUIUtils().inputText(rerano_name, rerano, "P6765367985");
				BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);
				
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_AddAccountDetails_Name, NewBtn_AddAccountDetails);
			
				BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
						AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
				BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
				BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "1234537890");
				BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "HDFC");
				BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Delhi");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower B");
				BaseTest.utilObj.get().getUIUtils().inputText(rerano_name, rerano, "P4547857373");
				BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);
			
				BaseTest.utilObj.get().getUIUtils().clickElement(NewBtn_AddAccountDetails_Name, NewBtn_AddAccountDetails);
				
				BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
						AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
				BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
				BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "12345653890");
				BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "HDFC");
				BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Hyd");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower B");
				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
						"Tower A");
				BaseTest.utilObj.get().getUIUtils().inputText(rerano_name, rerano, "P564364782,P143567272");
				BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);

			}

		} catch (Exception e) {

		}
		
//		try {
//			if (BaseTest.utilObj.get().getUIUtils().isDisplayed(NoData_AccountDetails)) {
//				BaseTest.utilObj.get().getUIUtils().clickElement(New_AccountDetails_Name, New_AccountDetails);
//				BaseTest.utilObj.get().getUIUtils().selectValue(AccountTypeDrpdwn_AddAccount_Name,
//						AccountTypeDrpdwn_AddAccount, "Text", "Master Collection");
//				BaseTest.utilObj.get().getUIUtils().inputText(FromDate_Name, FromDate, "Nov 4, 2023");
//				BaseTest.utilObj.get().getUIUtils().inputText(AccountNumber_Name, AccountNumber, "1234567890");
//				BaseTest.utilObj.get().getUIUtils().inputText(BankName_Name, BankName, "HDFC");
//				BaseTest.utilObj.get().getUIUtils().inputText(Address_Name, Address, "Hyd");
//				// BaseTest.utilObj.get().getUIUtils().clickElement(TowerDrpdwn_Name, TowerDrpdwn);
//				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
//						"Tower A");
//				BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(TowerDrpdwn_Name, TowerDrpdwn,
//						"Tower B");
//				BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddAccount_Name, SubmitBtn_AddAccount);
//			}else {
//				
//			}
//		}catch(Exception e) {
//			
//		}
		
	}

	// Threshold Details
	public void AddThresholdDetails() throws InterruptedException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(7);
		BaseTest.utilObj.get().getUIUtils().clearAndEnterText(MSP_Margin_of_Tolerance_Name, MSP_Margin_of_Tolerance,
				"10");
		BaseTest.utilObj.get().getUIUtils().clearAndEnterText(Minimum_Advanced_Payment_Name, Minimum_Advanced_Payment,
				"10");
		BaseTest.utilObj.get().getUIUtils().clearAndEnterText(Margin_of_Tolerance_Name, Margin_of_Tolerance, "10");
		BaseTest.utilObj.get().getUIUtils().inputText(Threshold_Date_Name, Threshold_Date, "Nov 4, 2023");
		BaseTest.utilObj.get().getUIUtils().selectValue(Threshold_Type_Name, Threshold_Type, "Text", "Sanction Date");

//		BaseTest.utilObj.get().getUIUtils().inputText(PriceHeaders_Name, PriceHeaders,"Flat Cost");
//		BaseTest.utilObj.get().getUIUtils().inputText(PriceHeaders_Name, PriceHeaders,"Parking Charges");
		//BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(PriceHeaders_Name, PriceHeaders,"Flat Cost" , "Parking Charges" );
		Thread.sleep(3000);
		BaseTest.utilObj.get().getUIUtils().selectValue(Average_Price_Calculated_for_Name, Average_Price_Calculated_for,
				"Text", "Project");
		BaseTest.utilObj.get().getUIUtils().selectValue(Period_Name, Period, "Text", "3");
		BaseTest.utilObj.get().getUIUtils().clickElement(Next_Name, Next);
		BaseTest.utilObj.get().getUIUtils().clickElement(Done_Name, Done);
	}

	public void clickOnManageRequest() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ManageRequest_Link_Name, ManageRequest_Link);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
	}

	// pending table
	public void clickOnShowMyDeliverables_CheckBoxPendingTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(ShowMyDeliverablesPendingTable_Name,ShowMyDeliverablesPendingTable);
	}

	public void clickOnApproveAndAuthorizeOrCancelNocBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests_Name,
				ApproveAndAuthorizeORCancelNocFirstRowInPendingRequests);
	}

	public void selectValueFromFinalDecisionTable() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTablePendingTable_Name,FinalDecisionTablePendingTable, "Text", xlUtil.getCellData("Sheet1", 1, 1));
	}
	
	public void selectValueFromFinalDecisionTable_FinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTablePendingTable_Name,FinalDecisionTablePendingTable, "Text", xlUtil.getCellData("Final Noc", 1, "PMC"));
	}

	public void clickOnSubmitBtn() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtnPendingTable_Name, SubmitBtnPendingTable);
	}

	public By SelectFieldPendingTable = By.xpath("(//select[@name='wm-datatable'])[1]");
	public String SelectFieldPendingTable_Name = "SelectFieldPendingTable";

	public void selectValueFromeSelectFieldPendingTable() {
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldPendingTable_Name, SelectFieldPendingTable, "Text",
				"Unit");
	}

	public By SearchPendingTable = By.xpath("(//input[@placeholder='Search'])[1]");
	public String SearchPendingTable_Name = "SearchPendingTable";

	public void enterValueInSearchPendingTable() throws IOException {
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, no,
				Keys.ENTER);
	}
	public void enterValueInSearchPendingTable_FinalNoc() throws IOException {
		String no = xlUtil.getCellData("Final Noc", 1, 0);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable, no,
				Keys.ENTER);
	}

	public void enterValueInSearchPendingTableForCancel() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchPendingTable_Name, SearchPendingTable,
				xlUtil.getCellData("Sheet1", 1,"Unit Number_CancelNoc"), Keys.ENTER);
	}

	public By UnitNosPendingTable = By.xpath("(//table[@class='table table-hover table-condensed'])[1]/tbody/tr/td[1]");
	public String UnitNosPendingTable_Name = "UnitNosPendingTable";

	public void verificationOnPendingTable() throws IOException {
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosPendingTable_Name,
				UnitNosPendingTable, TestConfig.getInstance().getOBJWAITTIME());
		for (WebElement element : elements) {
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in pending table");
				Assert.assertEquals(text, no);
				;
			}
		}
	}

	public By Remarks = By.xpath("(//input[@placeholder='Enter your remark'])[last()]");
	public String Remarks_Name = "Remarks";

	public void enterRemarksFeild() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputText(Remarks_Name, Remarks, "Incorrect documents ");
	}

	public By successMsgForRejectNoc = By.xpath("//div[text()='NOC rejected successfully']");
	public String successMsgForRejectNoc_Name = "successMsgForRejectNoc";

	public void successMsgForRejectNoc() {
		String expectedText = BaseTest.utilObj.get().getUIUtils().getText(successMsgForRejectNoc_Name,
				successMsgForRejectNoc);
		String actualText = "NOC rejected successfully";
		if (expectedText.equals(actualText)) {
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	// Hold Request table in Investor
	public By ShowMyDeliverablesHoldTable = By.xpath("(//span[@class='caption'])[2]");
	public String ShowMyDeliverablesHoldTable_Name = "ShowMyDeliverables";
	public void clickOnShowMyDeliverables_CheckBoxHoldTable() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().clickElement(ShowMyDeliverablesHoldTable_Name, ShowMyDeliverablesHoldTable);
	}
	
	public By SelectFieldHoldTable = By.xpath("(//select[@name='wm-datatable'])[2]");
	public String SelectFieldHoldTable_Name = "SelectFieldHoldTable";

	public void selectValueFromeSelectFieldHoldTable() {
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldHoldTable_Name, SelectFieldHoldTable, "Text",
				"Unit");
	}

	public By SearchHoldTable = By.xpath("(//input[@placeholder='Search'])[2]");
	public String SearchHoldTable_Name = "SearchPendingTable";

	public void enterValueInSearchHoldTable() throws IOException {
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchHoldTable_Name, SearchHoldTable, no, Keys.ENTER);
	}

	public void enterValueInSearchHoldTable_FinalNoc() throws IOException {
		String no = xlUtil.getCellData("Final Noc", 1, 0);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchHoldTable_Name, SearchHoldTable, no, Keys.ENTER);
	}

	public By UnitNosHoldTable = By.xpath("(//table[@class='table table-hover table-condensed'])[2]/tbody/tr/td[1]");
	public String UnitNosHoldTable_Name = "UnitNosHoldTable";

	public void verificationOnHoldTable_PMC() throws IOException {
		String no = xlUtil.getCellData("Sheet1", 1, 0);
		System.out.println("no=" + no);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosHoldTable_Name,
				UnitNosHoldTable, TestConfig.getInstance().getOBJWAITTIME());
		for (WebElement element : elements) {
			BaseTest.utilObj.get().getUIUtils().waitForSec(5);
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in Hold table");
				Assert.assertEquals(text, no);
			}
			else {
				Assert.fail();
			}
		}
	}
	
	
	public void verificationOnHoldTable_PMC_FinalNoc() throws IOException {
		String no = xlUtil.getCellData("Final Noc", 1, 0);
		System.out.println("no=" + no);
		List<WebElement> elements = BaseTest.utilObj.get().getUIUtils().findElements(UnitNosHoldTable_Name,
				UnitNosHoldTable, TestConfig.getInstance().getOBJWAITTIME());
		for (WebElement element : elements) {
			BaseTest.utilObj.get().getUIUtils().waitForSec(5);
			String text = element.getText();
			if (text.equals(no)) {
				System.out.println("text=" + text);
				System.out.println("no=" + no);
				System.out.println("we got unit no in Hold table");
				Assert.assertEquals(text, no);
			}
			else {
				Assert.fail();
			}
		}
	}

	public void addEntites(String role, String entity) {
		BaseTest.utilObj.get().getUIUtils().selectValue(Role_Drpdwn_Entites_Name, Role_Drpdwn_Entites, "Text", role);
		BaseTest.utilObj.get().getUIUtils().selectValue(Entity_Drpdwn_Entites_Name, Entity_Drpdwn_Entites, "Text",
				entity);
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_AddEntity_Name, SubmitBtn_AddEntity);
	}

	public void addUsers(String role, String entity, String user,String Designation, String address) {
		BaseTest.utilObj.get().getUIUtils().selectValue(Role_Drodwn_User_Name, Role_Drodwn_User, "Text", role);
		BaseTest.utilObj.get().getUIUtils().selectValue(Entity_Drpdwn_User_Name, Entity_Drpdwn_User, "Text", entity);
		BaseTest.utilObj.get().getUIUtils().selectValue(User_Drpdwn_User_Name, User_Drpdwn_User, "Text", user);
		BaseTest.utilObj.get().getUIUtils().inputText(user_Designation_name, user_Designation, Designation);
		BaseTest.utilObj.get().getUIUtils().inputText(Address_User_Name, Address_User, address);
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_User_Name, SubmitBtn_User);
	}
	
	public void addEntitiDeveloper(String entity, String user) {
		BaseTest.utilObj.get().getUIUtils().selectValue(Entity_AddEntityPriority_Name, Entity_AddEntityPriority, "Text",
				entity);
		BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(User_AddEntityPriority_Name,
				User_AddEntityPriority, user);
		BaseTest.utilObj.get().getUIUtils().clickElement(Submit_AddEntityPriority_Name, Submit_AddEntityPriority);
	}

	public void addEntityPriority(String entity, String typeofview, String user) {
		BaseTest.utilObj.get().getUIUtils().selectValue(Entity_AddEntityPriority_Name, Entity_AddEntityPriority, "Text",
				entity);
		BaseTest.utilObj.get().getUIUtils().selectValue(TypeOfStep_AddEntityPriority_Name, TypeOfStep_AddEntityPriority,
				"Text", typeofview);
		BaseTest.utilObj.get().getUIUtils().inputTextUsingActionClassClick(User_AddEntityPriority_Name,
				User_AddEntityPriority, user);
		BaseTest.utilObj.get().getUIUtils().clickElement(Submit_AddEntityPriority_Name, Submit_AddEntityPriority);
	}
	
	public By successMsgForApproveNoc=By.xpath("//div[text()='NOC authorize successfully']");
	public String successMsgForApproveNoc_Name="successMsgForApproveNoc";
	public void successMsgForApproveNoc() {
		String expectedText=BaseTest.utilObj.get().getUIUtils().getText(successMsgForApproveNoc_Name, successMsgForApproveNoc);
		String actualText="NOC authorize successfully";
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		if(expectedText.equals(actualText)) {
			Assert.assertTrue(true);
			System.out.println("actualText= "+actualText);
			System.out.println("expectedText= "+expectedText);
		}else {
			Assert.fail();
		}
	}
	
	
	
	public void selectValueFromFinalDecisionTable_ARH() throws IOException {
		if(xlUtil.getCellData("Sheet1", 1, 1).equals("Approve")) {
			BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTablePendingTable_Name,FinalDecisionTablePendingTable, "Text", xlUtil.getCellData("Sheet1", 1, 1));
		}
		else if(xlUtil.getCellData("Sheet1", 1, 1).equals("Reject")) {
			BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTablePendingTable_Name,FinalDecisionTablePendingTable, "Text", xlUtil.getCellData("Sheet1", 1, 1));
			BaseTest.utilObj.get().getUIUtils().waitForSec(3);
			BaseTest.utilObj.get().getUIUtils().inputText(Remarks_Name, Remarks, "testing");
		}
		else if(xlUtil.getCellData("Sheet1", 1, 1).equals("Hold")) {
			BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecisionTablePendingTable_Name,FinalDecisionTablePendingTable, "Text", xlUtil.getCellData("Sheet1", 1, 1));
			BaseTest.utilObj.get().getUIUtils().waitForSec(5);
			BaseTest.utilObj.get().getUIUtils().inputText(Remarks_Name, Remarks, "testing");
		}
	}
	
	//External Noc
	
	public By ExternalNoc = By.xpath("//span[text()='External Noc Request']");
	public String ExternalNoc_Name = "ExternalNoc";
	
	public void clickOnExternalNoc() {
		BaseTest.utilObj.get().getUIUtils().clickElement(ExternalNoc_Name, ExternalNoc);
	}
	
	public By UnitNoSearch = By.xpath("//input[@placeholder='Search Unit No']");
	public String UnitNoSearch_Name = "UnitNoSearch";
	
	public By unitNumbers_EC = By.xpath("//ul[@class='app-search dropdown-menu ng-star-inserted']//li//a//span");
	public String unitNumbers_EC_Name = "unitNumbers_EC";
	public void selectValueFromUnitNoSearchField() throws IOException {
		BaseTest.utilObj.get().getUIUtils().clickElement(UnitNoSearch_Name, UnitNoSearch);
		BaseTest.utilObj.get().getUIUtils().inputText(UnitNoSearch_Name, UnitNoSearch,
				xlUtil.getCellData("External NOC", 1, "Unit No_ExternalNoc"));
//		BaseTest.utilObj.get().getUIUtils().sendKeysWithKeys_ARROW_DOWN(UnitNoSearch_Name, UnitNoSearch);
//		BaseTest.utilObj.get().getUIUtils().sendKeysWithKeysEnter(UnitNoSearch_Name, UnitNoSearch);
		try {
			BaseTest.utilObj.get().getUIUtils().waitForSec(10);
			List<WebElement> listUnos = BaseTest.utilObj.get().getUIUtils().findElements(unitNumbers_EC_Name, unitNumbers_EC, "40");
			for(WebElement un : listUnos) {
				BaseTest.utilObj.get().getUIUtils().waitForSec(3);
				String text = un.getAttribute("title");
				if(text.equals(xlUtil.getCellData("External NOC", 1, "Unit No_ExternalNoc"))) {
					un.click();
				}
			}
		}catch(Exception e) {
			
		}
		
	}
	
	public By TypeOfNoc = By.xpath("//select[@name='typeOfNOC']");
	public String TypeOfNoc_Name = "TypeOfNoc";
	
	public void selectTypeOfNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().selectValue(TypeOfNoc_Name, TypeOfNoc, "Text", xlUtil.getCellData("External NOC", 1, "Type Of NOC"));
	}
	
	public By DateOfBooking = By.xpath("//input[@name='bookingdate']");
	public String DateOfBooking_Name = "DateOfBooking";
	public By CurrentDateOfBooking = By.xpath("//button[text()='Today']");
	public String CurrentDateOfBooking_Name = "CurrentDateOfBooking";
	
	public void selectDateOfBooking() {
		BaseTest.utilObj.get().getUIUtils().clickElement(DateOfBooking_Name, DateOfBooking);
		BaseTest.utilObj.get().getUIUtils().clickElement(CurrentDateOfBooking_Name, CurrentDateOfBooking);
	}
	
	
	
	public By NocIssuedOn = By.xpath("//input[@name='nocIssuedOnDate']");
	public String NocIssuedOn_Name = "NocIssuedOn";
	public By currentDate = By.xpath("//span[@class='ng-star-inserted current-date text-info']");
	public String currentDate_Name = "currentDate";
	
	public void selectNocIssuedDate() {
		BaseTest.utilObj.get().getUIUtils().clickElement(NocIssuedOn_Name, NocIssuedOn);
		BaseTest.utilObj.get().getUIUtils().clickElement(currentDate_Name, currentDate);
	}
	
	public By PurchaserName = By.xpath("//input[@name='purchasertext']");
	public String PurchaserName_Name = "PurchaserName";
	
	public void enterPurchaserName() {
		BaseTest.utilObj.get().getUIUtils().inputText(PurchaserName_Name, PurchaserName, "Ram");
	}
	
	public By PurchaserProfileText = By.xpath("//input[@name='purchaserprofiletext']");
	public String PurchaserProfileText_Name = "purchaserProfileText";
	
	public void enterPurchaserProfileText() {
		BaseTest.utilObj.get().getUIUtils().inputText(PurchaserProfileText_Name, PurchaserProfileText, "Purchaser Profile Text");
	}
	
	public By TotalPurchaseConsideration = By.xpath("//i[@class='app-icon fa fa-plus']/..");
	public String TotalPurchaseConsideration_Name = "TotalPurchaseConsideration";
	public By EditBtn_AgreementValue = By.xpath("(//label[text()='Agreement Value']//following::i[@class='app-icon wi wi-pencil ng-star-inserted'])[1]");
	public String EditBtn_AgreementValue_Name = "EditBtn_AgreementValue";
	public By AmountTextBox = By.xpath("//input[@placeholder='Enter the Amount']");
	public String AmountTextBox_Name = "AmountTextBox";
	public By SaveIcon = By.xpath("(//label[text()='Agreement Value']//following::i[@class='wi wi-done'])[1]");
	public String SaveIcon_Name = "SaveIcon";
	public By Submit_PurchaseConsideration = By.xpath("(//span[text()='Submit'])[2]");
	public String Submit_PurchaseConsideration_Name = "Submit_PurchaseConsideration";
	
	public void clickOnTotalPurchaseConsideration() throws IOException {
		BaseTest.utilObj.get().getUIUtils().clickElement(TotalPurchaseConsideration_Name, TotalPurchaseConsideration);
		BaseTest.utilObj.get().getUIUtils().clickElement(EditBtn_AgreementValue_Name, EditBtn_AgreementValue);
		BaseTest.utilObj.get().getUIUtils().waitForSec(10);
		BaseTest.utilObj.get().getUIUtils().inputText(AmountTextBox_Name, AmountTextBox, xlUtil.getCellData("External NOC", 1, "Total Amount"));
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().clickElement(SaveIcon_Name, SaveIcon);
		BaseTest.utilObj.get().getUIUtils().clickElement(Submit_PurchaseConsideration_Name, Submit_PurchaseConsideration);
	}
	
	public By PaymentReceivedTillDate = By.xpath("//input[@name='advancedpaymenttext']");
	public String PaymentReceivedTillDate_Name = "PaymentReceivedTillDate";
	
	public void enterPaymentReceivedTillDate() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputText(PaymentReceivedTillDate_Name, PaymentReceivedTillDate, xlUtil.getCellData("External NOC", 1, "Payment Received till Date"));
	}
	//xlUtil.getCellData("External NOC", 1, "Payment Received till Date")
	public By Financer = By.xpath("//input[@name='financertext']");
	public String Financer_Name = "Financer";
	
	public void enterFinancer() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		BaseTest.utilObj.get().getUIUtils().inputText(Financer_Name, Financer, xlUtil.getCellData("External NOC", 1, "Financer"));
	}
	
	public By Remarks_ENOC = By.xpath("//input[@name='remarktext']");
	public String Remarks_ENOC_Name = "Remarks_ENOC";
	
	public void enterRemarks_ENOC() {
		BaseTest.utilObj.get().getUIUtils().inputText(Remarks_ENOC_Name, Remarks_ENOC, "testing");
	}
	
	public By UploadBankStatement = By.xpath("//button[@title='Upload Bank Statement']");
	public String UploadBankStatement_Name = "UploadBankStatement";
	
	public void clickOnUploadBankStatementAndUploadPDFFile() {
		BaseTest.utilObj.get().getUIUtils().clickElement(UploadBankStatement_Name, UploadBankStatement);
		BaseTest.utilObj.get().getUIUtils().uploadFile("D:\\Truboard\\Apr_2022.pdf");
	}
	
	public By UploadLedger = By.xpath("//*[@caption='Upload ledger']//*[contains(@class,'sl-cloud-upload')]");
	public String UploadLedger_Name = "UploadLedger";
	
	public void clickOnUploadLedgerAndUploadXlsFile() {
		BaseTest.utilObj.get().getUIUtils().moveToElement(UploadLedger_Name, UploadLedger);
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		BaseTest.utilObj.get().getUIUtils().clickElementUsingAction(UploadLedger_Name, UploadLedger);
		BaseTest.utilObj.get().getUIUtils().waitForSec(4);
		BaseTest.utilObj.get().getUIUtils().uploadFile("D:\\Truboard\\Customer_ABC.xls");
	}
	
	public By VerifyPayment = By.xpath("//button[@title='Verify Payment']");
	public String VerifyPayment_Name = "VerifyPayment";
	
	public static boolean getPaymentVerfiedStatusAtLeastOneRow() {
		// TODO Auto-generated method stub
		return false;
	}
	public void clickOnVerifyPayment() {
		BaseTest.utilObj.get().getUIUtils().clickElement(VerifyPayment_Name, VerifyPayment);
		boolean paymentVerfied = PMC_Page.getPaymentVerfiedStatusAtLeastOneRow();
	}
	
	public By UploadNocIcon = By.xpath("(//input[@class='file-input'])[2]/..");
	public String UploadNocIcon_Name = "UploadNocIcon";
	
	public void clickOnUploadNocIcon() {
		BaseTest.utilObj.get().getUIUtils().clickElement(UploadNocIcon_Name, UploadNocIcon);
		BaseTest.utilObj.get().getUIUtils().waitForSec(4);
		BaseTest.utilObj.get().getUIUtils().uploadFile("D:\\Truboard\\Apr_2022.pdf");
	}
	
	public By Submit_ExternalNoc = By.xpath("//span[text()='Submit']");
	public String Submit_ExternalNoc_Name = "Submit_ExternalNoc";
	
	public void clickOnSubmit_ExternalNoc() {
		BaseTest.utilObj.get().getUIUtils().clickElement(Submit_ExternalNoc_Name, Submit_ExternalNoc);
	}
	
	public By YesBtn_ExternalNoc = By.xpath("//span[text()='YES']");
	public String YesBtn_ExternalNoc_Name = "YesBtn_ExternalNoc";
	
	public void YesBtn_ExternalNoc_AlertPopup() {
		BaseTest.utilObj.get().getUIUtils().clickElement(YesBtn_ExternalNoc_Name, YesBtn_ExternalNoc);
	}
	
	public By successMsg_ExternalNoc = By.xpath("//div[text()='Noc request sent successfully']");
	public String successMsg_ExternalNoc_Name = "successMsg_ExternalNoc";
	
	public void verifySuccessMsg_ExternalNoc() {
		Assert.assertTrue(BaseTest.utilObj.get().getUIUtils().isDisplayed(successMsg_ExternalNoc));
	}
	
	//Final Noc
	
	// Approved Noc's table
	public By SelectFieldApprovedTable = By.xpath("(//select[@name='wm-datatable'])[3]");
	public String SelectFieldApprovedTable_Name = "SelectFieldPendingTable";

	public void selectValueFromeSelectFieldApprovedTable_FinalNoc() {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().selectValue(SelectFieldApprovedTable_Name, SelectFieldApprovedTable, "Text",
				TestConfig.getInstance().getSearchFieldApprovedTable());
	}

	public By SearchApprovedTable = By.xpath("(//input[@placeholder='Search'])[3]");
	public String SearchApprovedTable_Name = "SearchPendingTable";

	public void enterValueInSearchApprovedTable_FinalNoc() throws IOException {
		BaseTest.utilObj.get().getUIUtils().waitForSec(5);
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(SearchApprovedTable_Name, SearchApprovedTable,
				xlUtil.getCellData("Final Noc", 1, "Unit Number Final_Noc"), Keys.ENTER);
	}
	
	public By DPNBtn = By.xpath("//button[@class='btn app-button btn-transparent' and @show='true']");
	public String DPNBtn_Name = "DPNBtn";
	
	public void clickOnDPNBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(DPNBtn_Name, DPNBtn);
	}
	
	public By FinalDecision_PaymentVerifi_Popup = By.xpath("//select[@name='paymentdescisionselect']");
	public String FinalDecision_PaymentVerifi_Popup_Name = "FinalDecision_PaymentVerifi_Popup";
	
	public void selectFinalDecision() {
		//BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		//BaseTest.utilObj.get().getUIUtils().clickElement(FinalDecision_PaymentVerifi_Popup_Name, FinalDecision_PaymentVerifi_Popup);
		BaseTest.utilObj.get().getUIUtils().selectValue(FinalDecision_PaymentVerifi_Popup_Name, FinalDecision_PaymentVerifi_Popup, "Text", "Approve");
	}
	
	public By Remarks_PaymentVerifi_Popup =By.xpath("//input[@placeholder='Enter your remark']");
	public String Remarks_PaymentVerifi_Popup_Name = "Remarks_PaymentVerifi_Popup";
	
	public void enterRemarks_PaymentVerifi_Popup() {
		BaseTest.utilObj.get().getUIUtils().inputText(Remarks_PaymentVerifi_Popup_Name, Remarks_PaymentVerifi_Popup, "Testing");
	}
	
	public By SubmitBtn_PaymentVerifi_Popup =By.xpath("//span[text()='Submit']");
	public String SubmitBtn_PaymentVerifi_Popup_Name = "SubmitBtn__PaymentVerifi_Popup";
	
	public void clickOnSubmitBtn_PaymentVerifi_Popup() {
		BaseTest.utilObj.get().getUIUtils().clickElement(SubmitBtn_PaymentVerifi_Popup_Name, SubmitBtn_PaymentVerifi_Popup);
	}
	
	
//	After Modifing development Scripts
	
	public By projectBtn = By.xpath("//label[text()='Projects']");
	public By projectDD = By.xpath("//div[@name='table3']//select[@name='wm-datatable']");
	public By projectSearchBox = By.xpath("//div[@name='table3']//input[@type='text' and @placeholder='Search']");
	public By project = By.xpath("//div[@name='table3']//table[@class='table table-hover table-condensed']//td[text()='TestPerform 2']");
	public By setupBtn = By.xpath("//span[text()='Setup']");
	public By updateBtn = By.xpath("//span[text()='Setup']//following::span[text()='Update']");
	public By nocSetupBtn = By.xpath("//span[text()='NOC Setup']");
	
	
	public String projectBtn_name = "ProjectBtnClicking";
	public String projectDD_name = "Select Project name";
	public String projectSearchBox_name = "Enter value search box";
	public String projectnamerow =  "clicking project rowname";
	public String setupBtn_name = "setup Btn Clicking";
	public String updateBtn_name = "update Btn Clicking";
	public String nocSetupBtn_name = "noc setup btn Clicking";

	
	
	public void clickOnProjectBtn() {
		BaseTest.utilObj.get().getUIUtils().clickElement(projectBtn_name, projectBtn);
	}
	
	public void selectDropDownList() throws IOException {
		BaseTest.utilObj.get().getUIUtils().selectValue(projectDD_name, projectDD, "text", xlUtil.getCellData("Developer", 1, "projectdropdown"));
	}
	
	public void enterSearchBoxField() throws IOException {
		BaseTest.utilObj.get().getUIUtils().inputTextwithKeys(projectSearchBox_name, projectSearchBox,  xlUtil.getCellData("Sheet1", 1, "Project Name"), Keys.ENTER);
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
