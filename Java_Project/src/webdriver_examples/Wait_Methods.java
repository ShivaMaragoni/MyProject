package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Methods {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login Completed");

		//verify
	     String title=driver.getTitle();
	     if (title.equals(title)) 
	     { 
	    	 System.out.println("title matched");
			
		} else {
			System.out.println("title is not matched");

		}
	     //Implicit Wait
	     driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		System.out.println("Add is success");
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("shiva");
		//Explicit Wait
		WebDriverWait wt= new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		System.out.println("confirm Explicit Wait");
		driver.findElement(By.id("lastName")).sendKeys("Maragoni");
		
		driver.findElement(By.id("btnSave")).click();
		System.out.println("save successfull");
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout confirm");
		driver.close();


	}

}
