package string1;

public class DigitfromString {

	public static void main(String[] args) {
		String s = "5AF9653ABC";
		int m = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				m = m + (ch - 48);
			}
		}
		System.out.println(m);
	}

}
