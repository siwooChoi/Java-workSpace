package test2;

import java.util.Scanner;

public class inputValue {
	int iVkor;
	int iVEng;
	int iVMath;
	int iVSum;
	double iVAvg;
	int inputValue;
	StudentScore StdS[] = new StudentScore[this.inputValue];
	
	Scanner scan = new Scanner(System.in);
	
	public void inputValueM() {
		System.out.print("�л� ���� �Է��ϼ��� : ");
		this.inputValue = scan.nextInt(); 		// �л����Է¹ް�
		
	}
	
	  // �Է¹��� ������ �迭����
	
	public void Value_for() {
		for(int x = 0; x < this.inputValue; x++){
			System.out.print("�������� �Է��ϼ��� : ");
			this.iVkor = scan.nextInt();	
			System.out.print("�������� �Է��ϼ��� : ");
			this.iVEng = scan.nextInt();
			System.out.print("�������� �Է��ϼ��� : ");
			this.iVMath = scan.nextInt();
			
			this.iVSum = StdS[this.inputValue].pointSum(this.iVkor, this.iVEng, this.iVMath);
			this.iVAvg = StdS[this.inputValue].pointAvg(this.iVSum);
			
			StdS[this.inputValue].pointPrint();
			
		}
	}
	
	public static void main(String[] args){
		inputValue i = new inputValue();
		i.inputValueM();
		i.Value_for();
		
		StudentScore s = new StudentScore();
		
		
		
	}


}
//  ���� �Է¹ް�,  ���ڸ�ŭ �迭�����, ���ڸ�ŭ for, ���Է�.