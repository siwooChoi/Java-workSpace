package ObjArrayTest;

public class Tv {
	boolean power;
	String color;
	int chanel;		// 멤버변수
	
	static String imclass_Var = "클래스변수"; 
	
	public String printVar(){
		
		String maybe_local_var = "아마도 지역변수 일텐데";
		
		return maybe_local_var;
		
	}
	
	public void printVar2(){
		
		String maybe_local_var = "아마도 지역변수 일텐데";
		
		System.out.println(maybe_local_var);
		
	}
	
	Tv() {};
	
	Tv(boolean argPower, String argColor, int argChanel){
		this.power = argPower;
		this.color = argColor;
		this.chanel = argChanel;
	}
	
	// 얘네 만들어놓고 안썼네ㅋㅋㅋ
//	void onOff_power(){
//		this.power = !this.power;
//		System.out.println("현재 전원의 상태는 " + this.power + " 입니다.");
//	}
//	
//	void chanelUp() {
//		this.chanel++;
//	}
//	
//	void chanelDown() {
//		this.chanel--;
//	}
	
	void printTv(){
		System.out.println("전원은 " + this.power + "상태 , "
							+ "색상은 " + this.color + " 이고 ,"
							+ "현재 채널은 " + this.chanel + "인 Tv입니다.");
	}
	
	
}
