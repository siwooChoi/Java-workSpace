package coffeeValues;

import java.util.ArrayList;

public class cafeLatte extends coffeeData{
	
	private ArrayList recipe = new ArrayList();

	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	private String[] milkStringArray 	= {"Milk", 50+""};
	
	public cafeLatte(){
//		System.out.println("cafeLatte �������̴�.");
		this.recipe.add(coffeeStringArray);
		this.recipe.add(milkStringArray);
	}

	public void test(){
		System.out.println("ī��� �׽�Ʈ");
	}

	public String toString(){
		return "CafeLatte";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}
