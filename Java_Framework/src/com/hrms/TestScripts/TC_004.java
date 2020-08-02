package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_004 {
	@Test
	public void login() throws Exception  {
        
		DOMConfigurator.configure("log4j.xml");
		General g= new General();
		g.openApplication();
		g.Login();
		g.Add_btn();
		g.logout();
		g.close();
	}

}
