package reTest2;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
						// �л��� �Է¹ޱ�, �л�����ŭ �迭,  �л���ü, (����ŭ�ݺ�)����������, �հ�,��ձ��ϱ�,  ���
		
		Scanner scan = new Scanner(System.in);
		
		int stdNum; // �л���
		
		
		// �л��� �Է¹ޱ�
		System.out.print("�л� �� �Է� : ");
		stdNum = scan.nextInt();
		
		// �л� �� ��ŭ�� ������  �迭���� (��ü�� ����°��� �ƴ�)
		StudentScore[] s = new StudentScore[stdNum];
		
		
		
		for(int x = 0; x < stdNum; x++){

			s[x] = new StudentScore();
			
			// �̸� �Է¹ޱ�
			System.out.print("�л��� �̸��� �Է� : ");
			s[x].sName = scan.next();
			
			// ������ �����ޱ�
			System.out.print("���� ���� �Է� : ");
			s[x].kor = scan.nextInt();
			
			System.out.print("���� ���� �Է� : ");
			s[x].eng = scan.nextInt();
			
			System.out.print("���� ���� �Է� : ");
			s[x].math = scan.nextInt();
			
			
			// �հ�,��� ���ϱ�
			s[x].valueSum();
			s[x].valueAvg();
		}
		
		// ������
		for(int x = 0; x < stdNum; x++){
			s[x].printValue();
		}
		
		
	}
}
