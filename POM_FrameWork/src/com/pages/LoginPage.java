package com.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import utility.BaseClass;

public class LoginPage extends BaseClass {
	//Objects
	static By txt_un=By.name("txtUserName");
	static By txt_pwd=By.xpath("//input[@name='txtPassword']");
	static By sbmt=By.name("Submit");
	
	//fun
	public static void login(String username,String password) {
		driver.findElement(txt_un).sendKeys(username);
		driver.findElement(txt_pwd).sendKeys(password);
		driver.findElement(sbmt).click();
		Reporter.log("login completed");
	}

}
