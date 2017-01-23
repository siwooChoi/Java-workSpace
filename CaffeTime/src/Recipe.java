
public class Recipe{

	public String Americano(int coffee, int water) {
		if((coffee == 30) && (water == 80))
			return "Americano";
		else
			return "Fail";
	}
	
	public String Americano(int coffee, int water, int syrup) {
		if((coffee == 30) && (water == 80) && (syrup == 10))
			return "Americano_added_syrup";
		else
			return "Fail";
	}

	public String CafeLatte(int coffee, int milk){
		if((coffee == 30) && (milk == 80))
			return "CafeLatte";
		else
			return "Fail";
	}
	
	public String Espresso(int coffee){
		if((coffee == 70))
			return "Espresso";
		else
			return "Fail";
	}
	
	public String Espresso(int coffee, int syrup){
		if((coffee == 70)  && (syrup == 10))
			return "Espresso_added_syrup";
		else
			return "Fail";
	}
	
	public String Caramel_Macchiato(int coffee, int milk, int caramel, int steam){
		if((coffee == 30) && (milk == 70) && (caramel == 20) && (steam == 30))
			return "Caramel_Macchiato";
		else
			return "Fail";
	}
	
	public String Cappuccino(int coffee, int milk, int steam){
		if((coffee == 30 && (milk == 60) && (steam == 30)))
			return "Cappuccino";
		else
			return "Fail";
	}
	
	
	
	

	

	
	
	
}
