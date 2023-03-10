package com.xworkz.java.runner;

import com.xworkz.java.implement.Dunzo;
import com.xworkz.java.implement.Rapido;
import com.xworkz.java.things.Delivery;
import com.xworkz.java.use.Person;

public class DeliveryRunner {

	public static void main(String[] args) {
		Delivery delivery1=new Rapido();
		//GSystem.out.println(delivery1);
		Delivery delivery = new Dunzo();
		Person person = new Person(delivery);
		person.setDelivery();
        
	}

}
