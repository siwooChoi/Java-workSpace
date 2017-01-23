package ObjArrayTest;

public class TvTest1 {
	
	public static void main(String [] args){
		
		Tv [] Tvarr = new Tv[5];
		
		boolean [] power_array = {true, false, true, true, false};
		String [] color_array = {"black", "white", "black", "black", "white"};
		int [] chanel_array = {2, 4, 3, 1, 5};
		
		
		
		for(int iCount = 0; iCount < Tvarr.length; iCount++){
			Tvarr[iCount] = new Tv(power_array[iCount],
			                       color_array[iCount], 
			                       chanel_array[iCount]);
			

			
			Tvarr[iCount].printTv();
			
			

		}
		
		Tv t = new Tv();
		
		System.out.println(Tv.imclass_Var);
		System.out.println(t.imclass_Var);
		System.out.println(t.chanel);
		System.out.println(t.printVar());
		t.printVar2();
		
		
	}
}
