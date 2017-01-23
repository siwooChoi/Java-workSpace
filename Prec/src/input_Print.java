import java.util.Scanner;

public class input_Print {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		String input = scan.nextLine();
		
		int num = Integer.parseInt(input);
		
		System.out.println("입력받은 값은 : " + num);
		
		num = num * num;
		System.out.printf("입력값 * 입력값  --> %d", num);
		
		

	}

}
