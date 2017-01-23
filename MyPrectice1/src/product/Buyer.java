package product;

import java.util.Vector;

class Buyer {
	int			money;
	int			bonusPoint;
//	Product[]	cart;
	int			carIndex;
	Vector cart = new Vector();
	
//	Buyer() {
//		money	= 1000;
//		cart	= new Product[10];
//	}
//	
//	Buyer(int money, int cartNum){
//		this.money = money;
//		cart = new Product[cartNum];
//	}
//	
//	
//	void buy(Product p){
//		money = money - p.price;
//		bonusPoint = bonusPoint + p.bonusPoint;
//		cart[carIndex] = p;
//		carIndex++;
//		System.out.println(p + "을/를 구입하셨습니다.");
//	}
//	
//	void summary() {
//		int		sum = 0;
//		String	itemList = "";
//		
//		for(int x = 0; x < carIndex; x++){
//			Product p = cart[x];
//			sum += p.price;
//			itemList += p;
//			 
//			
//			if(cart[x+1] != null){	
//				itemList += ", ";		
//			}
//			
//		}
//		
//		System.out.println("구입하신 물품의 총 금액:" + sum + "만원입니다.");
//		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
//	}
	
	
	Buyer() {
		money	= 1000;
		Vector cart	= new Vector();
	}
	
	Buyer(int money, int cartNum){
		this.money = money;
		Vector cart = new Vector();
	}
	
	
	void buy(Product p){
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart.add(p);
		carIndex++;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int		sum = 0;
		String	itemList = "";
		
		for(int x = 0; x < carIndex; x++){
			Product p = (Product)cart.get(x);
			sum += p.price;
			itemList += p;
			 
	
			if(x != cart.size() - 1){
				itemList += ", ";
			}
			
//			if(cart.get(carIndex) != null){	
//				itemList += ", ";		
//			}
			
		}
		
		System.out.println("구입하신 물품의 총 금액:" + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}

}
