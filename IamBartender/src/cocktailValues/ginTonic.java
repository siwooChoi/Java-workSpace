package cocktailValues;

import java.util.ArrayList;

public class ginTonic extends cocktailData{

	
	private ArrayList recipe = new ArrayList();
	
	private String[] ginStringArray 	= {"Gin", 30+""};
	private String[] tonicStringArray 	= {"Tonic", 70+""};
	private String[] stirStringArray	= {"Stir", 20+""};
	
	
	public ginTonic(){
//		System.out.println("�Ƹް�ü ����");
		this.recipe.add(ginStringArray);
		this.recipe.add(tonicStringArray);
		this.recipe.add(stirStringArray);
	}
	
	public void test(){
		System.out.println("����� �׽�Ʈ");
	}
	
	public String toString(){
		return "GinTonic";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
