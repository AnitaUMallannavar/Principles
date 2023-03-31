package com.xworkz.fine.constant;

public enum Sweet {
	LADOO(200,Colours.YELLOW),SHENGAHOLAGI(45,Colours.BROWN),NEEMJAGGERY(0,Colours.GOLDEN);
	
	
  private final int price;
  private final Colours colours;
  
  private Sweet(int price,Colours colours) {
	this.price=price;
	this.colours=colours;
  }
}
