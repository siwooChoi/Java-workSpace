package exceptionPrec;




public class exclass {
	public static void main(String[] args){
		boolean N2ģ�� = false;
		boolean ��ȣ = true;

		N2ģ�� = ��ȣ;

		try {
		  if (N2ģ�� == true) {
		     System.out.println("���� �ش�.");
		     throw new Exception();
		  } else {
		     System.out.println("����");
		  }
		} catch(Exception e){
		    System.out.println("�̷��� ���°� �´���");
		    System.out.println("���� ������ �� 1�� 2��Ʋ��");
		    System.out.println("���� ������ �� 1�� 11��Ʋ��");
		    System.out.println("���� ������ �� 3�� ���15 ��Ʋ��");
		}
		
	}
}
