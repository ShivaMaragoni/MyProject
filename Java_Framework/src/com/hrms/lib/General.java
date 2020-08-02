package com.hrms.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.utility.Log;

import org.openqa.selenium.Alert;


public class General extends Global
{
	public void openApplication() throws Exception
	{ 
		Log.info("******started execution*******");
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Log.info("Application is opened");
		Log.info("log4j_opened");
		System.out.println(driver.getTitle());
		}
	public void Login() throws Exception {
		Thread.sleep(3000);
		Log.info("login confirm");
		driver.findElement(By.name(txt_name)).sendKeys(un);
		driver.findElement(By.name(txt_pwd)).sendKeys(pwd);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login succcess");
		Log.info("log4j_login");
		
	}
	public void Title() {
		driver.getTitle().matches(title);
		System.out.println("Title is matched");
		System.out.println("*******************");
		Log.info("log4j_Title");
	}
	public void Text() {
		WebDriverWait wt= new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Text)));
		System.out.println("confirm explicit wait");
		driver.findElement(By.xpath(Text)).getText();
		System.out.println("Text is matched");
		Log.info("logj_Text");
	}
	
	public void Add_btn() throws Exception {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath(add_btn)).click();
		System.out.println("Add button is attempt");
		Log.info("log4j_Add button");
	}
	public void add_emp1() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name(add_emp1)).sendKeys(emp1);
		driver.findElement(By.name(add_emplname)).sendKeys(emp_lname);
	driver.findElement(By.id(save_btn)).click();
		System.out.println("adding new emp");
		Log.info("log4j_Add employee");
		driver.switchTo().defaultContent();
	}
	public void delete_btn() throws Exception {
     	Thread.sleep(3000);
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath(dlt_clck)).click();
		driver.findElement(By.xpath(dlt_btn)).click();
		driver.switchTo().defaultContent();
		System.out.println("Delete successfully");
		Log.info("log4j_delete employee");
	}
	public void Back_btn() throws Exception{
		Thread.sleep(3000);
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath(back)).click();
		Log.info("log4j_back button");
		driver.switchTo().defaultContent();
	}
	public void MouseOver() throws Exception {
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement Retmnt=driver.findElement(By.linkText(Recrtmnt));
		WebElement bnft=driver.findElement(By.linkText(Bnfts));
		act.moveToElement(bnft).moveToElement(Retmnt).click().build().perform();
		System.out.println("perform MOver Completed");
		Log.info("log4j_MouseOver");
			}
	
	public void Search() throws Exception {
		Thread.sleep(3000);
		driver.switchTo().frame(Frame);
		Select obj=new Select(driver.findElement(By.name(srch)));
		obj.selectByIndex(2);
		driver.switchTo().defaultContent();
		System.out.println("search successfully");
		Log.info("log4j_Search");
	}
	public void Alert() throws Exception {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.getText();
		
	}
//	public void Add_btn2() throws Exception {
//		Thread.sleep(3000);
//		driver.switchTo().frame(Frame);
//		driver.findElement(By.xpath(add_btn2)).click();
//	}
//	public void add_emp2() throws Exception {
//		Thread.sleep(3000);
//		driver.findElement(By.name(add_emp2)).sendKeys(emp2);
//		driver.findElement(By.name(add_emplname2)).sendKeys(emp_lname2);
//		driver.findElement(By.id(save_btn)).click();
//		System.out.println("adding new emp2");
//	}
	public void logout() {
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText(lnk_logout)).click();
		System.out.println("Logout successfull");
		Log.info("logout confirm");
	}
	public void close() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		Log.info("Application is closed");
		Log.info("****End execution*****");
	}

}
