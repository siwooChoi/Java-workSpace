package cocktailValues;

import java.util.ArrayList;

public class blueHawaiian extends cocktailData{
	private ArrayList recipe = new ArrayList();
	
	private String[] rumStringArray 		= {"Rum", 30+""};
	private String[] blueCuracaoStringArray	= {"BlueCuracao", 30+""};
	private String[] coconutStringArray		= {"Coconut", 30+""};
	private String[] pineappleStringArray	= {"Pineapple", 60+""};
	private String[] blendStringArray		= {"Blend", 40+""};
	
	
	
	public blueHawaiian(){
		this.recipe.add(rumStringArray);
		this.recipe.add(blueCuracaoStringArray);
		this.recipe.add(coconutStringArray);
		this.recipe.add(pineappleStringArray);
		this.recipe.add(blendStringArray);
	}
	
	public void test(){
		System.out.println("블루하와이안 테스트");
	}
	
	public String toString(){
		return "BlueHawaiian";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
