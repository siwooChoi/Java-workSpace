package coffeeValues;

import java.util.ArrayList;

import main.cafeTime;

public class Amaricano extends coffeeData{
	
	
	private cafeTime F;
	
	private String[] recipeType = {Type[0], Type[1]};
	private int[]    recipeValue = {50, 50};
	private ArrayList totalRecipe;
	
	public Amaricano(cafeTime f){
		super(f);
	}
	
	public ArrayList getRecipe(){
		this.totalRecipe.add(recipeType);
		this.totalRecipe.add(recipeValue);	
		
		return this.totalRecipe;
		
	}
	/*public ArrayList getRecipe(){
		
		
		
	}*/
	
	
	
}