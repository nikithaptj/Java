package Scopeofbeans;

public class Beaninheritanceclass {
	
	private String Message;
	private String Message1;
	public String getMessage1() {
		return Message1;
	}

	public void setMessage1(String message1) {
		Message1 = message1;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		this.Message = message;
	}
	public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy() {
		   
	      System.out.println("Bean will destroy now.");
	   }


}
