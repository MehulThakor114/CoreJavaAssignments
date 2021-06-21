/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape {
    private int length;
    private int breadth;
     
    public Rectangle() {
    	// default constructor
    }
    // parameterized constructor
    public Rectangle(int length,int breadth) {
    	this.length= length;
    	this.breadth = breadth;
    }
    //overriding method
    public void calculateArea() {
 	   double area = length*breadth;
 	   System.out.println("Area of rectangle : "+area);
    }
    //overriding method
    public void calculatePerimeter() {
 	   double p=length+breadth;
 	   p*=2;
 	  System.out.println("Perimeter of rectangle : "+p);
    }
}// End of class Rectangle
