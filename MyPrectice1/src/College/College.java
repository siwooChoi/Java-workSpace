package College;

class College {
	{
		System.out.println("�̰��� College �� �ʱ�ȭ�� (A) " );
	}
	String Name = "College class";
	String key = "A";
	
	
	public College() {
		System.out.println("�̰��� ������ : " + this.key);
	}
	
	void prtName(){
		System.out.println("�̰��� �޼��� prtName()  : " + this.key);
	}
	
}


class YeungjinCollege extends College {
	{
		System.out.println("�̰��� YeungjinCollege �� �ʱ�ȭ��  (B)" );
	}
	String Name = "YeungjinCollege class";
	String key = "B";
	
	public YeungjinCollege() {
		System.out.println("�̰��� ������ : " + this.key);
	}
	
	
	void prtName(){
		super.prtName();
		System.out.println("�̰��� �޼��� prtName()  : " + this.key);
	}
}

class ComputerInfo extends YeungjinCollege{
	{
		System.out.println("�̰��� ComputerInfo �� �ʱ�ȭ�� (c)" );
	}
	String Name = "ComputerInfo";
	String key = "C";
	
	public ComputerInfo() {
		System.out.println("�̰��� ������ : " + this.key);
	}
	
	void prtName(){
		super.prtName();
		System.out.println("�̰��� �޼��� prtName()  : " + this.key);
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
//		System.out.println(((College)this).Name);	// ����(super)�� ����(super) ȣ���ϱ�.
//	}
}


