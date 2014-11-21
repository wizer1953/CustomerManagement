package CustomerManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("Beans.xml");
		
		Customer obj = (Customer) appcontext.getBean("customer");
		obj.setCustomer("Vivek Gupta", "20", "Male", "9783600924", "4/127", "32", "Gurgaon", "Haryana", "122001");
		
		System.out.println(obj);

	}

}
