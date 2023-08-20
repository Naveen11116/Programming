package string1;

import java.util.Scanner;

public class AlphaDigitSpecialString {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Sting");

		String s = scan.next();

		int count = 0, counter = 0, counting = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				count++;
			}

			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				counter++;
			}

			else {

				counting++;
			}
		}

		System.out.println(count);
		System.out.println(counter);
		System.out.println(counting);
	}

}
