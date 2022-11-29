/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: The driver code to run Circle, create its object, 
call its methods to accept input, assign and calculate perimeter and area of the circle.
*/
import javax.swing.JOptionPane;              //import JOptionPane class
public class CircleValidationApp{            //driver class
	public static void main(String[] args) { //main method 
		 boolean flag = false;               //initializing flag value for while loop
		 while (flag == false) {             //while-loop
			     try {  //try block
					 String input = JOptionPane.showInputDialog("Please enter radius value for the circle "
					     		+ "( letters and negative values are invalid )");   //asking user input
			    	 double radius = Double.parseDouble(input);   //parse to double
			    	 if(radius < 0) {          //checking whether it is negative value
			 			throw new NegativeDoubleException(radius);//if negative throw exception
			 		}   //end of if-statement
			    	 Circle circle1 = new Circle(radius);         //creating an object of circle class
			    	 flag = true;     //assign true value to flag to stop looping
			     }      //end of try block
			     catch(NegativeDoubleException e) {     //catch block for negative input
			    	 JOptionPane.showMessageDialog(null, e.getMessage());    //get and show Message using JOptionPane
			     }  //end of catch block
			     catch(NumberFormatException e) {       //catch block for letter input
			    	 JOptionPane.showMessageDialog(null, "Please enter a positive number, not letter"); //show Message using JOptionPane
			     }  //end of catch block
			     catch(NullPointerException e) {        //catch block for null
			    	 JOptionPane.showMessageDialog(null, "Must enter a positive number!"); //show Message using JOptionPane
			     }  //end of catch block
		 }  //end of while-loop
	}  //end of main method
}   //end of driver class
