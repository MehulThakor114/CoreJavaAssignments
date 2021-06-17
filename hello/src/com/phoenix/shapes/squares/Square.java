/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {
   private int side;

   public Square() {
	// default constructor
   }
   // parameterized constructor
   public Square(int side) {
	   this.side = side;
   }
   //overriding method
   public void calculateArea() {
 	   double area = side*side;
 	   System.out.println("Area of square : "+area);
    }
    public void calculatePerimeter() {
 	   double p=4*side;
 	   System.out.println("Perimeter of square : "+p);
    }
}// End of class Square
