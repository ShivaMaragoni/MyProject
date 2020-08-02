package webdriver_examples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read {

	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(3000);
		FileInputStream fi=new FileInputStream("D:\\Excel_Read.xls");
		Workbook wbook=Workbook.getWorkbook(fi);
		Sheet sh=wbook.getSheet(0);
	  	
		System.out.println(sh.getName());
		int i=2;
	    String empid=sh.getCell(0,i).getContents();
	    String name=sh.getCell(1, i).getContents();
	    String sal=sh.getCell(2, i).getContents();
	    System.out.println(empid);
	    System.out.println(name);
	    System.out.println(sal);
	    
	    //for loop
	    int rows=sh.getRows();
	    for (int j = 1; j <rows; j++) {
	    	String empId=sh.getCell(0, j).getContents();
	    	String Name=sh.getCell(1, j).getContents();
	    	String Sal=sh.getCell(2, j).getContents();
	    	System.out.println(empId);
	    	System.out.println(Name);
	    	System.out.println(Sal);
	    	System.out.println(rows);
	    	
			
		}
		
			
		
	}

}
