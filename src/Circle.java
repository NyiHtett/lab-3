/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Three
Lab due date: 10/27/2022
Submission Date: 10/21/2022
Description: circle operation class
*/
import javax.swing.JOptionPane;    //import JOptionPane class

public class Circle {              //operation class
	private double radius;         //radius
	private double perimeter;      //perimeter
	private double area;           //area
	Circle(double r){          //constructor with parameter for radius
		radius = r;            //assign radius
		computePerimeter();    //call method to compute perimeter
		computeArea();         //call method to compute area
		display();             //call method to display the results
	}   //end of constructor
	public void computePerimeter() {    //method for computing perimeter
		perimeter = 2*Math.PI*radius;   //calculate using circle perimeter formula
	}   //end of method
	public void computeArea() {         //method for computing area
		area = Math.PI*radius*radius;   //calculate using circle area formula
	}   //end of method
	public void display() {             //method for displaying results
		String str = String.format("radius: %,.2f\n"              //format the string
				                 + "perimeter: %,.2f\n"
				                 + "area: %,.2f", radius,perimeter,area);
		JOptionPane.showMessageDialog(null, str);      //display results using JOptionPane
	}   //end of method

}  //end of operation class
