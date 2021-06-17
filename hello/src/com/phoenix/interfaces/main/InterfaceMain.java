package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicals.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movable mv;
         mv= new Earth(1);
         System.out.println(mv.toString());
         ((Earth)mv).move();
         ((Earth)mv).rotate();
         ((Earth)mv).revolve();
         System.out.println();
         mv= new Jupiter(2);
         System.out.println(mv.toString());
         ((Jupiter)mv).move();
         ((Jupiter)mv).rotate();
         ((Jupiter)mv).revolve();
         System.out.println();
         mv= new Tiger();
         ((Tiger)mv).Jump();
         ((Tiger)mv).run();
         ((Tiger)mv).move();
         System.out.println();
         mv= new Cat();
         ((Cat)mv).Jump();
         ((Cat)mv).run();
         ((Cat)mv).move();
         System.out.println();
         mv= new Car();
         ((Car)mv).run();
         ((Car)mv).move();
         System.out.println();
         mv= new HumanRobot();
         ((HumanRobot)mv).Jump();
         ((HumanRobot)mv).run();
         ((HumanRobot)mv).walk();
        
	}

}
