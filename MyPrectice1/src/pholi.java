
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
		    System.out.println(object_a.value);	// �θ� �������� = new �ڽ�();
		    									// �θ� ȣ���.
		    System.out.println(object_a.testNum1);
		    
		
	}

}


