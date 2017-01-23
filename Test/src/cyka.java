public class cyka {
	public static int objCount = 0;
	public String name = "";
	public int age = 0;
	
	public void prtInfo() {
		System.out.println(this.name + "," + this.age + "," + this.objCount);
	}
	
	public cyka() { }
	
	public cyka(String argName, int argAge) {
		this.name = argName;
		this.age = argAge;
		cyka.objCount = cyka.objCount + 1;
	}
}
