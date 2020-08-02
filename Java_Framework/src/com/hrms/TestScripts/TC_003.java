package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_003 {

	@Test
	public void Run() throws Exception
	{
		General g=new General();
		g.openApplication();
		g.Login();
		g.Title();
		g.Text();
//		g.Add_btn();
//		g.add_emp1();
//		g.Back_btn();
//		g.delete_btn();
		g.MouseOver();
		g.Search();
//		g.Alert();
//		g.Add_btn();
//		g.add_emp1();
//		g.Back_btn();
		g.logout();
		g.close();



	}

}
