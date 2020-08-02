package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Highlight {

	  WebDriver driver;
      @BeforeTest
      public void setup() throws Exception
      {
                  System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");   
                  driver = new ChromeDriver();
                 
                  driver.manage().window().maximize();
                 
                  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                  driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
      }
//      @AfterTest
//      public void tearDown() throws Exception
//      {
//                  driver.quit();
 //     }
      @Test
      public void Text() throws InterruptedException
      {
                  //To handle unexpected alert on page load.
                  try
                  {
                              driver.switchTo().alert().dismiss();
                  }
                  catch(Exception e)
                  {
                              System.out.println("unexpected alert not present");
                  }
                  HighlightMyElement( driver.findElement(By.name("txtUserName")));
                  driver.findElement(By.name("txtUserName")).sendKeys("admin");
                  HighlightMyElement( driver.findElement(By.name("txtPassword")));
                  driver.findElement(By.name("txtPassword")).sendKeys("admin");
                  driver.findElement(By.name("Submit")).click();
                  
      }
     
      public void HighlightMyElement(WebElement element) {
                  for (int i = 0; i < 10; i++) {
                              JavascriptExecutor js = (JavascriptExecutor) driver;
                              js.executeScript(
                                                      "arguments[0].setAttribute('style', arguments[1]);",
                                                      element, "color: red; border: 3px solid yellow;");
                              js.executeScript(
                                                      "arguments[0].setAttribute('style', arguments[1]);",
                                                      element, "");
                  }
      }

}
