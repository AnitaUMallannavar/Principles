package com.xworkz.statik.practice;

public class Student2 {
    int rollNo;
    String name;
    static String college="Tungal";
   
    public Student2(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void show() {
    	System.out.println("printing about Student2");
    	System.out.println("roll No is: "+this.rollNo);
    	System.out.println("Name is : "+this.name);
    	System.out.println("College : "+Student2.college);
    	//System.out.println(rollNo+""+name+""+college);
    }
    
  /*  public class StdRunner {

    	public static void main(String[] args) {
          Student2 st=new Student2(11,"Ani");
          st.show();
          Student2.college="GG";
          st.show();
    	}

    }*/
    
}
