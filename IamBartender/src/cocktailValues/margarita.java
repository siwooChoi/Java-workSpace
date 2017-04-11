package cocktailValues;

import java.util.ArrayList;

public class margarita extends cocktailData{
	private ArrayList recipe = new ArrayList();
	
	private String[] tequilaStringArray 		= {"Tequila", 40+""};
	private String[] whiteCuracaoStringArray 	= {"WhiteCuracao", 20+""};
	private String[] limeStringArray			= {"Lime", 30+""};
	private String[] shakeStringArray			= {"Shake", 20+""};
	
	
	
	public margarita(){
		this.recipe.add(tequilaStringArray);
		this.recipe.add(whiteCuracaoStringArray);
		this.recipe.add(limeStringArray);
		this.recipe.add(shakeStringArray);
	}
	
	public void test(){
		System.out.println("마가리타 테스트");
	}
	
	public String toString(){
		return "Margarita";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}
