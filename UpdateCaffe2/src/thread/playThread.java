package thread;

import javax.swing.JLabel;

import coffeeValues.Amaricano;
import main.cafeTime;
import panels.playPage;

public class playThread extends playPage implements Runnable{

	cafeTime cafeTimeObj;
	playPage playPageObj;
	Amaricano a;
	
	
	public boolean flag = true;
	
	public playThread(cafeTime cafeTimeObj){
		super(cafeTimeObj);
		this.cafeTimeObj = cafeTimeObj;
	}
	
	
	@Override
	public void run() {
		
		System.out.println("������ ����");
		
		playPageObj = cafeTimeObj.getPlayPage();
		
		while(flag){
			if(flag) {
	          //((int)(Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�); --> �ּҰ� ~ �ִ밪 ���� ���� 
	          //�����ϰ� �����ð� ���߰� �ϴ� �κ�   
	        	 
	        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3); 
	        	  System.out.println("(" + secs + "�� �Ŀ� �ֹ��� ���ɴϴ�.)"); 
	                
	         
	                for(int i = secs; i >= 0; i--) {
	                	System.out.println("(" + i + "�� �Ŀ� �ֹ��� ���ɴϴ�.)");
//	                	playPageObj.timeLab.setText("(" + i + "�� �Ŀ� �ֹ��� ���ɴϴ�.)");
	                	playPageObj.Timeset(i);
	                	
	                	
	                
	                	
	                	try {
		                	Thread.sleep(1000); 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  // 1000 ������ 1��. (������ * 1000 = ~��)
	                }
			}
		}
		
		
    }

//	public void getRecipe(){
//		System.out.println(a.getRecipe());
//	}
	
	public void test(){
		System.out.println("������ �ȿ� �ִ� �޼���");
	}
	

}