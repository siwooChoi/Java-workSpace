package BingGo;

public class BingGoM { // �����Ǹ����  ����

	int bNum;						// �Է¹��� ���� ��
	int bingNum;					// bNum * bNum (����*����)
	int [] bing; 					// bingNum�� �°� ������
	
	
	// ������.  ���ڸ� �Է¹޾Ƽ� �������� ����.    �ʱ�ȭ�� �� �� ���
	public BingGoM(int argNum){
		bNum = argNum;     
		bingNum =argNum * argNum;   
		bing = new int[bingNum];
	} 
	
	// ��¸� ����ϴ� �޼���. 
	public void printBingo(){	
		for(int x = 0; x < bing.length; x++){
			
			System.out.print(bing[x] + " ");
			
			// ĭ���� �����ϸ� ����
			if((x+1) % bNum == 0){		
				System.out.println(" ");
			}
		} 
	}
	
	
	// �����߻� ������� ä���
	public void randomNum(){
		int rand1;
		int rand2;
		int temp;

		// �����ʱ�ȭ
		for(int x = 0; x < bing.length; x++) {
			bing[x] = x+1;
		}
		
		// �迭����
		
		for(int x = 0; x < 30; x++){
			rand1 = (int)(Math.random() * bingNum);
			rand2 = (int)(Math.random() * bingNum);
			
			temp = bing[rand1];
			bing[rand1] = bing[rand2];
			bing[rand2] = temp;
		}
		
		
		      
		
		
		
	} // �޼��� public void RandomNum()�� ����
	
	
	
	// �����ǿ� �����Է�
	
	// ���� ���� �Ǵ�
	
	
	
}