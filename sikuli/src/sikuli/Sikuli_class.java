package sikuli;

import org.sikuli.script.Screen;

public class Sikuli_class 
{

	public static void main(String args[]) throws Exception {
		
		Screen obj=new Screen();
		
//		Pattern img=new Pattern("‪D:\\open browser.PNG");
//		Pattern img1=new Pattern("D:\\open youtube.PNG‪");
		
		obj.doubleClick("D:\\open browser.PNG");
		obj.click("D:\\open youtube.PNG");
	}
}
