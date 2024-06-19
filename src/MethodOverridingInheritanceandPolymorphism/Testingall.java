package MethodOverridingInheritanceandPolymorphism;

public class Testingall {

	public static void main(String[] args) {
			
				
		
		
		//ctp/static  
		//why it's called ctp  - cuz at compile time ll know which mtd needs to be called
		//like below we need to write down if they ask what is ctp
		
		
		 Car c1=new Car();
		 c1.start();
	     c1.stop();
	     
	     System.out.println("---------------");
	     
	     Bmw b1=new Bmw();
	     b1.start();
	     b1.stop();
	     b1.refill();
	   
	     
	     System.out.println("---------------");
	     
	     //rtp/dyn
	     //why it's called rtp  - cuz at run time ll know which mtd needs to be called
	 	 //like below we need to write down if they ask what is rtp
	     
	     
			
	     //top casting/upcasting
	 Car c2=new Bmw();
	 c2.start();
	 c2.stop();
	 
	 
	   System.out.println("111---------------");
	   
	   
	   
	   //downcasting	
	   
	   
	   
	   //here we are making car to bmw, we are casting car to bmw, whole thing is now bmw  
	   //below stmt is not possible, ll throw  java.lang.ClassCastException exception at run time, at compile time no syntax error ll show
	  
	   //Bmw b2=(Bmw)new Car(); 
	   
	   
	 
	   
	   
	   Car c3=new Bmw();
	   Bmw bb=(Bmw) c3; 
	   
	   bb.start();
	   bb.stop();
	   
	   c3.start();
	   c3.stop();
	   
	   
	   
//	   bmw starting
//	   bmw stopping
//	   bmw starting
//	   bmw stopping
	   
	   
	   
	   
	  //ll do for parent 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	     

	}

}
