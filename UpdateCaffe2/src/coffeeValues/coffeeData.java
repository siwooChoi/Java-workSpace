package coffeeValues;

import java.util.ArrayList;

import main.cafeTime;
import panels.playPage;

public class coffeeData extends playPage{
	private cafeTime F;
	
	
	
	public coffeeData(cafeTime f){
		super(f);
		System.out.println("coffeeData �������̴�.");
		
	}
	
	protected ArrayList recipe;
	protected String[] Type = {"Coffee", "Water", "Milk", "Syrup", "Caramel", "Steam"};
		
	public ArrayList getRecipe(){
		recipe.add("test");
		
		return recipe;
	}
	
	
	public void coffeeDataOfM(){
		System.out.println("coffeeDataOfM");
	}
	
	
}