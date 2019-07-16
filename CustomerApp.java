package cust;

public class CustomerApp {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		
		System.out.println(c1.hashCode() );
		System.out.println(c1.equals(c2));
		System.out.println(c2.hashCode());
		System.out.println(c2.equals(c1));
	}

}
