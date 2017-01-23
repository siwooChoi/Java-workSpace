package SyokikaBlock;


abstract class options {
	final String test_type1 = "한번 정의되면!!  그 뒤로 바꿀 수 없다. = final";
	String test_type2 = "isNull";
	
	static int testInt1 = 10;
	int testInt2 = 20;
	
	
	abstract void csMethod();
}


class terran extends options{
	{
//		this.test_type1 = "초기화블럭으로 초기화 했음. this is terran";	// 얘는 final. 수정 불가
		System.out.println(this.test_type1 + "초기화블럭에서 변경은 안되지만, 출력(접근)은 가능하다.");
		
		this.test_type2 = "초기화블럭으로 초기화 했음. this is terran";	// 얘는 final이 아님
	}
	

	
	final String thisIsFinalString;	// final인데, 아래 생성자에서 초기화 할 것임.
	//생성자
	terran() {
		
		thisIsFinalString = "생성자로 초기화 했음. ";
	}
	
		void csMethod(){
			System.out.println("추상메서드를 상속받아서 채워넣었음");
		}
}

class protoss extends options{
	
	
	
	void csMethod(){
		System.out.println("이걸 안만들면 추상메서드 구현이 안되서, 에러 남!~");
	}
		
	
}

public class player {
	public static void main(String [] args){
		
		terran t = new terran();
		terran t2 = new terran();
		
		t.test_type2 = "terran";		// 상속 받아서 사용 가능.
		System.out.println(t.test_type1);
		System.out.println(t.test_type2);
		
		protoss p = new protoss();

		t.testInt1 = 50;		// 옵션을 상속받는 t, p.  옵션에서 static testInt1. 		
		System.out.println(p.testInt1);	// static이기 때문에 50이 출력되 됩니다.
		
		
		
	}
}
