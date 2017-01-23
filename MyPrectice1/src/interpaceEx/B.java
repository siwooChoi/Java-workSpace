package interpaceEx;

public class B extends A implements L2_Interface {
	
	public void base(){};
	public void mL1A(){};
	public void mL1B(){};
	public void mL2(){};
	
	
	public static void main(String [] args){
		
		
		baseInterface base_objB = new B();
		L1_A_Interface l1_a_objB = new B();
		L1_B_Interface l1_b_objB = new B();
		L2_Interface l2_objB = new B();
		B objB = new B();
		
		System.out.println(base_objB.a);
		System.out.println(l1_a_objB.a);
		System.out.println(l1_b_objB.a);
		System.out.println(l2_objB.a);
		System.out.println(objB.a);
		
		
		

	}
}
