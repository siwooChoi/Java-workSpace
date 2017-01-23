package test2;

public class StudentScore {
	//학생이름, 국영수, 합계, 평균.     m --> 3개   합, 평균, 출력
	
	String Sname;
	int kor;
	int Eng;
	int Math;
	int Sum;
	double avg;
	
	public int pointSum(int argKor, int argEng, int argMath){		// 국영수 점수받고, sum에 합하는 메서드
		this.kor = argKor;
		this.Eng = argEng;
		this.Math = argMath;
		
		return this.Sum = this.kor + this.Eng + this.Math;
	}
	
	public double pointAvg(double argSum) {			// sum값 받아서 3으로 나누어 평균 구하는 메서드
		
		this.avg = (argSum/3.0);
 	
		return this.avg;
	}
	
	public void pointPrint(){
		System.out.println("국어 : " +  this.kor + ", 영어 : " + this.Eng + ", 수학 : " + 
						this.Math + ", / 합계 : " + this.Sum + ",  / 평균 : " + this.avg);
	}
}