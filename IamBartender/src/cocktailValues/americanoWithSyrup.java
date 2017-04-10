package coffeeValues;

import java.util.ArrayList;

public class americanoWithSyrup extends coffeeData{

	
	private ArrayList recipe = new ArrayList();

	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	private String[] waterStringArray 	= {"Water", 50+""};
	private String[] syrupStringArray 	= {"Syrup", 20+""};
	
//	private String recipe[] = {"Coffee", 50+"", "Water", 50+"", "Syrup", 20+""};
	
	public americanoWithSyrup(){
		this.recipe.add(coffeeStringArray);
		this.recipe.add(waterStringArray);
		this.recipe.add(syrupStringArray);
	}
	
	public String toString(){
		return "Americano With Syrup";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
