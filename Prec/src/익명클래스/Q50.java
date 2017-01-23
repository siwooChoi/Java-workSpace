package 익명클래스;

interface cyka{
	abstract void prt();
}


class A implements cyka{
	public void prt(){
		
	}
}


public class Q50 {
	public static void main(String args[]){
			// new 뒤에는 인터페이스, 클래스가 올 수 있다.
		cyka c = new /*클래스이름 implements  가 생략된것.*/ cyka() {
			public void prt(){
				
			}
		};// ;으로 끝 찍어야됨
	}

}
