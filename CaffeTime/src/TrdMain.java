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
		
		public void run() {		// 랜덤한 시간으로 실행이 된다.
			while(threadStop == true){
				
				if(threadStop) {
		          //((int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값); --> 최소값 ~ 최대값 사이 랜덤 
		          //랜덤하게 일정시간 멈추게 하는 부분   
		        	 
		        	  int secs = ((int)(Math.random() * (7 - 3 + 1)) + 3); 
		        	  System.out.println("(" + secs + "초 후에 주문이 들어옵니다.)"); 
		                
		         
		                for(int i = secs; i >= 0; i--) {
		                
		                	JF_JP_etc.OrderOfWhatTime.setText("(" + i + "초 후에 주문이 들어옵니다.)");
		                	
		                	try {
			                	Thread.sleep(1000); 
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}  // 1000 단위가 1초. (랜덤수 * 1000 = ~초)
		                }
		                
		                
		                
		                listIndex = ((int)(Math.random() * (6 - 0 + 1)) + 0);		// 랜덤한 주문 발생.
		    			
		    			//  trd_c_list.cList.get(listIndex);  <--- coffeeList 클래스의  cList컬렉션 의 인덱스번호 ~ 번 값을 가져온다. ex) 0번--> Americano
		    			
		    			switch(listIndex){
	
		    			case 0:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));	// 0번값 가져온걸  주문리스트(olist)에 add.
		    				// 위는 클래스안의 메서드로 접근해서 add. trd_o_list.oList.add(trd_c_list.cList.get(listIndex)); 이렇게하면 직접 접근해서 add
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 1:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 2:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 3:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 4:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 5:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
		    				break;
		    				
		    			case 6:
		    				trd_o_list.addList(trd_c_list.cList.get(listIndex));
		    				message.addMsList("\" " + trd_c_list.cList.get(listIndex)  + " \"" + " 을(를) 주문받았습니다.");
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
				
				
		           	
		           	
		           		
		           	
//		           	else if(asdf ) 
//		          threadStop = false;
		}
		
			
			
//			listIndex = ((int)(Math.random() * (3 - 0 + 1)) + 0);		// 랜덤한 주문 발생.
//			
//			//  trd_c_list.cList.get(listIndex);  <--- coffeeList 클래스의  cList컬렉션 의 인덱스번호 ~ 번 값을 가져온다. ex) 0번--> Americano
//			
//			switch(listIndex){
//			
//			case 0:
//				trd_o_list.addList(trd_c_list.cList.get(listIndex));	// 0번값 가져온걸  주문리스트(olist)에 add.
//				// 위는 클래스안의 메서드로 접근해서 add. trd_o_list.oList.add(trd_c_list.cList.get(listIndex)); 이렇게하면 직접 접근해서 add
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
//			
			
			
		
			
		}
}
