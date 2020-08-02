package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_Drop {
	
	WebDriver driver;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	public void testDragandDrop() throws Exception {
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(10000);
//		assertEquals("Droppable | jQuery UI", driver.getTitle());
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(3000);
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
