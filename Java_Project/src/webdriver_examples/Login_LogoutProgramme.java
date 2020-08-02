package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_LogoutProgramme {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}
