/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape {
       private float radius;
       
       public Circle() {
    	// default constructor
       }
       // parameterized constructor
       public Circle(float radius) {
    	 this.radius=radius;   
       }
       //overriding method
       public void calculateArea() {
    	   double area = MATH_PI*radius*radius;
    	   System.out.println("Area of circle : "+area);
       }
       //overriding method
       public void calculatePerimeter() {
    	   double p=2*MATH_PI*radius;
    	   System.out.println("Perimeter of Cicle: "+p);
       }
}// End of class Circle
