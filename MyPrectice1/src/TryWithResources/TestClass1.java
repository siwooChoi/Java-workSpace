package TryWithResources;

class TC implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("Test Class ¹Ý³³");
	}
}

class EC implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("Ex Class ¹Ý³³");
	}
}

public class TestClass1 {
	public static void main(String[] args){
		
	
		try(  
				TC tc = new TC() ; 
				EC ec = new EC();
			){
			
			System.out.println("Try start");
			
			if( 2 > 3 ){
				System.out.println("if¹® ½ÇÇàµÊ.");
				throw new Exception();
			}
			
		} catch(Exception e1) {
			System.out.println("catch¹® ½ÇÇàµÊ");
		}
		System.out.println("Try-Catch Á¾·áµÊ");
		
	}
}
