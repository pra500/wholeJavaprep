package fortoday;

public class Stringee {
	
	

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String str = "jaba is was";
		
		String[] arr=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString().trim());
	//sb.toString().trim();
		
		
			
		

	}

}
