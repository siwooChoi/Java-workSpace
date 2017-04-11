package cocktailValues;

import java.util.ArrayList;

public class midoriSour extends cocktailData{
private ArrayList recipe = new ArrayList();
	
	private String[] melonStringArray 	= {"Melon", 40+""};
	private String[] sourMixStringArray = {"SweetSourMix", 80+""};
	private String[] shakeStringArray	= {"Shake", 30+""};
	private String[] spriteStringArray	= {"Sprite", 90+""};
	
	
	public midoriSour(){
		this.recipe.add(melonStringArray);
		this.recipe.add(sourMixStringArray);
		this.recipe.add(shakeStringArray);
		this.recipe.add(spriteStringArray);
	}
	
	public void test(){
		System.out.println("미도리샤워 테스트");
	}
	
	public String toString(){
		return "MidoriSour";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	

}
