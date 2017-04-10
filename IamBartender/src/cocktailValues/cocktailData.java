package cocktailValues;

import java.util.ArrayList;

import main.makeCocktail;
import panels.playPage;

public class cocktailData{
	
	private String testValue = "TestValue Of coffeeDataObj";
	
	private cocktailData ginTonicObj;
	private cocktailData peachCrushObj;
	private cocktailData juneBugObj;
	private cocktailData margaritaObj;

	
	private ArrayList menuList = new ArrayList();
	private ArrayList recipe;
	
	
	
//	protected String[] Type = {"Coffee", "Water", "Milk", "Syrup", "Caramel", "Steam"};
	
	
	
//	public coffeeData(cafeTime cafeTimeObj){
//		super(cafeTimeObj);
////		super(cafeTimeObj);
//		System.out.println("coffeeData 생성자이다.");
//		
//	}
	
	public cocktailData(){
//		System.out.println("coffeeData 생성자이다.");
	}
	
	public cocktailData(makeCocktail makeCocktailObj){
		super();
		this.ginTonicObj	= new ginTonic();
		this.peachCrushObj 	= new peachCrush();
		this.juneBugObj		= new juneBug();
		this.margaritaObj	= new margarita();

		
		this.menuList.add(this.ginTonicObj);  			// 0
		this.menuList.add(this.peachCrushObj);
		this.menuList.add(this.juneBugObj);
		this.menuList.add(this.margaritaObj);

	}
	
	public ArrayList getRecipe(){	
		return recipe;
	}
	
	public ArrayList getMenuList(){
		return this.menuList;
	}
	
	public cocktailData getThis(){
		return this;
	}
	
	public void test(){
		System.out.println("asdsad");
	}

//	public coffeeData getRandom(){
//		return randomCoffee;
//	}
}
