package NesedClass;

class A{
	int value = 18;
	
	class B {
		
		class C{
			class D{
				void valueDown(){
					value--;
					System.out.println("��");
				}
			}
			
		}
		
		void increaseValue(){
			value++;
		}
	}
}

public class Q50 {
	public static void main(String[] args){
		
	
	A varA = new A();
	System.out.println(varA.value);
	
	A.B varB1 = varA.new B();
	varB1.increaseValue();
	System.out.println(varA.value);

	A.B.C.D varD1 = varB1.new C().new D();
	varD1.valueDown();
	
	A.B.C.D varD2 = varB1.new C().new D();
	varD2.valueDown();
	
	A.B varB2 = varA.new B();
	varB2.increaseValue();
	System.out.println(varA.value);
	
	A.B varB3= varA.new B();
	varB3.increaseValue();
	System.out.println(varA.value);
	
	
	
	}
}
