import java.util.Scanner;

public class input_Print {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String input = scan.nextLine();
		
		int num = Integer.parseInt(input);
		
		System.out.println("�Է¹��� ���� : " + num);
		
		num = num * num;
		System.out.printf("�Է°� * �Է°�  --> %d", num);
		
		

	}

}
