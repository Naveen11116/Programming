package string1;

import java.util.Scanner;

public class ReverseString {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" Enter the String ");

		String s = scan.next();
		String str=" ";
		
		s.equals(s);
		
		for (int i = 0; i < s.length(); i++) {
            	
            	str = s.charAt(i) + str;
		}
             System.out.println(str);
	}

}
