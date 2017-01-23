package studentPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class studentM {
	Scanner scan = new Scanner(System.in);
	ArrayList stu = new ArrayList();
	
	
	public void input_S_infomation() {
		
		System.out.print("학년 입력 : ");
		int scanSgrade = scan.nextInt();
		System.out.print("번호 입력 : ");
		int scanSnum = scan.nextInt();
		System.out.print("이름 입력 : ");
		String scanSname = scan.next();
		
		//System.out.println(scanSgrade + ", " + scanSnum + ", " + scanSname);
		students s = new students(scanSgrade, scanSnum, scanSname);

		stu.add(s);
		System.out.println(stu.get(0));
	}
}


