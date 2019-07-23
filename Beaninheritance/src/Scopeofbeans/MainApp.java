package Scopeofbeans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		Beaninheritanceclass obj = (Beaninheritanceclass) context.getBean("helloworld");
	   
	      System.out.println(obj.getMessage());
	      
	      Beaninheritanceclass2 obj1 = (Beaninheritanceclass2) context.getBean("high");
	      System.out.println(obj1.getMessage());
	        }
}

