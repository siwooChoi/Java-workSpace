package singleTone;


class singleToneEx{
	
	static private singleToneEx myObject;		// �������� 
	
	
	// private�� ������ _ �ٸ� Ŭ�������� new�� �����ϰų�, ��ӵ� �� �� ����. 
	
	
	static singleToneEx getMyObj(){
		if(myObject == null){		
			myObject =new singleToneEx();
		}
		return myObject;
		
	}
	
	private singleToneEx() {
		
	}
	
}

class Ex2{
	int a1 = 20;
	int test0 = 100;
}

class Ex3 extends Ex2{
	int a1 = 30;
	int test1 = 1;
	int test2 = 2;
	
}


class single {
	public static void main(String [] args){
		singleToneEx var1 = singleToneEx.getMyObj();
		
		Ex2 ex = new Ex3();
		Ex2 exex = new Ex2();    
		
		System.out.println(ex.a1);		
		System.out.println(ex.test0);	
		System.out.println(((Ex3)ex).test2);
		
		
		
	}
}



