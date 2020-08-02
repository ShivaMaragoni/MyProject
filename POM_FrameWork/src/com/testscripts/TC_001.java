package com.testscripts;

import org.testng.annotations.Test;
import com.pages.LoginPage;
import utility.BaseClass;

public class TC_001 {
	@Test
	public static void tc_001() {
		BaseClass.OpenApplication();
		LoginPage.login("admin"," admin");
		BaseClass.CloseApplicaton();
		
	}
	

}
