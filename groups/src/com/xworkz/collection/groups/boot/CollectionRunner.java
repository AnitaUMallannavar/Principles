package com.xworkz.collection.groups.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionRunner {

	public static void main(String[] args) {

		Collection<String> name = new ArrayList<String>();
		name.add("Anita");
		name.add("Akshata");
		name.add("Shubangi");
		name.add("Pallavi");
		name.add("Bhairavi");
		name.add("Shruti");
		name.add("Asha");
		name.add("Usha");
		name.add("Savita");
		name.add("Shweta");
		name.add("Sachin");

		int total = name.size();
		System.out.println(" Total names are :" + total);
		name.clear();
		System.out.println(" Total names are :" + name.size());

		System.out.println("###################");
		Collection<Byte> by = new LinkedHashSet<Byte>();
		by.add((byte) 1);
		by.add((byte) 2);
		by.add((byte) 3);
		by.add((byte) 4);
		by.add((byte) 5);
		by.add((byte) 6);
		by.add((byte) 7);
		by.add((byte) 8);
		by.add((byte) 9);
		by.add(null);

		System.out.println("Total Number of bytes :" + by.size());
		by.clear();
		System.out.println("Total Number of bytes :" + by.size());

		System.out.println("##################");
		Collection<Double> number = new LinkedList<Double>();
		number.add(1111.1);
		number.add(2222.2);
		number.add(3333.3);
		number.add(44444.4);
		number.add(55555.5);
		number.add(66666.6);
		number.add(77777.7);
		number.add(88888.8);
		number.add(99999.9);
		number.add(0.0);
		System.out.println("Total numbers are :" + number.size());
		number.clear();
		System.out.println("Total numbers are :" + number.size());

		System.out.println("################");
		Collection<Integer> integer = new LinkedHashSet<Integer>();
		integer.add(1);
		integer.add(22);
		integer.add(333);
		integer.add(4444);
		integer.add(55555);
		integer.add(666666);
		integer.add(7777777);
		integer.add(88888888);
		integer.add(999999999);
		integer.add(0);

		System.out.println(" Total integers are :" + integer.size());
		integer.clear();
		System.out.println("Total integers are :" + integer.size());

		System.out.println("###########################");
		Collection<Float> flo = new LinkedHashSet<>();
		flo.add((float) 586125);
		flo.add((float) 586123);
		flo.add((float) 560032);
		flo.add((float) 586121);
		flo.add((float) 586122);
		flo.add((float) 560033);
		flo.add((float) 586124);
		flo.add((float) 586125);
		flo.add((float) 560036);
		flo.add((float) 586127);
		flo.add((float) 586128);
		flo.add((float) 560039);

		System.out.println("Total floating values :" + flo.size());
		flo.clear();
		System.out.println("Total floating values :" + flo.size());

		System.out.println("##########################");
		Collection<Short> small = new HashSet<Short>();
		short a = 987;
		short b = 321;
		short c = 432;
		short d = 253;
		short e = 654;
		short f = 876;
		short g = 9232;
		short h = 6743;
		short i = 7992;
		short j = 6052;
		small.add(a);
		small.add(b);
		small.add(c);
		small.add(d);
		small.add(e);
		small.add(f);
		small.add(g);
		small.add(h);
		small.add(i);
		small.add(j);

		System.out.println("Total Short elements :" + small.size());
		small.clear();
		System.out.println("Total Short elements :" + small.size());
		System.out.println("#####################");
		Collection<Long> log = new ArrayList<Long>();
		log.add((long) 9449025212.00);
		log.add(9611550557L);
		log.add(9945915376L);
		log.add(8722368636L);
		log.add(9535379887L);
		log.add(9980007172L);
		log.add(9980007213L);
		log.add(9900020687L);
		log.add(6364123100L);
		log.add(7204223793L);

		System.out.println("Total numbers are:" + log.size());
		log.clear();
		System.out.println("Total numbers are:" + log.size());

		System.out.println("=====================");

		Collection<Character> chara = new LinkedHashSet<Character>();
		chara.add('A');
		chara.add('B');
		chara.add('C');
		chara.add('D');
		chara.add('E');
		chara.add('F');
		chara.add('G');
		chara.add('H');
		chara.add('I');
		chara.add('J');
		chara.
		

		System.out.println("Total Characters are :" + chara.size());
		chara.clear();
		System.out.println("Total Characters are :" + chara.size());

		System.out.println("=============");

		Collection<Boolean> famous = new ArrayList<Boolean>();
		famous.add(true);
		famous.add(false);
		famous.add(false);
		famous.add(true);
		famous.add(true);
		famous.add(false);
		famous.add(true);
		famous.add(false);
		famous.add(true);
		famous.add(false);
		famous.add(true);

		System.out.println("Total number of boolean :" + famous.size());
		famous.clear();
		System.out.println("Total number of boolean :" + famous.size());

	}

}
