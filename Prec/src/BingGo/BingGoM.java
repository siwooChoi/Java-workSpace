package BingGo;

public class BingGoM { // 빙고판만들기  역할

	int bNum;						// 입력받은 값이 들어감
	int bingNum;					// bNum * bNum (가로*세로)
	int [] bing; 					// bingNum에 맞게 빙고판
	
	
	// 생성자.  숫자를 입력받아서 빙고판을 만듬.    초기화를 할 때 사용
	public BingGoM(int argNum){
		bNum = argNum;     
		bingNum =argNum * argNum;   
		bing = new int[bingNum];
	} 
	
	// 출력만 담당하는 메서드. 
	public void printBingo(){	
		for(int x = 0; x < bing.length; x++){
			
			System.out.print(bing[x] + " ");
			
			// 칸수에 도달하면 개행
			if((x+1) % bNum == 0){		
				System.out.println(" ");
			}
		} 
	}
	
	
	// 난수발생 빙고숫자 채우기
	public void randomNum(){
		int rand1;
		int rand2;
		int temp;

		// 베열초기화
		for(int x = 0; x < bing.length; x++) {
			bing[x] = x+1;
		}
		
		// 배열섞기
		
		for(int x = 0; x < 30; x++){
			rand1 = (int)(Math.random() * bingNum);
			rand2 = (int)(Math.random() * bingNum);
			
			temp = bing[rand1];
			bing[rand1] = bing[rand2];
			bing[rand2] = temp;
		}
		
		
		      
		
		
		
	} // 메서드 public void RandomNum()의 꼬리
	
	
	
	// 빙고판에 숫자입력
	
	// 빙고 갯수 판단
	
	
	
}