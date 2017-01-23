package exceptionPrec;
class A{
	void L1() throws Exception{
		L2();
	}
	
	void L2() throws Exception{
		L3();
	}
	
	void L3() throws Exception{
//		RuntimeException e = new RuntimeException("Exception Test!");
		Exception e = new Exception("Exception Test!");
		
		System.out.println("1");
		
		throw e;
	}
}


public class MainClass {
	public static void main(String [] args){
		
		A a = new A();
		
		
	}

}
