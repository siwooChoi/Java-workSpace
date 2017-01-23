package reTest2;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
						// 학생수 입력받기, 학생수만큼 배열,  학생객체, (수만큼반복)국영수점수, 합계,평균구하기,  출력
		
		Scanner scan = new Scanner(System.in);
		
		int stdNum; // 학생수
		
		
		// 학생수 입력받기
		System.out.print("학생 수 입력 : ");
		stdNum = scan.nextInt();
		
		// 학생 수 만큼의 공간인  배열생성 (객체를 만드는것이 아님)
		StudentScore[] s = new StudentScore[stdNum];
		
		
		
		for(int x = 0; x < stdNum; x++){

			s[x] = new StudentScore();
			
			// 이름 입력받기
			System.out.print("학생의 이름을 입력 : ");
			s[x].sName = scan.next();
			
			// 국영수 점수받기
			System.out.print("국어 점수 입력 : ");
			s[x].kor = scan.nextInt();
			
			System.out.print("영어 점수 입력 : ");
			s[x].eng = scan.nextInt();
			
			System.out.print("수학 점수 입력 : ");
			s[x].math = scan.nextInt();
			
			
			// 합계,평균 구하기
			s[x].valueSum();
			s[x].valueAvg();
		}
		
		// 결과출력
		for(int x = 0; x < stdNum; x++){
			s[x].printValue();
		}
		
		
	}
}
