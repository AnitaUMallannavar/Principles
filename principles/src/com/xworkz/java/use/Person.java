package com.xworkz.java.use;

import com.xworkz.java.things.Delivery;

public class Person {
     private Delivery delivery;
     public Person(Delivery delivery) {
    	 this.delivery=delivery;
		System.out.println("Running delivery const in Person");
	}
     public void setDelivery() {
    	 System.out.println("Setting Delivery methods");
    	 double charger=this.delivery.chargers();
    	 double timeTaken=this.delivery.timeTake();
    	 String agentname=this.delivery.agentName(30);
    	 
    	 if(charger<60) {
    		 System.out.println("charges ok");
    	 }
    	 if(charger>60) {
    		 System.out.println("charges are expensive");
    	 }
    	 if(timeTaken<=30) {
    		 System.out.println("onTime Delivery");
    	 }
    	 if(timeTaken>30) {
    		 System.out.println("delayed delivery");
    	 }
    	 System.out.println(agentname);
     }
}
