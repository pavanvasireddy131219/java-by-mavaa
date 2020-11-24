package com.org.onlinetraining.loops;

public class ScoreCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int score=25;
       if(score==100) {
    	   System.out.println("Excellent work!!");
       }
       else if(score>=75)
       {
    	   System.out.println("A Grade::Nice work");
       }
       else if(score>=55)
       {
    	 System.out.println("B Grade ::Good ");  
       }
       else if(score>=35)
       {
    	   System.out.println("C Grade ::Average");
       }
       else
       {
    	   System.out.println(("Fail :: Don't do show in the backbench,you fool!!!"));
       }
	}

}
