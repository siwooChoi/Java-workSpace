//package 익명클래스;
//
//class ThreadClass implements Runnable{
//	public void run(){
//		for(int iCount = 0; iCount < 10; iCount++){
//			System.out.println("-");
//			try{
//				Thread.sleep(1000);
//			}catch(Exception e){
//				
//			}
//		}
//	}
//	
//}
//
//
//
//public class thread {
//	public static void main(String [] args){
//		
//		Thread myThread = new Thread(){
//			public void run(){
//				for(int iCount = 0; iCount < 10; iCount++){
//					System.out.println("*");
//					try{
//						Thread.sleep(1000);
//					} catch(Exception e){
//						
//					}
//					
//				}
//			}
//		};
//		
//		ThreadClass tc = new ThreadClass();
//		
//	}
//}
//
//

package 익명클래스;

class ThreadClass implements Runnable{
	public void run(){
		for(int iCount = 0; iCount < 10; iCount++){
			System.out.println("-");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
	
}



public class thread {
	public static void main(String [] args){
		
		Thread myThread = new Thread(new Runnable(){
			public void run(){
				for(int iCount = 0; iCount < 10; iCount++){
					System.out.println("*");
					try{
						Thread.sleep(1000);
					} catch(Exception e) {
						
					} //캣치
					
				} // 포
			}
		
		});
	}
		
}



