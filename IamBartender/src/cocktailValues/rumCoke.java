package cocktailValues;

import java.util.ArrayList;

public class rumCoke extends cocktailData{
	private ArrayList recipe = new ArrayList();
	
	private String[] rumStringArray 	= {"Rum", 30+""};
	private String[] colaStringArray 	= {"Cola", 70+""};
	private String[] stirStringArray	= {"Stir", 30+""};
	
	
	public rumCoke(){
		this.recipe.add(rumStringArray);
		this.recipe.add(colaStringArray);
		this.recipe.add(stirStringArray);
	}
	
	public void test(){
		System.out.println("·³ÄÛ Å×½ºÆ®");
	}
	
	public String toString(){
		return "RumCoke";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
