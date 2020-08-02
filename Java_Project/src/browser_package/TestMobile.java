package browser_package;

abstract class Mobile {

	   abstract void Call();
	   abstract void Msg();

	   class MI extends Mobile{
		public void Call() {
			   System.out.println("Call from MI");
		   }
		public void Msg() {
			   System.out.println("Msg from MI");
		   }
		class VIVO extends Mobile{
		public void Call() {
				System.out.println("Call from VIVO");
			}
		public void Msg () {
				System.out.println("Msg from VIVO");
			}
			
		public class TestMobile{
//		public static void main(String args[]) 
			{
				MI h=new MI();
				h.Call();
				h.Msg();
				
				VIVO i = new VIVO();
				i.Call();
				i.Msg();
			}
		}
		}
	   }
	   
   }