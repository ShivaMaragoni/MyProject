package testNg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenShot {


	WebDriver driver;
	@BeforeClass
	public void Startup() {
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	public void Login() throws Exception {
		try {
			Thread.sleep(3000);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Reporter.log("App is Open");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login Completed");
		
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpFirstNam")).sendKeys("shiva");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Maragoni");
		driver.switchTo().defaultContent();
		Reporter.log("Add emp is Added");
		} 
		catch (Exception e) {
			File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fi, new File("D:\\TestResults.png"));
		}
}
	@AfterClass
	public void teardown() {
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		Reporter.log("Logout successfully");
	}

}
