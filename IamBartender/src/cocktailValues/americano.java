package cocktailValues;

import java.util.ArrayList;

public	class americano extends cocktailData{
	
	private ArrayList recipe = new ArrayList();
	
	private String[] coffeeStringArray 	= {"Coffee", 50+""};
	private String[] waterStringArray 	= {"Water", 50+""};
	
	
	public americano(){
//		System.out.println("아메객체 생성");
		this.recipe.add(coffeeStringArray);
		this.recipe.add(waterStringArray);
	}
	
	public void test(){
		System.out.println("아메 테스트");
	}
	
	public String toString(){
		return "Americano";
	}
	
	public ArrayList getRecipe(){
		return this.recipe;
	}
}