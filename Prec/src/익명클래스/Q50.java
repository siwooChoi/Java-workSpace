package �͸�Ŭ����;

interface cyka{
	abstract void prt();
}


class A implements cyka{
	public void prt(){
		
	}
}


public class Q50 {
	public static void main(String args[]){
			// new �ڿ��� �������̽�, Ŭ������ �� �� �ִ�.
		cyka c = new /*Ŭ�����̸� implements  �� �����Ȱ�.*/ cyka() {
			public void prt(){
				
			}
		};// ;���� �� ���ߵ�
	}

}
