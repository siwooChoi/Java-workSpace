package innerClassEx;

abstract public class apaCyka {
	abstract int getValue();
}

class B {
	apaCyka prt(){
		
		class cyka extends apaCyka{
			int value = 18;
			
			int getValue(){
				return value;
			}
		}
		
		apaCyka a = new cyka();
		return a;
		
	}
}
