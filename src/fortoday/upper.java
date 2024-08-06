package fortoday;

public class upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="pragtJK";
		int u=0;
		int l=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{		
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				
				System.out.println(s.charAt(i));				
				u++;
			}
			else
			{
				System.out.println(s.charAt(i));
				l++;
			}
		}
		
		System.out.println(u);
		System.out.println(l);

	}

}
