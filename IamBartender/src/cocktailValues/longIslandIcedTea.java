package cocktailValues;

import java.util.ArrayList;

public class longIslandIcedTea extends cocktailData{
private ArrayList recipe = new ArrayList();
	
	private String[] rumStringArray 	= {"Rum", 20+""};
	private String[] ginStringArray 	= {"Gin", 20+""};
	private String[] vodkaStringArray 	= {"Vodka", 20+""};
	private String[] tequilaStringArray	= {"Tequila", 20+""};
	private String[] sourMixStringArray = {"SweetSourMix", 80+""};
	private String[] shakeStringArray	= {"Shake", 50+""};
	private String[] colaStringArray	= {"Cola", 20+""};
	
	
	public longIslandIcedTea(){
		this.recipe.add(rumStringArray);
		this.recipe.add(ginStringArray);
		this.recipe.add(vodkaStringArray);
		this.recipe.add(tequilaStringArray);
		this.recipe.add(sourMixStringArray);
		this.recipe.add(shakeStringArray);
		this.recipe.add(colaStringArray);
	}
	
	public void test(){
		System.out.println("�վ��Ϸ��� ���̽�Ƽ �׽�Ʈ");
	}
	
	public String toString(){
		return "LongIslandIcedTea";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	


}
