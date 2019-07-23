package Scopeofbeans;

public class Beaninheritanceclass2 {
	private String Message;

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
