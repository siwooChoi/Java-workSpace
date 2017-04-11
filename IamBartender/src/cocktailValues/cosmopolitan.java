package cocktailValues;

import java.util.ArrayList;

public class cosmopolitan extends cocktailData{
private ArrayList recipe = new ArrayList();
	
	private String[] vodkaStringArray 			= {"Vodka", 40+""};
	private String[] WhiteCuracaoStringArray 	= {"WhiteCuracao", 20+""};
	private String[] limeStringArray			= {"Lime", 20+""};
	private String[] cranberryStringArray		= {"Cranberry", 20+""};
	private String[] shakeStringArray			= {"Shake", 40+""};
	
	
	public cosmopolitan(){
		this.recipe.add(vodkaStringArray);
		this.recipe.add(WhiteCuracaoStringArray);
		this.recipe.add(limeStringArray);
		this.recipe.add(cranberryStringArray);
		this.recipe.add(shakeStringArray);
	}
	
	public void test(){
		System.out.println("코스모폴리탄 테스트");
	}
	
	public String toString(){
		return "Cosmopolitan";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
	
}
