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
		System.out.println("������ ����");

		while(flag){
			if(flag) {
	          //((int)(Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�); --> �ּҰ� ~ �ִ밪 ���� ���� 
	          //�����ϰ� �����ð� ���߰� �ϴ� �κ�   
	        	 
	        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3);
//				int secs = ((int)(Math.random() * 1)); 
	        	  System.out.println("(" + secs + "�� �Ŀ� �ֹ��� ���ɴϴ�.)"); 
//	              System.out.println("�޴�����Ʈ ������ : " + menuList.size());
	         
	                for(int i = secs; i >= 0; i--) {
	                	// 3~7�� ���� �ð�  1�ʾ� �پ��� 
	                	playPageObj.setTimeLabel(i);	
	                	
	                	
	                	try { 
		                	Thread.sleep(1000); 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  // 1000 ������ 1��. (������ * 1000 = ~��)
	                }
	                
	                listIndex = (int)(Math.random() * (menuList.size()));		// ������ �ֹ� �߻�.
//	                System.out.println("�����ε�����ȣ : "+listIndex);
	                
	                this.orderList.add(this.menuList.get(listIndex));
	                
	                playPageObj.setOrderLabel(this.orderList);
	                
	                if(this.orderList.size() > 8){
	                	this.makeCocktailObj.stopThread();
	                	flag = false;
	                	this.playPageObj.resetMaking();
	                }
			}		// if(flag)�� ������ �κ�
		
			
		}
		
		
    }

	public void test(){
		System.out.println("������ �ȿ� �ִ� �޼���");
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
