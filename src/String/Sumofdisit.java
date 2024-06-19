package String;

public class Sumofdisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="pragt789RGJ";
		int sum=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
             
			if(Character.isDigit(str.charAt(i)))
			{
				
				String temp=str.substring(i, i+1);
				sum = sum + Integer.parseInt(temp);
				
				
			}
		}
		
		
		System.out.println(sum); //24

	}

}
