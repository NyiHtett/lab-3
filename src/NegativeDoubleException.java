/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: custom-designed exception class
*/
public class NegativeDoubleException extends Exception{  //custom-designed exception class
	NegativeDoubleException(){   //constructor
		super("Error: Negative data for radius");  //override superclass(exception)'s message
	}  //end of constructor
	NegativeDoubleException(double r){  //overloaded constructor with one parameter
		super("Error => Negative data for radius: "+r); //override superclass(exception)'s message
	}  //end of constructor
}    //end of class
