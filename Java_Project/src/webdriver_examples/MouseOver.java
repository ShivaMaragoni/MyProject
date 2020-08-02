package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

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
	     //Actions
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		WebElement PIM= driver.findElement(By.linkText("PIM"));
		WebElement Leave=driver.findElement(By.linkText("Leave"));
		WebElement Perfomance= driver.findElement(By.linkText("Performance"));
		
		act.moveToElement(PIM).moveToElement(Leave).moveToElement(Perfomance).click().build().perform();
		
		System.out.println("All are Perform");
		
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout confirm");
		driver.close();
	
	}

	}


