package TryWithResources;

class TC implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("Test Class �ݳ�");
	}
}

class EC implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("Ex Class �ݳ�");
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
				System.out.println("if�� �����.");
				throw new Exception();
			}
			
		} catch(Exception e1) {
			System.out.println("catch�� �����");
		}
		System.out.println("Try-Catch �����");
		
	}
}
