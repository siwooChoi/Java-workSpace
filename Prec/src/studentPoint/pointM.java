package studentPoint;

import java.util.Scanner;

public class pointM {
	int [] p = {0, 0, 0};
	
	public pointM() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.print("선택 : ");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		switch(select){
			case 1: {	
				System.out.println("국어, 영어, 수학  순으로 점수를 입력하세요.");
				int inputKor = scan.nextInt();
				int inputEng = scan.nextInt();
				int inputMath = scan.nextInt();
				
				System.out.print("입력한 성적은 ");
				this.inputP(inputKor, inputEng, inputMath);
				this.printP();
				System.out.print(" 입니다. ");
				
				
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
		System.out.print("국어점수 : " + this.p[0] + ", 영어점수 : " +  this.p[1] + ", 수학점수" + this.p[2]);
	}
	
	
}
