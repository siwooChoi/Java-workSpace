package exceptionPrec;




public class exclass {
	public static void main(String[] args){
		boolean N2친다 = false;
		boolean 경호 = true;

		N2친다 = 경호;

		try {
		  if (N2친다 == true) {
		     System.out.println("문제 준다.");
		     throw new Exception();
		  } else {
		     System.out.println("유감");
		  }
		} catch(Exception e){
		    System.out.println("이렇게 쓰는게 맞던가");
		    System.out.println("문제 응시자 중 1명 2개틀림");
		    System.out.println("문제 응시자 중 1명 11개틀림");
		    System.out.println("문제 응시자 중 3명 평균15 개틀림");
		}
		
	}
}

