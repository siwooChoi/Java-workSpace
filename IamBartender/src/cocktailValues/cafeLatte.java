package coffeeValues;

import java.util.ArrayList;

public class cafeLatte extends coffeeData{
	
	private ArrayList recipe = new ArrayList();

	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	private String[] milkStringArray 	= {"Milk", 50+""};
	
	public cafeLatte(){
//		System.out.println("cafeLatte 생성자이다.");
		this.recipe.add(coffeeStringArray);
		this.recipe.add(milkStringArray);
	}

	public void test(){
		System.out.println("카페라떼 테스트");
	}

	public String toString(){
		return "CafeLatte";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}
