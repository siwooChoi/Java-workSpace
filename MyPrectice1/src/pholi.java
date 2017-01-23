
class A{
	int value = 10;
	int testNum1 = 50;
}


class B extends A {
	int value = 20;
	int testNum2 = 100;
}


       

public class pholi {
	public static void main(String[] args){
		
		 A object_a = new B();
		    System.out.println(object_a.value);	// 부모 참조변수 = new 자식();
		    									// 부모 호출됨.
		    System.out.println(object_a.testNum1);
		    
		
	}

}


