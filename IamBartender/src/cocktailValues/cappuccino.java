package coffeeValues;

import java.util.ArrayList;

public class cappuccino extends coffeeData{

	
	
	private ArrayList recipe = new ArrayList();

	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	private String[] milkStringArray 	= {"Milk", 30+""};
	private String[] steamStringArray	= {"Steam", 20+""};
	
	public cappuccino(){
//		System.out.println("Cappuccino 생성자이다.");
		this.recipe.add(coffeeStringArray);
		this.recipe.add(milkStringArray);
		this.recipe.add(steamStringArray);
		
	}
	
	
	public String toString(){
		return "Cappuccino";
	}
}
