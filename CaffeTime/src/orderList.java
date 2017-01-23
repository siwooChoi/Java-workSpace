import java.util.ArrayList;

public class orderList {

	ArrayList <String> oList;
	
	public orderList(ArrayList order) {
		oList = order;
	}

	public void addList(String orderName) {
		oList.add(orderName);
	}
	
	public String getList(int index) {
		return (String)oList.get(index);
	}
		
}
