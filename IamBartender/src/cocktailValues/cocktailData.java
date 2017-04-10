package cocktailValues;

import java.util.ArrayList;

import main.makeCocktail;
import panels.playPage;

public class cocktailData{
	
	private String testValue = "TestValue Of coffeeDataObj";
//	private coffeeData randomCoffee;
	
//	private americano americanoObj;
//	private americanoWithSyrup americanoWithSyrupObj;
//	private cafeLatte cafeLatteObj;
//	private espresso espressoObj;
//	private ArrayList menuList = new ArrayList();
//	private String[] recipe;
	
	private cocktailData americanoObj;
	private cocktailData americanoWithSyrupObj;
	private cocktailData cafeLatteObj;
	private cocktailData espressoObj;
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
//		this.americanoObj			= new americano();
//		this.americanoWithSyrupObj	= new americanoWithSyrup();
//		this.cafeLatteObj 			= new cafeLatte();
//		this.espressoObj			= new espresso();
		
//		this.menuList.add(this.americanoObj);  			// 0
//		this.menuList.add(this.americanoWithSyrupObj);	// 1
//		this.menuList.add(this.cafeLatteObj);			// 2
//		this.menuList.add(this.espressoObj);			// 3

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
