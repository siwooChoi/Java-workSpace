package studentPoint;

import java.util.Scanner;

public class pointM {
	int [] p = {0, 0, 0};
	
	public pointM() {
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.print("���� : ");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		switch(select){
			case 1: {	
				System.out.println("����, ����, ����  ������ ������ �Է��ϼ���.");
				int inputKor = scan.nextInt();
				int inputEng = scan.nextInt();
				int inputMath = scan.nextInt();
				
				System.out.print("�Է��� ������ ");
				this.inputP(inputKor, inputEng, inputMath);
				this.printP();
				System.out.print(" �Դϴ�. ");
				
				
				break;
				
			} case 2: {
				this.printP();
			}
		}
	}
	
	

	public void inputP(int argKor, int argEng, int argMath) {
		this.p[0] = argKor;
		this.p[1] = argEng;
		this.p[2] = argMath;
	}
	
	public void printP(){
		System.out.print("�������� : " + this.p[0] + ", �������� : " +  this.p[1] + ", ��������" + this.p[2]);
	}
	
	
}
