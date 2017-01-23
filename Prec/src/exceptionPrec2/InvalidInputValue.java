package exceptionPrec2;



public class InvalidInputValue extends RuntimeException{
	
	final int ERR_CODE;
	
	public InvalidInputValue(int err_code){
		this.ERR_CODE = err_code;
	}
	
	public int getErrCode(){
		return ERR_CODE;
	}
	
	
}