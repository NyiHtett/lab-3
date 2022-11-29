/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: person operation class
*/
public class Person {       //operation class(superclass)
	private String name;    //name
	private String address; //address
	private long phNumber;  //phone number
	Person(){          //default constructor
		name = "";     //assign default name
		address = "";  //assign default address
		phNumber = 0;  //assign default phone number
	}   //end of constructor 
	Person(String n,String add,long ph){  //overloaded constructor 
		name = n;      //assign name
		address = add; //assign address
		phNumber = ph; //assign phone number
	}   //end of constructor
	public void setName(String n) {    //method to set name
		name = n;   //assign name
	}   //end of method 
	public void setAddress(String add) {  //method to set address
		address = add; //assign add
	}   //end of method 
	public void setPhNumber(long ph) {  //method to set phone number
		phNumber = ph; //assign phone number
	}   //end of method
	public String getName() {      //method to get name
		return name;       //return name
	}   //end of method
	public String getAddress() {   //method to get address
		return address;       //return address
	}   //end of method
	public long getPhNumber() {    //method to get phone number
		return phNumber;      //return phone number
	}   //end of method
	public String toString() {     //toString() method to display the fields
		String str;                //declaring string data type                
		str = "name: "+this.getName()+       //call method to get name   
			  "\naddress: "+this.getAddress()+           //call method to get address
			  "\nphone number: "+this.getPhNumber();     //call method to get phone number
		return str;                //return the string
	}  //end of method

}  //end of operation class(superclass)
