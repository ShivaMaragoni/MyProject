package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global 
{
	//Test data/Variables
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pwd="admin";
	public String emp1="shiva";
	public String emp_lname="kumar";
	public String emp2="naveen";
	public String emp_lname2="maragoni";
	public String title="Orange- New Level Of HR Management";
	public String s_name="shiva kumar";

	//Objects
	public String txt_name="txtUserName";
	public String txt_pwd="txtPassword";
	public String btn_login="Submit";
	public String lnk_logout="Logout";
	public String add_btn="//input[@value='Add']";
	public String add_emp1="txtEmpFirstName";
	public String add_emplname="txtEmpLastName";
	public String save_btn="btnEdit";
	public String dlt_clck="//input[@value='0037']";
	public String dlt_btn="//input[@value='Delete']";
	public String back="//input[@value='Back']";
	public String Recrtmnt="Recruitment";
	public String srch="loc_code";
//	public String srh_btn="//input[@value='Search']";
	public String Bnfts="Benefits";
//	public String add_btn2="//input[@value='Add']";
//	public String add_emp2="txtEmpFirstName";
//	public String add_emplname2="txtEmpLastName";
//	public String save_btn="btnEdit";
	public String Frame="rightMenu";
	public String Text="//ul[@id='option-menu']/li";
	
}
