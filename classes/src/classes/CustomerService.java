package classes;

public class CustomerService {

	
	public Customer[] getCustomer() {
		Customer customer= new Customer(); 
		customer.firstName="Ali";
		customer.lastName="Y�ld�z"; 
		customer.yearOfBirth=1994;
		customer.email="Ali@gmail.com";
		  
		 Customer customer1= new Customer(); 
		 customer1.firstName="B��ra";
		 customer1.lastName="Y�ld�r�m"; 
		 customer1.yearOfBirth=1992;
		 customer1.email="b�sra@gmail.com";
		  
		 Customer customer2= new Customer(); 
		 customer2.firstName="Can";
		 customer2.lastName="�im�ek"; 
		 customer2.yearOfBirth=1998;
		 customer2.email="can@gmail.com";
		 
		 Customer[] customers= {customer,customer1,customer2};
		  
		 return customers;
		
		
	}
}
