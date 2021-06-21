/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {
     public static Car newCar(String cartype)
     {
    	 if(cartype.equals("sedan"))
    	 {
    		 return new SedanCar();
    	 }
    	 else if(cartype.equals("Couple"))
    	 {
    		 return new CoupleCar();
    	 }
    	 else if(cartype.equals("Sport"))
    	 {
    		 return new SportCar();
    	 }
    	 else if(cartype.equals("Luxury"))
    	 {
    		 return new LuxuryCar();
    	 }
    	 else
    		 return null;
     }
}
