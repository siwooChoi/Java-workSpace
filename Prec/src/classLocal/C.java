package classLocal;

//class D{
//	
//	static D myInstance = new D();
//	static int instanceCount = 0;
//	
//	
//	private D(){
//		instanceCount++;
//		System.out.println("d ����");
//	}
//	
//	static D getItc(){
//		if(myInstance == null)
//			return myInstance = new D();
//		return myInstance;
//	}
//}

public class C extends B{
	
	void printS(){
		System.out.println("CŬ���� ���� �޼���");
	}
	
	void pasnal_Print_C(){
		System.out.println("�������̵� ���� ���� ������ �޼��� C");
	}
	
	public static void main(String [] args){
		
		B bb = new B();
		
		
	}
}

