package reTest2;

public class StudentScore {
										//학생이름, 국영수, 합계, 평균.     m --> 3개   합, 평균, 출력
	String sName;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	
	// 합계 구하는 메서드
	public void valueSum(){  
		sum = kor + eng + math;
	}
	
	// 평균 구하는 메서드
	public void valueAvg() {
		avg = sum/3.0;
	}

	// 값 출력 메서드
	public void printValue() {
		System.out.println("학생의 이름 : " + sName + ", 국어점수 : " + kor + 
												   ", 수학점수 : " + math + 
												   ", 영어점수 : " + eng + 
												   ", 합계 : " + sum +
												   ", 평균 : " + avg);
	}
}
