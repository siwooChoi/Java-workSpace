package BingGo;

import java.util.Scanner;

public class StartMain {

	public static void main(String [] args){
		
		int num;
		boolean numFlag;	//���� �̸�,�޼���� �ҹ��ڷ� �����ϴ� ���� ����.  Ŭ����?  �빮�ڷ� �����ϱ� ����
		Scanner scan = new Scanner(System.in);
		
		
	
		do{
			System.out.print("(3~9����)������ ũ�⸦ ���ϼ��� : ");	// System <-- Ŭ����,   println <--- �޼���
			num = scan.nextInt();
		
			if(num < 3 || num > 9){				
				numFlag = true;
				System.out.println("3 ~ 9 ���� ���ڷ� �Է��ؾ��մϴ�.");
			} else{
				numFlag = false;
			}
			
		}while(numFlag);	// false �� �� �������´�! <-- �߿�
		
		
		BingGoM bgm = new BingGoM(num);
		bgm.randomNum();
		bgm.printBingo();
		

	}
		
}
