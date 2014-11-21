package CustomerManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	CustomerAddress addr;
	String name;
	String age;
	String gender;
	String contactNumber;
	
	void setCustomer(String name, String age, String gender, String contactNumber, String houseNumber,String sector, String city, String state, String zipCode)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		this.addr = (Address) context.getBean("address"); 
		addr.setAddress(houseNumber, sector, city, state, zipCode);
		
	}

	@Override public String toString()
	{
		return("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nContact Number: "+contactNumber+"\nAddress: "+addr.toString());
	}
	
}
