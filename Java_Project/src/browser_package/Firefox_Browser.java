package browser_package;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser {

	public static void main(String[] args) 
	{
		
				System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://www.gmail.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("identifierId")).sendKeys("shiva maragoni");
				
				
				

			}

		}

	
