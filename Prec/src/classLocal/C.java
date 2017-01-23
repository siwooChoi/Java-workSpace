package classLocal;

//class D{
//	
//	static D myInstance = new D();
//	static int instanceCount = 0;
//	
//	
//	private D(){
//		instanceCount++;
//		System.out.println("d 생성");
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
		System.out.println("C클래스 안의 메서드");
	}
	
	void pasnal_Print_C(){
		System.out.println("오버라이딩 하지 않은 각각의 메서드 C");
	}
	
	public static void main(String [] args){
		
		B bb = new B();
		
		
	}
}

