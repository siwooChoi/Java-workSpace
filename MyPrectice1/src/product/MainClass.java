package product;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		Buyer buyer = new Buyer(5000, 10);
		
		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(audio);
		
		buyer.summary();

	}

}
