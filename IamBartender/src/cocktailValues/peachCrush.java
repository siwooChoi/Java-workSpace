package cocktailValues;

import java.util.ArrayList;

public class peachCrush extends cocktailData{
	
	private ArrayList recipe = new ArrayList();
	
	private String[] peachStringArray 	= {"Peach", 30+""};
	private String[] coconutStringArray 	= {"Coconut", 20+""};
	private String[] limeStringArray	= {"Lime", 10+""};
	private String[] OrangeStringArray	= {"Orange", 40+""};
	private String[] cranberryStringArray	= {"Cranberry", 40+""};
	private String[] shakeStringArray		= {"Shake", 70+""};
	
	
	public peachCrush(){
		this.recipe.add(peachStringArray);
		this.recipe.add(coconutStringArray);
		this.recipe.add(limeStringArray);
		this.recipe.add(OrangeStringArray);
		this.recipe.add(cranberryStringArray);
		this.recipe.add(shakeStringArray);
		
	}
	
	public void test(){
		System.out.println("피치크러시 테스트");
	}
	
	public String toString(){
		return "PeachCrush";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
