package innerClassEx;

public class A{
	   int numEx1 = 500;
	   static int snumEx1 = 300;

	   class B{
		   void prt1(){
				System.out.println(numEx1);
			}
	   }
	   
	   static class C {
		void prt2(){
			System.out.println(snumEx1);
		}
	   }
	   
	   Object CreateOf_B_Obj(){
		   return new B();
	   }

	   
	   public static void main(String[] args){
		   A a = new A();
		   
		   B b = (B)a.CreateOf_B_Obj();
		   
		   b.prt1();
		   
		   A.C ccc = new A.C();
		   ccc.prt2();
		   
	   }
}
