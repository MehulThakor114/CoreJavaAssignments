/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		
		// object of circle using shape ref.
		Shape circle = new Circle(2);
		circle.calculateArea();
		circle.calculatePerimeter();
		System.out.println();
		
		// object of rectangle using shape ref.
		Shape rectangle = new Rectangle(4,5);
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		System.out.println();
		
		// object of square using shape ref.
		Shape square = new Square(6);
		square.calculateArea();
		square.calculatePerimeter();
	} //End of main method

}// End of class AbstractMain
