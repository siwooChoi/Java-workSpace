package ObjArrayTest;

public class Tv {
	boolean power;
	String color;
	int chanel;		// �������
	
	static String imclass_Var = "Ŭ��������"; 
	
	public String printVar(){
		
		String maybe_local_var = "�Ƹ��� �������� ���ٵ�";
		
		return maybe_local_var;
		
	}
	
	public void printVar2(){
		
		String maybe_local_var = "�Ƹ��� �������� ���ٵ�";
		
		System.out.println(maybe_local_var);
		
	}
	
	Tv() {};
	
	Tv(boolean argPower, String argColor, int argChanel){
		this.power = argPower;
		this.color = argColor;
		this.chanel = argChanel;
	}
	
	// ��� �������� �Ƚ�פ�����
//	void onOff_power(){
//		this.power = !this.power;
//		System.out.println("���� ������ ���´� " + this.power + " �Դϴ�.");
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
		System.out.println("������ " + this.power + "���� , "
							+ "������ " + this.color + " �̰� ,"
							+ "���� ä���� " + this.chanel + "�� Tv�Դϴ�.");
	}
	
	
}
