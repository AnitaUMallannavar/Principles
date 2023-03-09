package com.xworkz.java.runner;

import com.xworkz.java.things.ExamRule;
import com.xworkz.java.things.Students;
import com.xworkz.java.things.University;

public class ExamRuleRunner {

	public static void main(String[] args) {
		ExamRule examRule=new Students();
		University university=new University(examRule);
		university.setExamRules();
	}
}
