package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	
	   
		@Test
		public void login() throws Exception {
	    General g=new General();
	    g.openApplication();
	    g.Login();
	    g.Add_btn();
		g.add_emp1();
	    g.logout();
	    g.close();
		
	}
	
	}


