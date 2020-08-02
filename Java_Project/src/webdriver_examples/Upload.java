package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");

		//verify
		assert(driver.getTitle().matches("OrangeHRM-New Level of HR Management"));
		System.out.println("title is matched");
//	     String title=driver.getTitle();
//	     if (title.equals(title)) 
//	     { 
//	    	 System.out.println("title matched");
//			
//		} else {
//			System.out.println("title is not matched");

//		}
	     //Implicit Wait
	     driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		System.out.println("Add is success");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("shiva");
		//Explicit Wait
		WebDriverWait wt= new WebDriverWait(driver,10);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtEmpLastName")));
		System.out.println("confirm Explicit Wait");
		
	     driver.findElement(By.id("txtEmpLastName")).sendKeys("Maragoni");
		
		//Upload 
		Thread.sleep(3000);
		WebElement fileinput=driver.findElement(By.name("photofile"));
		Actions act=new Actions(driver);
		act.click(fileinput).build().perform();
		act.sendKeys("‪‪D:\\Downloads\\2754.jpg");
		System.out.println("upload successfully");
		
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("save successfull");

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

	
			}


