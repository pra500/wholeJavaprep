package dailyprac;

public class Stringreversaltwowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="java is";
		
		String str1="";
		
		//String[] arr=str.split(" ");
		
		//System.out.println(arr.length);
		
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		
		System.out.println(str1);   //si avaj

		
	}

}
