package methodhiding;

import staticprac.Child;

public class Grand1 {
	

	public static void main(String[] args) {
		
		
		//https://www.youtube.com/watch?v=VKgDvJXQk2M&ab_channel=DurgaSoftwareSolutions
		
		
		/*
		Parent1 p1=new Parent1();
		p1.set();
				
		
		Parent2 p2=new Parent2();
		p2.set();
		
		
		Parent1 p3=new Parent2();
		p3.set();
		
		/*
		hello
		hello1
		hello1
        */
		
		
		Parent1 p1=new Parent1();
		p1.set();
				
		
		Parent2 p2=new Parent2();
		p2.set();
		
		
		Parent1 p3=new Parent2();
		p3.set();
		
		
		/*
		hello
		hello1
		hello
        */
		
		
		
	
		
		

	}

}
