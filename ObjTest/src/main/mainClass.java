package main;
import a.*;
import b.*;

public class mainClass {
	
	public void createTests(){
		test1 t1 = new test1();	// (2)
		test2 t2 = new test2(); 
	}
	
	public void testM(){
		System.out.println("test¸Þ¼­µå");
	}
	
	public static void main(String[] args){
		mainClass main = new mainClass();				// (1)
		main.createTests();
	}
}
