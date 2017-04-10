package cocktailValues;

import java.util.ArrayList;

public class juneBug extends cocktailData{
	private ArrayList recipe = new ArrayList();
	
	private String[] melonStringArray 		= {"Melon", 40+""};
	private String[] coconutStringArray 	= {"Coconut", 20+""};
	private String[] bananaStringArray		= {"Banana", 20+""};
	private String[] sourMixStringArray		= {"SweetSourMix", 40+""};
	private String[] orangeStringArray		= {"Orange", 30+""};
	private String[] pineappleStringArray	= {"Pineapple", 30+""};
	private String[] shakeStringArray		= {"Shake", 70+""};
	
	
	
	public juneBug(){
		this.recipe.add(melonStringArray);
		this.recipe.add(coconutStringArray);
		this.recipe.add(bananaStringArray);
		this.recipe.add(sourMixStringArray);
		this.recipe.add(orangeStringArray);
		this.recipe.add(pineappleStringArray);
		this.recipe.add(shakeStringArray);
		
	}
	
	public void test(){
		System.out.println("ÁØ¹÷ Å×½ºÆ®");
	}
	
	public String toString(){
		return "JuneBug";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}
