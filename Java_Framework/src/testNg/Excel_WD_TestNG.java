package testNg;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_WD_TestNG {
	WebDriver driver;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void Excel_read() throws Exception {
		FileInputStream fi=new FileInputStream("D:\\un_pwd.xls");
		Workbook wbook=Workbook.getWorkbook(fi);
		Sheet sh=wbook.getSheet(0);
		String un=sh.getCell(0, 1).getContents();
		String pwd=sh.getCell(1,1).getContents();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login Succesfull");
		System.out.println("Login Succesfull");
	}
	@AfterClass
	public void teardown() {
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("logout successfull");
		System.out.println("logout successfull");
		driver.close();
	}

}
