package browser_package;

public class Data_Bind {
	
	private String name="shiva";
	private int age=22;

	public void talk() {
		System.out.println("Hello,I am "+name);
		System.out.println("My age is "+age);
	}
	public static void main(String[] args) 
	{
		Data_Bind obj=new Data_Bind();
		obj.talk();
		

	}

}
