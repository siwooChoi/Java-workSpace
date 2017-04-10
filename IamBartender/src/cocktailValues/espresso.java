package coffeeValues;

import java.util.ArrayList;

public class espresso extends coffeeData{
	
	
	private ArrayList recipe = new ArrayList();
	
	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	
	
	public espresso(){
		this.recipe.add(coffeeStringArray);
	}
	
	public String toString(){
		return "Espresso";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}
