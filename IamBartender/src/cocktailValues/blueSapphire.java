package cocktailValues;

import java.util.ArrayList;

public class blueSapphire extends cocktailData{
	private ArrayList recipe = new ArrayList();
	
	private String[] peachStringArray 	= {"Peach", 20+""};
	private String[] coconutStringArray 	= {"Coconut", 20+""};
	private String[] blueCuracaoStringArray	= {"BlueCuracao", 20+""};
	private String[] limeStringArray	= {"Lime", 20+""};
	private String[] shakeStringArray	= {"Shake", 50+""};
	private String[] spriteStringArray	= {"Sprite", 50+""};
	
	
	public blueSapphire(){
		this.recipe.add(peachStringArray);
		this.recipe.add(coconutStringArray);
		this.recipe.add(blueCuracaoStringArray);
		this.recipe.add(limeStringArray);
		this.recipe.add(shakeStringArray);
		this.recipe.add(spriteStringArray);
	}
	
	public void test(){
		System.out.println("블루사파이어 테스트");
	}
	
	public String toString(){
		return "BlueSapphire";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
