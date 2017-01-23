package inheritance;

public class Child extends Parent{
	
	int x = 10;
	
	public void print(){
		System.out.println("x =  " + x);
		System.out.println("this.x =  " + this.x);
		System.out.println("super.x =  " + super.x);
	}
	
	public static void main(String[] args){
		
		
		Parent p = new Parent();
		Child c = new Child();
		
		c.print();
		
	}
	
}
