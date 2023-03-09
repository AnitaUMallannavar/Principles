package com.xworkz.java.things;

public class University {
   public ExamRule examRule;
   
   public University(ExamRule examRule) {
	this.examRule=examRule;
	System.out.println("ExamRule const of University");
}
   public void setExamRules() {
	   String hol=this.examRule.holticket("it is campalsery");
	   String iid=this.examRule.id(3);
	   if(hol.equals("true") ) {
		   System.out.println("Holticket is campalsery");
	   }else {
		   System.out.println("Holticket is not campalsery");
	   }
   }
}
