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
		
		System.out.println("스레드 시작");
		
		playPageObj = cafeTimeObj.getPlayPage();
		
		while(flag){
			if(flag) {
	          //((int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값); --> 최소값 ~ 최대값 사이 랜덤 
	          //랜덤하게 일정시간 멈추게 하는 부분   
	        	 
	        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3); 
	        	  System.out.println("(" + secs + "초 후에 주문이 들어옵니다.)"); 
	                
	         
	                for(int i = secs; i >= 0; i--) {
	                	System.out.println("(" + i + "초 후에 주문이 들어옵니다.)");
//	                	playPageObj.timeLab.setText("(" + i + "초 후에 주문이 들어옵니다.)");
	                	playPageObj.Timeset(i);
	                	
	                	
	                
	                	
	                	try {
		                	Thread.sleep(1000); 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  // 1000 단위가 1초. (랜덤수 * 1000 = ~초)
	                }
			}
		}
		
		
    }

//	public void getRecipe(){
//		System.out.println(a.getRecipe());
//	}
	
	public void test(){
		System.out.println("스레드 안에 있는 메서드");
	}
	

}
