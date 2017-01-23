package BingGo;

import java.util.Scanner;

public class StartMain {

	public static void main(String [] args){
		
		int num;
		boolean numFlag;	//변수 이름,메서드는 소문자로 시작하는 것을 권장.  클래스?  대문자로 시작하기 때문
		Scanner scan = new Scanner(System.in);
		
		
	
		do{
			System.out.print("(3~9사이)빙고판 크기를 정하세요 : ");	// System <-- 클래스,   println <--- 메서드
			num = scan.nextInt();
		
			if(num < 3 || num > 9){				
				numFlag = true;
				System.out.println("3 ~ 9 사이 숫자로 입력해야합니다.");
			} else{
				numFlag = false;
			}
			
		}while(numFlag);	// false 일 때 빠져나온다! <-- 중요
		
		
		BingGoM bgm = new BingGoM(num);
		bgm.randomNum();
		bgm.printBingo();
		

	}
		
}
