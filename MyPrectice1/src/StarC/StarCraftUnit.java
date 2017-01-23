package StarC;

public class StarCraftUnit {

	static int changeNumber = 0;
	int myIdNum = 0;
	
	public StarCraftUnit() {
		myIdNum = changeNumber++;
	}
	
	public void printObjId() {
		System.out.println(this.myIdNum);
	}
	
	
	
	public static void main(String[] args) {

		StarCraftUnit Sunit = new StarCraftUnit();
		Terran		  Sterran = new Terran();
		Scv 		  Sscv = new Scv();
		Marine		  Smarrine = new Marine();
		
		
		Sunit.printObjId();
		Sterran.printObjId();
		Sscv.printObjId();
		Smarrine.printObjId();
		
		
		
	}

}
