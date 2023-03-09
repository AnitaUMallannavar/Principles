package com.xworkz.java.things;

public class Players implements CricketRule{
     private int runs;
     public Players() {
		System.out.println("no args const of Players");
	}
	@Override
	public int noOfPlayers(int runs) {
		//this.runs=runs;
		System.out.println("Running number of Players in Players");
		if(runs!=0&&runs==45) {
			System.out.println("runs is equals to 45");
			return 45;
		}else {
			System.out.println("runs is not equals to 45");
		}
		return 11;
	}

}
