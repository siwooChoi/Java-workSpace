package product;

class Product {
	int 		price;
	int			bonusPoint;
	final float bonusPointRate;
	
	{
		bonusPointRate = 0.1f;
	}

	Product(int argPrice){
		this.price = argPrice;
		this.bonusPoint = (int)(argPrice * bonusPointRate);
	}
	

}
