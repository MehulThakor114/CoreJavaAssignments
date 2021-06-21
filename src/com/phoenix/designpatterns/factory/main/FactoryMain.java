/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {
    public static void main(String[] args) {
    	String s = args[0];
    	
    	Car car = CarFactory.newCar(s);
    	car.start();
    	car.run();
    	car.stop();
    }
}
