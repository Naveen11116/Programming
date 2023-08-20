package string1;

public class ReverseOfStrings2 {

	public static void main(String[] args) {

		String s = "java html css";

		String[] obj = s.split(" ");

		for (int i = 0; i < obj.length; i++) {

			System.out.print(reverse(obj[i]));
		}

//		System.out.println(m);
	}

	public static String reverse(String s) {

		String str = "",str2 = " ";
		
		for (int i = 0; i < s.length(); i++) {
			
			str = s.charAt(i)+str;
		}
            str2 = str + str2;
            
		return str2;
	}

}
