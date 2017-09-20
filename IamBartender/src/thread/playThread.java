package thread;

import java.util.ArrayList;

import cocktailValues.*;
import main.makeCocktail;
import panels.playPage;

public class playThread extends playPage implements Runnable{

	private makeCocktail makeCocktailObj;
	private playPage playPageObj;
	private cocktailData cocktailDataObj;
	public String[] recipe;
	private ArrayList orderList;
	private ArrayList menuList;
	private int listIndex;
	
	private boolean flag = false;
	
	public playThread(makeCocktail makeCocktailObj){
		super(makeCocktailObj);
		this.makeCocktailObj = makeCocktailObj;
		this.playPageObj = makeCocktailObj.getPlayPageObj();
		this.cocktailDataObj = this.makeCocktailObj.getCocktailDataObj();
//		this.menuList = cafeTimeObj.getCoffeeDataObj();
		
		this.menuList = this.cocktailDataObj.getMenuList();
		this.orderList = new ArrayList();
	}
	
	
	@Override
	public void run() {
		System.out.println("스레드 시작");

		while(flag){
			if(flag) {
	          //((int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값); --> 최소값 ~ 최대값 사이 랜덤 
	          //랜덤하게 일정시간 멈추게 하는 부분   
	        	 
	        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3);
//				int secs = ((int)(Math.random() * 1)); 
	        	  System.out.println("(" + secs + "초 후에 주문이 들어옵니다.)"); 
//	              System.out.println("메뉴리스트 사이즈 : " + menuList.size());
	         
	                for(int i = secs; i >= 0; i--) {
	                	// 3~7초 랜덤 시간  1초씩 줄어들기 
	                	playPageObj.setTimeLabel(i);	
	                	
	                	
	                	try { 
		                	Thread.sleep(1000); 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  // 1000 단위가 1초. (랜덤수 * 1000 = ~초)
	                }
	                
	                listIndex = (int)(Math.random() * (menuList.size()));		// 랜덤한 주문 발생.
//	                System.out.println("랜덤인덱스번호 : "+listIndex);
	                
	                this.orderList.add(this.menuList.get(listIndex));
	                
	                playPageObj.setOrderLabel(this.orderList);
	                
	                if(this.orderList.size() > 8){
	                	this.makeCocktailObj.stopThread();
	                	flag = false;
	                	this.playPageObj.resetMaking();
	                }
			}		// if(flag)가 끝나는 부분
		
			
		}
		
		
    }

	public void test(){
		System.out.println("스레드 안에 있는 메서드");
	}
	
	public ArrayList getOrderList(){
		return this.orderList;
	}
	
	public String[] getList(){
		return this.recipe;
	}
	
	public void setThreadFlag(boolean argFlag){
		this.flag = argFlag;
	}
	
	

}
