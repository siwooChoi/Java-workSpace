package reTest2;

public class StudentScore {
										//�л��̸�, ������, �հ�, ���.     m --> 3��   ��, ���, ���
	String sName;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	
	// �հ� ���ϴ� �޼���
	public void valueSum(){  
		sum = kor + eng + math;
	}
	
	// ��� ���ϴ� �޼���
	public void valueAvg() {
		avg = sum/3.0;
	}

	// �� ��� �޼���
	public void printValue() {
		System.out.println("�л��� �̸� : " + sName + ", �������� : " + kor + 
												   ", �������� : " + math + 
												   ", �������� : " + eng + 
												   ", �հ� : " + sum +
												   ", ��� : " + avg);
	}
}
