package string1;

public class VowelString {

	public static void main(String[] args) {
		String s = "java";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if(vowel(s.charAt(i))) {
				
				count++;
		}
	}
		System.out.println(count);
		
	}

	public static boolean vowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {

			return true;
		} else

			return false;
	}

}
