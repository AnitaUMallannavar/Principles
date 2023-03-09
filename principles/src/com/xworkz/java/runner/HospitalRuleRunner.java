package com.xworkz.java.runner;

import com.xworkz.java.principles.Doctor;
import com.xworkz.java.principles.HospitalRule;

public class HospitalRuleRunner {

	public static void main(String[] args) {
		Doctor doc=new Doctor();
		double dl=doc.closingTime();
		System.out.println(dl);
		String st=doc.doctorTiming();
		System.out.println(st);
		int it=doc.fileRate();
		System.out.println(it);
		String st1=doc.medisinType();
		System.out.println(st1);
		String st2=doc.noOfFloors();
		System.out.println(st2);
		double dl1=doc.opentime();
		System.out.println(dl1);
		String spl=doc.specialist();
		System.out.println(spl);
		int it2=doc.hashCode();
        System.out.println(it2);
		String st3=doc.toString();
		System.out.println(st3);
		
		HospitalRule hp=new Doctor();
		double dl11=hp.closingTime();
		System.out.println(dl11);
		String st11=hp.doctorTiming();
		System.out.println(st11);
		int ti=hp.fileRate();
		System.out.println(ti);
		String mt=hp.medisinType();
		System.out.println(mt);
		String st22=hp.noOfFloors();
		System.out.println(st22);
		double hp1=hp.opentime();
		System.out.println(hp1);
		int ti22=hp.fileRate();
		System.out.println(ti22);
		String sp=hp.specialist();
		System.out.println(sp);
		String st33=hp.toString();
		System.out.println(st33);
		int hpp=hp.hashCode();
		System.out.println(hpp);
	}

}
