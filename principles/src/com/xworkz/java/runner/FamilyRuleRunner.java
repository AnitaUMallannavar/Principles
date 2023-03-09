package com.xworkz.java.runner;

import com.xworkz.java.principles.FamilyMembars;
import com.xworkz.java.principles.FamilyRule;

public class FamilyRuleRunner {

	public static void main(String[] args) {
		FamilyRule fr = new FamilyMembars();
		double dl = fr.getTime();
		System.out.println(dl);
		String st = fr.tiffinTime();
		System.out.println(st);
		double dll = fr.goingTime();
		System.out.println(dll);
		int it = fr.reachingTime();
		System.out.println(it);
		double dl2 = fr.travellingTime();
		System.out.println(dl2);
		String str = fr.poojaTime();
		System.out.println(str);
		String stt = fr.toString();
		System.out.println(stt);

		System.out.println("==========");
		FamilyMembars fm = new FamilyMembars();
		double bl = fm.getTime();
		System.out.println(bl);
		double bl1 = fm.goingTime();
		System.out.println(bl1);
		String strr = fm.poojaTime();
		System.out.println(strr);
		int sr = fm.reachingTime();
		System.out.println(sr);
		String st22 = fm.tiffinTime();
		System.out.println(st22);
		double sr1 = fm.travellingTime();
		System.out.println(sr1);
		int fm2 = fm.hashCode();
		System.out.println(fm2);
		String ssrr = fm.toString();
		System.out.println(ssrr);

	}

}
