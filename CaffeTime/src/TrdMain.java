import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class TrdMain implements Runnable{

	int listIndex; 
	
		
		public static coffeeList trd_c_list = new coffeeList(new ArrayList());
		public static orderList trd_o_list = new orderList(new ArrayList());
		public static Message message = new Message(new ArrayList());
		public static boolean threadStop = true;
		
		
	

		public void run() {		// ������ �ð����� ������ �ȴ�.
			 
			
			
			
			
			
			
			while(threadStop == true){
				
				if(threadStop) {
		          //((int)(Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�); --> �ּҰ� ~ �ִ밪 ���� ���� 
		          //�����ϰ� �����ð� ���߰� �ϴ� �κ�   
		        	 
		        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3); 
		        	  System.out.println("(" + secs + "�� �Ŀ� �ֹ��� ���ɴϴ�.)"); 
		                
		         
		                for(int i = secs; i >= 0; i--) {
		                
		                	JF_JP_etc.OrderOfWhatTime.setText("(" + i + "�� �Ŀ� �ֹ��� ���ɴϴ�.)");
		                	
		                	try {
			                	Thread.sleep(1000); 
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}  // 1000 ������ 1��. (������ * 1000 = ~��)
		                }
		                
		                
		                
		                listIndex = ((int)(Math.random() * (6 - 0 + 1)) + 0);		// ������ �ֹ� �߻�.
		    			
		    			//  trd_c_list.cList.get(listIndex);  <--- coffeeList Ŭ������  cList�÷��� �� �ε�����ȣ ~ �� ���� �����´�. ex) 0��--> Americano
		    			
		    			switch(listIndex){
	
		    			case 0:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));	// 0���� �����°�  �ֹ�����Ʈ(olist)�� add.
		    				// ���� Ŭ�������� �޼���� �����ؼ� add. trd_o_list.oList.add(trd_c_list.cList.get(listIndex)); �̷����ϸ� ���� �����ؼ� add
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 1:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 2:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 3:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 4:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 5:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;
		    				
		    			case 6:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " ��(��) �ֹ��޾ҽ��ϴ�.");
		    				break;

		    			}
		    			
		    			
		    			
		    			
		    			if(trd_o_list.oList.size() == 1) {
		    				JF_JP_etc.order1.setText(trd_c_list.cList.get(listIndex));
		    			} else if (trd_o_list.oList.size() == 2) {
		    				JF_JP_etc.order2.setText(trd_c_list.cList.get(listIndex));
		    			} else if (trd_o_list.oList.size() == 3) {
		    				JF_JP_etc.order3.setText(trd_c_list.cList.get(listIndex));
		    			} else if (trd_o_list.oList.size() == 4) {
		    				JF_JP_etc.order4.setText(trd_c_list.cList.get(listIndex));
		    			}
		                
		    			else{ 
		    				
		    			}      
		             
		          } 
				
				
		           	
		           	
		           		
		           	
		           	//else if(asdf ) 
		          //threadStop = false;
		}
		
			
			
//			listIndex = ((int)(Math.random() * (3 - 0 + 1)) + 0);		// ������ �ֹ� �߻�.
//			
//			//  trd_c_list.cList.get(listIndex);  <--- coffeeList Ŭ������  cList�÷��� �� �ε�����ȣ ~ �� ���� �����´�. ex) 0��--> Americano
//			
//			switch(listIndex){
//			
//			case 0:
//				trd_o_list.addList(trd_c_list.cList.get(listIndex));	// 0���� �����°�  �ֹ�����Ʈ(olist)�� add.
//				// ���� Ŭ�������� �޼���� �����ؼ� add. trd_o_list.oList.add(trd_c_list.cList.get(listIndex)); �̷����ϸ� ���� �����ؼ� add
//				
//				break;
//				
//			case 1:
//				trd_o_list.addList(trd_c_list.cList.get(listIndex));
//				break;
//				
//			case 2:
//				trd_o_list.addList(trd_c_list.cList.get(listIndex));
//				break;
//				
//			case 3:
//				trd_o_list.addList(trd_c_list.cList.get(listIndex));
//				break;
//			}
//			
//			if(trd_o_list.oList.size() == 1) {
//				JF_JP_etc.order1.setText(trd_c_list.cList.get(listIndex));
//			} else if (trd_o_list.oList.size() == 2) {
//				JF_JP_etc.order2.setText(trd_c_list.cList.get(listIndex));
//			} else if (trd_o_list.oList.size() == 3) {
//				JF_JP_etc.order3.setText(trd_c_list.cList.get(listIndex));
//			} else if (trd_o_list.oList.size() == 4) {
//				JF_JP_etc.order4.setText(trd_c_list.cList.get(listIndex));
//			}
			
			
			
		
			
		}
}