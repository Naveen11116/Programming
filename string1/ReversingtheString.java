package string1;

public class ReversingtheString {

	public static void main(String[] args) {
	        
		String s = "java html css",str="";
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i)+str;
		}
		System.out.println(str);
	}

}
