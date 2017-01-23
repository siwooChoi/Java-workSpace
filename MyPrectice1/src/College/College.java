package College;

class College {
	{
		System.out.println("이것은 College 의 초기화블럭 (A) " );
	}
	String Name = "College class";
	String key = "A";
	
	
	public College() {
		System.out.println("이것은 생성자 : " + this.key);
	}
	
	void prtName(){
		System.out.println("이것은 메서드 prtName()  : " + this.key);
	}
	
}


class YeungjinCollege extends College {
	{
		System.out.println("이것은 YeungjinCollege 의 초기화블럭  (B)" );
	}
	String Name = "YeungjinCollege class";
	String key = "B";
	
	public YeungjinCollege() {
		System.out.println("이것은 생성자 : " + this.key);
	}
	
	
	void prtName(){
		super.prtName();
		System.out.println("이것은 메서드 prtName()  : " + this.key);
	}
}

class ComputerInfo extends YeungjinCollege{
	{
		System.out.println("이것은 ComputerInfo 의 초기화블럭 (c)" );
	}
	String Name = "ComputerInfo";
	String key = "C";
	
	public ComputerInfo() {
		System.out.println("이것은 생성자 : " + this.key);
	}
	
	void prtName(){
		super.prtName();
		System.out.println("이것은 메서드 prtName()  : " + this.key);
	}
	
	
//	void printName(){
//		System.out.println(Name);
//	}
//	
//	void SupuerprintName(){
//		System.out.println(super.Name);
//	}
//	
//	void D_SuperprintName(){
//		System.out.println(((College)this).Name);	// 상위(super)의 상위(super) 호출하기.
//	}
}


