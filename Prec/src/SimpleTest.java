
public class SimpleTest {
	
	
	public static void main(String[] args){
		
		Data d = new Data();
		d.x = 10;
		
		change(d.x);	// c b v 
		change(d);		// c b r
		System.out.println("After change(): " + d.x);

		
		
	}
	
	static void change(int x) {
		x = 1000;
		 System.out.println("change(): " + x);
	}
	
	
	static void change(Data d) {
		d.x = 55;
		 System.out.println("change(): " + d.x);
	}
}
