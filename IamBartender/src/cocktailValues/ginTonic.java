package cocktailValues;

import java.util.ArrayList;

public class ginTonic extends cocktailData{

	
	private ArrayList recipe = new ArrayList();
	
	private String[] ginStringArray 	= {"Gin", 30+""};
	private String[] tonicStringArray 	= {"Tonic", 70+""};
	private String[] stirStringArray	= {"Stir", 20+""};
	
	
	public ginTonic(){
//		System.out.println("아메객체 생성");
		this.recipe.add(ginStringArray);
		this.recipe.add(tonicStringArray);
		this.recipe.add(stirStringArray);
	}
	
	public void test(){
		System.out.println("진토닉 테스트");
	}
	
	public String toString(){
		return "GinTonic";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
