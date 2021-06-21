/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.interfaces.main;

import com.phoenix.living.wild.Tiger;
import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.machines.HumanRobot;
import com.phoenix.machines.Robot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicals.cars.Car;


public class InterfaceMain {

	public static void main(String[] args) {

		// For Earth
		Movable movable;// ref. of movable interface
        
		Earth e=new Earth(1);
		movable=e;
		System.out.println("-----Earth-----");
		
		System.out.println(e.toString());
        System.out.println("Life on this Planet: "+e.supportsLife());
		e.rotate();
		e.move();
		e.revolve();
		System.out.println();
		System.out.println("-----Jupiter-----");
		// For Jupiter
		Jupiter j = new Jupiter(8);
		movable=j;
		// movable.toString();
		System.out.println(j.toString());
		 System.out.println("Life on this Planet: "+j.supportsLife());
		j.rotate();
		j.move();
		j.revolve();
		System.out.println();
		System.out.println("-----Tiger-----");

		// For Tiger
		Tiger t = new Tiger();
		movable = t;
		t.jump();
		t.run();
		t.walk();
		t.move();
		System.out.println();
		System.out.println("-----Cat-----");
		

		// For Cat
		Cat c = new Cat();
		movable=c;
		c.jump();
		c.run();
		c.walk();
		c.move();
		System.out.println();
		System.out.println("-----Car-----");
		

		// For Car
		movable = new Car();
		((Car) movable).start();
		((Car) movable).move();
		((Car) movable).run();
		((Car) movable).stop();
		System.out.println();
		System.out.println("-----Robot-----");
		// For Robot
		movable = new Robot();
		((Robot) movable).move();
		((Robot) movable).processData();
		((Robot) movable).senseInfo();
		((Robot) movable).useArtificialIntelligence();
		System.out.println();
		System.out.println("-----HumanRobot-----");

		// For HumanRobot
		movable = new HumanRobot();
		((HumanRobot) movable).walk();
		((HumanRobot) movable).jump();
		((Robot) movable).processData();
		((HumanRobot) movable).senseInfo();
		((HumanRobot) movable).useArtificialIntelligence();
		

	}

}