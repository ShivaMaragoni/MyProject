package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Downloads/microsoft.microsoftskydrive_8wekyb3d8bbwe!App/Downloads/WebTable.html");
		driver.manage().window().maximize();

		//Count Details
		int row =driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col =driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int rowcol=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(rowcol);
		
		//to get data from particular cell
		String data=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[5]/td[2]")).getText();
		System.out.println(data);
		
		//get data from all fields
		for (int i = 1; i <=row; i++) 
		{
			String data1=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data1);
		
		}
//		driver.close();
	}

}
