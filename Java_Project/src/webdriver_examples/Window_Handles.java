package webdriver_examples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Downloads/microsoft.microsoftskydrive_8wekyb3d8bbwe!App/Downloads/multiplewindows.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.id("btn1")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		
		//Window Handles
		Thread.sleep(3000);
		ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(0));
		driver.quit();
	}

}
