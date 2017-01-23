import java.util.ArrayList;

public class coffeeList {

	ArrayList <String> cList;
	
	public coffeeList(ArrayList myList) {
		
		cList = myList;
		
		cList.add("Americano");
		cList.add("Americano_added_syrup");
		cList.add("CafeLatte");
		cList.add("Espresso");
		cList.add("Espresso_added_syrup");
		cList.add("Caramel_Macchiato");
		cList.add("Cappuccino");
	}

	public String getList(int index) {
		
		return (String)cList.get(index);
	}
}