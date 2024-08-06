package String;

public class Stringss22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="yu89##%bnBN";
		
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);  //yu89bnBN



	}

}
