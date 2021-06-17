package day1;
class Customer{
	private int customerId;
	private String name;
	private int age;
	private String city;
	private int pincode;
	 Customer(){
		
	}
      Customer(int a){
		
	}
     public void setName(int id,String nam,int ag,String ci,int pin) {
    	customerId=id;
    	 name =nam; 
    	 age=ag;
    	 city=ci;
    	 pincode=pin;
     }
     public String getName() {
   return name;
     }
     void printDetails() {
    	 System.out.println(customerId);
    	System.out.println(name); 
    	System.out.println(age);
    	System.out.println(city);
    	System.out.println(pincode); 
     }
}

public class CustomerMain {

	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.setName(1,"mehul",21,"kalol",382721);
		obj.getName();
		Customer obj2 = new Customer(5);
		obj.printDetails();
		
	}

}
