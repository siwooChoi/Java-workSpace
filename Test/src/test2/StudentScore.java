package test2;

public class StudentScore {
	//�л��̸�, ������, �հ�, ���.     m --> 3��   ��, ���, ���
	
	String Sname;
	int kor;
	int Eng;
	int Math;
	int Sum;
	double avg;
	
	public int pointSum(int argKor, int argEng, int argMath){		// ������ �����ް�, sum�� ���ϴ� �޼���
		this.kor = argKor;
		this.Eng = argEng;
		this.Math = argMath;
		
		return this.Sum = this.kor + this.Eng + this.Math;
	}
	
	public double pointAvg(double argSum) {			// sum�� �޾Ƽ� 3���� ������ ��� ���ϴ� �޼���
		
		this.avg = (argSum/3.0);
 	
		return this.avg;
	}
	
	public void pointPrint(){
		System.out.println("���� : " +  this.kor + ", ���� : " + this.Eng + ", ���� : " + 
						this.Math + ", / �հ� : " + this.Sum + ",  / ��� : " + this.avg);
	}
}