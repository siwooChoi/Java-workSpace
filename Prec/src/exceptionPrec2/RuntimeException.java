package exceptionPrec2;

import java.util.Scanner;


class Exception1 extends Exception {
	
}
class Exception2 extends Exception {
	
}

public class RuntimeException {
	
	
	public static void main(String[] args){
		int x;
		boolean flag = true;
		
		
		
		while(flag){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.print("0 ~ 100 사이의 숫자를 입력 : ");
			x = scan.nextInt();
			
			if(x > 100){
				throw new Exception1();
			}
			
			else if(x < 0){
				throw new Exception2();
				
			}
			flag = false;
			
		}catch(Exception1 a){
				System.out.println("큰 오류자너 ><");
			}
			catch(Exception2 e){
			System.out.println("작은 오류자너 ><");
		}
		
		
		}
		
		
		
		
	}
}
		
		
		
		
//		int inputValue1 = scan.nextInt();
//		
//		if(inputValue1 < 0){
//			InvalidInputValue iv = new InvalidInputValue(18);
//			
//			System.out.println(iv.getErrCode());
//			
//		} else if (inputValue1 > 100){
//			InvalidInputValue iv = new InvalidInputValue(218);
//			
//			System.out.println(iv.getErrCode());
//			
//		} else{
//			System.out.println(inputValue1 + " 을 입력했음.");
////		}
//		
//		
//		}
//	}


