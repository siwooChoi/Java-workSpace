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
		System.out.print("학생 수를 입력하세요 : ");
		this.inputValue = scan.nextInt(); 		// 학생수입력받가
		
	}
	
	  // 입력받은 값으로 배열생성
	
	public void Value_for() {
		for(int x = 0; x < this.inputValue; x++){
			System.out.print("국어점수 입력하세요 : ");
			this.iVkor = scan.nextInt();	
			System.out.print("영어점수 입력하세요 : ");
			this.iVEng = scan.nextInt();
			System.out.print("수학점수 입력하세요 : ");
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
//  숫자 입력받고,  숫자만큼 배열만들기, 숫자만큼 for, 값입력.