/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: customer class inherited from person class
*/
public class Customer extends Person{  //subclass
	private int customerNum;     //customer number
	private boolean onMailList;  //boolean variable to determine is customer on the mail list
	Customer(){      //default constructor
		super();     //call superclass's default constructor
		customerNum = 0;    //assign default customer number
		onMailList = false; //assign default boolean value for onMailList
	}   //end of constructor
	Customer(String n,String add,long ph,int cus,boolean mail){   //overloaded constructor 
		super(n,add,ph);     //call superclass's overloaded constructor
		customerNum = cus;   //assign customer number
		onMailList = mail;   //assign boolean value for onMailList
	}   //end of constructor
	public void setCustomerNum(int cus) {  //method to set customer number
		customerNum = cus;   //set customer number
	}   //end of method 
	public void setMailList(boolean mail) {
		onMailList = mail;   //set boolean value for onMailList
	}   //end of method 
	public int getCustomerNum() {  //method to get customer number
		return customerNum;  //return customer number
	}   //end of method 
	public boolean getMailList() { //method to get boolean value of onMailList
		return onMailList;   //return boolean value of onMailList
	}   //end of method 
	@Override
	public String toString() {    //overriding toString() method to display the fields
		String str;               //declaring string data type
		str = "customer's name: "+this.getName()+        //call method to get name
			  "\naddress: "+this.getAddress()+           //call method to get address
			  "\nphone number: "+this.getPhNumber()+     //call method to get phone number
			  "\ncustomer number: "+this.getCustomerNum()+   //call method to get customer number
			  "\nIs on mail list: "+this.getMailList();      //call method to get boolean value of onMailList
		return str;               //return the string
	}  //end of method
}  //end of subclass
