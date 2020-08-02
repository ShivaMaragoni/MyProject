package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_class {
	
	WebDriver driver;
	@Test(priority = 0)
	public void Startup() {
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test(priority = 1)
	public void Login() throws Exception {
		Thread.sleep(3000);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Reporter.log("App is Open");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login Completed");
		}
	@Test(priority = 2)
	public void Add_emp() throws Exception {
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("shiva");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Maragoni");
		driver.switchTo().defaultContent();
		Reporter.log("Add emp is Added");
	}
	@Test(priority = 3)
	public void teardown() {
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		Reporter.log("Logout successfully");
	}

}
