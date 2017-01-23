package studentPoint;

import java.util.Scanner;

public class management {
	
	public static void main(String[] args) {
		
			System.out.println("1. 己利包府");
			System.out.println("2. 切积沥焊 积己");
			System.out.print("急琶 : ");
			Scanner scan = new Scanner(System.in);
		
		int select = scan.nextInt();
		
		switch(select){
		case 1: {
			pointM pM = new pointM();
		} case 2: {
			studentM sM = new studentM();
			sM.input_S_infomation();
		}
		
		
		}
		
		
	}
}
