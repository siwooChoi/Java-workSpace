package SyokikaBlock;


abstract class options {
	final String test_type1 = "�ѹ� ���ǵǸ�!!  �� �ڷ� �ٲ� �� ����. = final";
	String test_type2 = "isNull";
	
	static int testInt1 = 10;
	int testInt2 = 20;
	
	
	abstract void csMethod();
}


class terran extends options{
	{
//		this.test_type1 = "�ʱ�ȭ������ �ʱ�ȭ ����. this is terran";	// ��� final. ���� �Ұ�
		System.out.println(this.test_type1 + "�ʱ�ȭ������ ������ �ȵ�����, ���(����)�� �����ϴ�.");
		
		this.test_type2 = "�ʱ�ȭ������ �ʱ�ȭ ����. this is terran";	// ��� final�� �ƴ�
	}
	

	
	final String thisIsFinalString;	// final�ε�, �Ʒ� �����ڿ��� �ʱ�ȭ �� ����.
	//������
	terran() {
		
		thisIsFinalString = "�����ڷ� �ʱ�ȭ ����. ";
	}
	
		void csMethod(){
			System.out.println("�߻�޼��带 ��ӹ޾Ƽ� ä���־���");
		}
}

class protoss extends options{
	
	
	
	void csMethod(){
		System.out.println("�̰� �ȸ���� �߻�޼��� ������ �ȵǼ�, ���� ��!~");
	}
		
	
}

public class player {
	public static void main(String [] args){
		
		terran t = new terran();
		terran t2 = new terran();
		
		t.test_type2 = "terran";		// ��� �޾Ƽ� ��� ����.
		System.out.println(t.test_type1);
		System.out.println(t.test_type2);
		
		protoss p = new protoss();

		t.testInt1 = 50;		// �ɼ��� ��ӹ޴� t, p.  �ɼǿ��� static testInt1. 		
		System.out.println(p.testInt1);	// static�̱� ������ 50�� ��µ� �˴ϴ�.
		
		
		
	}
}
