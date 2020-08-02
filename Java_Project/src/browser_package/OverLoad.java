package browser_package;

public class OverLoad {

	public void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add (int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	public void substract(int a,int b,int c,int d) {
		System.out.println(a+b-c-d);
	}
	public static void main(String[] args) 
	{
		OverLoad obj= new OverLoad();
		obj.add(13, 16);
		obj.add(13, 16, 18);
		obj.add(13, 16, 18, 17);
		obj.substract(10098, 434, 498, 231);

	}

}
