package Array1;

public class Fetchdisitfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="pay679";
		
		
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				sb.append(str.charAt(i));
				
				
				
			}
		}
		
		System.out.println(sb);

	}
	
	//***************
	//***************
	
	//***************
	
	

}
