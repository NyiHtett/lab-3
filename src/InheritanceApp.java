/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: driver class to run person(superclass) and customer(subclass)
*/
public class InheritanceApp {    //driver class
	public static void main(String[] args) {     //main method
		Person person1 = new Person("sam","new york",14155552671L);  //create an object for Person class with hard coded data
		Customer customer1 = new Customer("finn","fremont",16349834345L,11441,true);   //create an object for Customer class with hard coded data
		System.out.println(person1);   //call toString method of object to display field informations
		System.out.println();          
		System.out.println(customer1); //call toString method of object to display field informations
	} //end of main method
}   //end of driver class
